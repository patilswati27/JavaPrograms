package com.bridgelabz.datastructPrograms;

import java.util.ArrayList;

import com.bridgelabz.algoPrograms.Util;
import com.bridgelabz.utility.Queue;

/**
 * @author swati
 * Displayed anagram no using Queue
 */
public class PrimeAnagramNo {
	static void isPrimeAnagram(ArrayList arr) {

		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (Util.isprimeAnagram(String.valueOf(arr.get(i)), String.valueOf(arr.get(j))) == true) {
					         Queue.enqueue(arr.get(i));
					         Queue.enqueue(arr.get(j));
				}
			}
		}
		System.out.println("Prime Anagram no");
		Queue.display();
	}		

	public static void main(String[] args) {
		ArrayList arr = Util.getPrimeNumbers();
		isPrimeAnagram(arr);

	}

}
