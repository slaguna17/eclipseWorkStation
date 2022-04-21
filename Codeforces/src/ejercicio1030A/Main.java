package ejercicio1030A;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean easy = true;
		for (int i = 0; i < n && easy; i++) {
			int e = sc.nextInt();
			if (sc.nextInt() == 1) {
				easy = true;
			}
		}
		System.out.println(easy ? "Easy" : "Hard");
	}
}
