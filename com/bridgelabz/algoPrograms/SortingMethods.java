package com.bridgelabz.algoPrograms;

import com.bridgelabz.utility.Utility;

/**
 * @author swati display output of all sorts methods and binary search method
 */
public class SortingMethods {

	public static void main(String[] args) {
		int[] arr = { 7, 3, 4, 6, 8, 9, 11, 1, 12, 19 };
		String[] array = { "ab", "abc", "zfg", "u", "c" };

		Util.bubbleSortInt(arr, 0, arr.length);
		Util.bubbleSortStr(array, 0, arr.length);
		Util.insertionSortInt(arr, 0, array.length - 1);
		Util.insertionSortStr(array, 0, array.length - 1);
		System.out.println();
		System.out.println("output of IntegerBinarySearch method");
		int Start = (int) Utility.startwatch();
		System.out.println("value present at index " + Util.integerBinarySearch(arr, 0, arr.length - 1, 3));
		System.out.println("elapsed time for integerBinarySearch " + Utility.elapsedTime(Start));
		System.out.println("output of StringBinarySearch method");
		int Start1 = (int) Utility.startwatch();
		System.out.println("string present at " + Util.stringBinarySearch(array, 0, array.length - 1, "c"));
		System.out.println("elapsed time for StringBinarySearch " + Utility.elapsedTime(Start1));

	}

}
