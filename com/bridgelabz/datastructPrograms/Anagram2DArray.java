package com.bridgelabz.datastructPrograms;

import java.util.ArrayList;
import com.bridgelabz.algoPrograms.Util;

/**
 * @author swati display anagram no in 2D array
 */
public class Anagram2DArray {

	/**
	 * @param arr which contains only prime no
	 * @return Anagram no
	 */
	static boolean isPrimeAnagram(ArrayList arr) {

		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (Util.isAnagram(String.valueOf(arr.get(i)), String.valueOf(arr.get(j)))) {
					return true;
				}
				return false;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int A[][] = new int[m][n];
		int B[][] = new int[m][n];
		int c[] = new int[m * n];
		ArrayList arr = Util.getPrimeNumbers();
		isPrimeAnagram(arr);
	}

}
