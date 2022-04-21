package countingSort;

public class CountingSort {
	public static int[] sort(int[] a, int k) {
		int[] b = new int[a.length];
		int[] c = new int[k + 1];
		for (int x : a) {
			c[x]++;
		}
		for (int i = 1; i <= k; i++) {
			c[i] += c[i - 1];
		}
		for (int i = a.length - 1; i >= 0; i--) {
			b[c[a[i]] - 1] = a[i];
			c[a[i]]--;
		}
		return b;
	}

	public static void main(String[] args) {
		int[] a = { 5, 7, 3, 4, 0, 6, 4, 5, 7, 3, 5 };
		int[] b = sort(a, 7);
		for (int x : b) {
			System.out.print(x + " ");
		}
	}
}
