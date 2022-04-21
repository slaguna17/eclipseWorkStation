package grafosII;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Prim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] g = new int[n][n];
		for (int v = 0; v < n; v++) {
			for (int h = 0; h < n; h++) {
				g[v][h] = sc.nextInt();
			}
		}
		PriorityQueue<Edge> q = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			if (g[0][i] > 0) {
				q.add(new Edge(0, i, g[0][i]));
			}
		}
		int[][] mst = new int[n][n];
		boolean[] visited = new boolean[n];
		visited[0] = true;
		int c = 0;
		while (c < n - 1) {
			Edge min = q.poll();
			if (!visited[min.to]) {
				mst[min.from][min.to] = min.weight;
				mst[min.to][min.from] = min.weight;
				visited[min.to] = true;
				for (int i = 0; i < n; i++) {
					if (g[min.to][i] > 0 && !visited[i]) {
						q.add(new Edge(min.to, i, g[min.to][i]));
					}
				}
			}
			c++;
		}
	}
}

class Edge implements Comparable<Edge> {
	public int from, to, weight;

	public Edge(int from, int to, int weight) {
		super();
		this.from = from;
		this.to = to;
		this.weight = weight;
	}

	@Override
	public int compareTo(Edge other) {
		return weight - other.weight;
	}
}
