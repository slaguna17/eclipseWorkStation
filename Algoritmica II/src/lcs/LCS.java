package lcs;

public class LCS {
	private int[][] m;

	public int lcs(String w1, String w2) {
		m = new int[w1.length()][w2.length()];
		for (int i = 0; i < w1.length(); i++) {
			for (int j = 0; j < w2.length(); j++) {
				m[i][j] = Integer.MIN_VALUE;
			}
		}
		return lcstd(w1.toCharArray(), w2.toCharArray(), 0, 0);
	}

	private int lcstd(char[] w1, char[] w2, int from1, int from2) {
		if (from1 == w1.length || from2 == w2.length) {
			return 0;
		} else if (m[from1][from2] > 0) {
			return m[from1][from2];
		} else if (w1[from1] == w2[from2]) {
			m[from1][from2] = 1 + lcstd(w1, w2, from1 + 1, from2 + 1);
			return m[from1][from2];
		} else {
			int a1 = lcstd(w1, w2, from1 + 1, from2);
			int a2 = lcstd(w1, w2, from1 + 1, from2 + 1);
			m[from1][from2] = a1 > a2 ? a1 : a2;
			return m[from1][from2];
		}
	}

	private int lcsbu(String w1, String w2) {
		int[][] m = new int[w1.length() + 1][w2.length() + 1];
		for (int v = w1.length() - 1; v >= 0; v--) {
			for (int h = w2.length() - 1; h >= 0; h--) {
				if (w1.charAt(v) == w2.charAt(h)) {
					m[v][h] = 1 + m[v + 1][h + 1];
				} else {
					m[v][h] = m[v + 1][h + 1] > m[v][h + 1] ? m[v + 1][h] : m[v][h + 1];
				}
			}    
		}
		return m[0][0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
