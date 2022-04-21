package grafosII;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Kruskal {
	public static int buscarJefe(int v, int[] jefes) {
		while (v != jefes[v]) {
			v = jefes[v];
		}
		return v;
	}

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
		for (int v = 0; v < n; v++) {
			for (int h = v + 1; h < n; h++) {
				if (g[v][h] > 0) {
					q.offer(new Edge(v, h, g[v][h]));
				}
			}
		}
		int[][] mst = new int[n][n];
		int c = 0;
		int[] jefesDeArbol = new int[n];
		for (int i = 0; i < n; i++) {
			jefesDeArbol[i] = i;
		}
		while (c < n - 1) {
			Edge min = q.poll();
			int jefe1 = buscarJefe(min.from, jefesDeArbol);
			int jefe2 = buscarJefe(min.to, jefesDeArbol);
			if (jefe1 != jefe2) {
				mst[min.from][min.to] = min.weight;
				mst[min.to][min.from] = min.weight;
				c++;
				jefesDeArbol[jefe1] = jefe2;
				
			}
		}
	}
}
