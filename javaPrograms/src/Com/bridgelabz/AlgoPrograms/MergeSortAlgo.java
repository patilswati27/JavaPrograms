package Com.bridgelabz.AlgoPrograms;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @param It will get int array, start index and end index Give array in
 *        sorted order by merge sort algorithm
 */
public class MergeSortAlgo {
	public static void main(String args[]) {
		int[] arr = { 5, 3, 2, 8, 9, 1, 7, 10, 11, 0 };
		Util.mergeSort(arr, 0, arr.length - 1);
		for (int array : arr) {
			System.out.print(array + " ");
		}
		/*
		 * Stream<int[]>s=Stream.of(arr); s.forEachOrdered(System.out:: println);
		 */
	}

}