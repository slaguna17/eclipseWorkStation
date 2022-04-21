package floydWarshall;

public class FloydWarshall {
	private int[][][] m;

	public int[][] fwtd(int[][] g) {
		m = new int[g.length][g.length][g.length];
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < g.length; j++) {
				if (g[i][j] == 0) {
					g[i][j] = Integer.MAX_VALUE;
				}
			}
		}
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < g.length; j++) {
				fwtd(g, g.length - 1, i, j);
			}
		}
		return m[g.length - 1];
	}

	public int fwtd(int[][] g, int k, int i, int j) {
		if (k == -1) {
			return g[i][j];
		} else if (i == j) {
			return 0;
		} else if (m[k][i][j] == 0) {
			int d = fwtd(g, k - 1, i, j);
			int ind;
			if (fwtd(g, k - 1, i, k) == Integer.MAX_VALUE || fwtd(g, k - 1, k, j) == Integer.MAX_VALUE) {
				ind = Integer.MAX_VALUE;
			} else {
				ind = fwtd(g, k - 1, i, k) + fwtd(g, k - 1, k, j);
			}
			m[k][i][j] = Integer.min(d, ind);
		}
		return m[k][i][j];
	}

	public int[][] fwbu(int[][] g) {
		int[][][] m = new int[g.length][g.length][g.length];
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < g.length; j++) {
				if (i != j) {
					if (g[i][0] == Integer.MAX_VALUE || g[0][j] == Integer.MAX_VALUE) {
						m[0][i][j] = g[i][j];
					} else {
						m[0][i][j] = Integer.min(g[i][j], g[i][0] + g[0][j]);
					}
				}
			}
		}
		for (int k = 1; k < g.length; k++) {
			for (int i = 0; i < g.length; i++) {
				for (int j = 0; j < g.length; j++) {
					if (m[k - 1][i][k] == Integer.MAX_VALUE || m[k - 1][k][j] == Integer.MAX_VALUE) {
						m[k][i][j] = m[k - 1][i][j];
					} else {
						m[k][i][j] = Integer.min(m[k - 1][i][j], m[k - 1][i][k] + m[k - 1][k][j]);
					}
				}
			}
		}
		return m[g.length - 1];
	}
}
	

	// sin memoization
//	public int fwtd(int[][] grafo, int k, int i, int j) {
//		if (k == -1) {
//			return grafo[i][j];
//		} else if (i == j) {
//			return 0;
//		} else if (m[k][i][j] == 0) {
//			int d = fwtd(grafo, k - 1, i, j);
//			int ind = fwtd(grafo, k - 1, i, k) + fwtd(grafo, k - 1, k, j);
//
//		}
//
//	}

