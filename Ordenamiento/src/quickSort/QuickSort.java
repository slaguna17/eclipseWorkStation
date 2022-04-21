package quickSort;

public class QuickSort {
	public static void sort(Estudiante[] a, int from, int to) {
		if (from >= to - 1) {
			return a;
		} else {
			int pivot = from;
			boolean rightToLeft = true;
			int i = to - 1;
			while (pivot != i) {
				if (rightToLeft) {
					if (a[pivot].compareTo(a[i]) <= 0) {
						i--;
					} else {
						Estudiante temp = a[pivot];
						a[pivot] = a[i];
						a[i] = temp;
						int temp2 = pivot;
						i = temp2 + 1;
						rightToLeft = false;
					}
				} else {
					if (a[pivot].compareTo(a[i]) <= 0) {
						i++;
					} else {
						Estudiante temp = a[pivot];
						a[pivot] = a[i];
						a[i] = temp;
						int temp2 = pivot;
						i = temp2 - 1;
						rightToLeft = true;
					}
				}
			}
		}
	}

}
