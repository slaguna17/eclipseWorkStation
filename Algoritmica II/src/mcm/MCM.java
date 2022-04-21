package mcm;

public class MCM {
	int [][] m;
	public int mcm(int[] s, int from, int to) {
		if (to-from == 1) {
			return 0;
		} else if (to -from ==2) {
			return s[from] * s[from+1]*s[to];
		} else {
			int min = Integer.MIN_VALUE;
			for (int i = from +1 ; i<to; i++) {
				int op = mcm(s,from, i) + mcm(s,i,to) + s[from]*s[i]*s[to];
				min = Integer.min(min,op);
			}
			return min;
		}
	}
}
