package longestPalindromeSequence;

public class LongestPalindromeSequence {
	private int[][] m;

	// Version Top Down (mas lenta)
	public int lpsTD(char[] s, int from, int to) {
		m = new int[s.length][s.length];
		if (from == to) {
			return 1;
		} else if (from > to) {
			return 0;
		} else if (m[from][to] > 0) {
			return m[from][to];
		} else if (s[from] == s[to]) {
			m[from][to] = 2 + lpsTD(s, from + 1, to - 1);
		} else {
			if (lpsTD(s, from + 1, to) >= lpsTD(s, from, to - 1)) {
				m[from][to] = lpsTD(s, from + 1, to);
			} else {
				m[from][to] = lpsTD(s, from, to - 1);
			}
		}
		return m[from][to];
	}

	// Version Bottom Up (mas rapida)
	public int lpsBU(char[] s) {
		m = new int[s.length][s.length];
		// llenar la diagonal de 1
		for (int i = 0; i < s.length - 1; i++) {
			m[i][i] = 1;
		}
		// llenar la segunda diagonal de 0
		for (int i = 1; i < s.length - 1; i++) {
			m[i][i - 1] = 0;
		}
		for (int d = 1; d < s.length - 1; d++) {
			for (int i = 0; i < s.length - 1 - d; i++) {
				if (s[i] == s[i + d]) {
					m[i][i + d] = 2 + m[i + 1][i + d - 1];
				} else {
					if (m[i + 1][i + d] >= m[i][i + d - 1]) {
						m[0][s.length - 1] = m[i + 1][i + d];
					} else {
						m[0][s.length - 1] = m[i][i + d - 1];
					}
				}
			}
		}
 		return m[0][s.length - 1];
	}
}
