package ejercicio118D;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int k1 = sc.nextInt();
		int k2 = sc.nextInt();
		System.out.println(cl(n1, n2, k1, k2));
	}

	public static int cl(int n1, int n2, int k1, int k2) {
		return clR(n1, n2, k1, k2, 0, 0);
	}

	public static int clR(int n1, int n2, int k1, int k2, int c1, int c2) {
		if (n1 == 0 && n2 == 0) {
			return 1;
		} else {
			// poner un soldado
			int s = 0;
			if (c1 < k1 && n1 > 0) {
				s = clR(n1 - 1, n2, k1, k2, c1 + 1, 0);
			}
			// poner un jinete
			int j = 0;
			if (c2 < k2 && n2 > 0) {
				j = clR(n1, n2 - 1, k1, k2, 0, c2 + 1);
			}
			return s + j;
		}
	}

}
