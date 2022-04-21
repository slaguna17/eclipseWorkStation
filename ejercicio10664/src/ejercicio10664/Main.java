package ejercicio10664;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		input.nextLine();

		for (int testcases = 0; testcases < m; testcases++) {
			String[] suitcases = input.nextLine().split(" ");
			int suitcasesCount = suitcases.length;
			int[] wi = new int[suitcasesCount + 1];
			int[] p = new int[suitcasesCount + 1];
			int totalWeight = 0;
			for (int i = 1; i <= suitcasesCount; i++) {
				p[i] = Integer.parseInt(suitcases[i - 1]);
				wi[i] = Integer.parseInt(suitcases[i - 1]);
				totalWeight += p[i];
			}

			if (totalWeight % 2 == 0) {
				totalWeight /= 2;
				int[][] suitcaseWeight = new int[suitcasesCount + 1][totalWeight + 1];
				for (int i = 1; i <= suitcasesCount; i++) {
					for (int j = 1; j <= totalWeight; j++) {
						if (j >= wi[i]) {
							suitcaseWeight[i][j] = Math.max(p[i] + suitcaseWeight[i - 1][j - wi[i]],
									suitcaseWeight[i - 1][j]);
						} else {
							suitcaseWeight[i][j] = suitcaseWeight[i - 1][j];
						}
					}
				}
				if (suitcaseWeight[suitcasesCount][totalWeight] == totalWeight) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}
		}
		input.close();
	}
}
