package Com.bridgelabz.AlgoPrograms;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @param It will get int array, start index and end index Give array in
 *        sorted order by merge sort algorithm
 */
public class MergeSortAlgo {
	static void merge(int Arr[], int start, int mid, int end) {

		// create a temp array
		int temp[] = new int[end - start + 1];
		int i = start, j = mid + 1, k = 0;

		// traverse both arrays and in each iteration add smaller of both elements in
		// temp
		while (i <= mid && j <= end) {
			if (Arr[i] <= Arr[j]) {
				temp[k] = Arr[i];
				k++;
				i++;
			} else {
				temp[k] = Arr[j];
				k += 1;
				j += 1;
			}
		}
// add elements left in the first interval
		while (i <= mid) {
			temp[k] = Arr[i];
			k++;
			i++;
		}

		// add elements right in the second interval
		while (j <= end) {
			temp[k] = Arr[j];
			k++;
			j++;
		}

		// copy temp to original interval
		for (i = start; i <= end; i++) {
			Arr[i] = temp[i - start];
		}
	}
	// start and end are the starting and ending index of current interval of Arr

	static void mergeSort(int Arr[], int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(Arr, start, mid);
			mergeSort(Arr, mid + 1, end);
			merge(Arr, start, mid, end);
		}
	}

	public static void main(String args[]) {
		int[] arr = { 5, 3, 2, 8, 9, 1, 7, 10, 11, 0 };
		mergeSort(arr, 0, arr.length - 1);
		for (int array : arr) {
			System.out.print(array + " ");
		}
		/*
		 * Stream<int[]>s=Stream.of(arr); s.forEachOrdered(System.out:: println);
		 */
	}

}