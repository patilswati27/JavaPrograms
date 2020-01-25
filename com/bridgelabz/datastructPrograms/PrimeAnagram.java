package com.bridgelabz.datastructPrograms;

import java.util.ArrayList;

import com.bridgelabz.algoPrograms.Util;
import com.bridgelabz.utility.Stack;

/**
 * @author swati
 * display prime Anagram numbers using stack 
 */
public class PrimeAnagram {

	static void isPrimeAnagram(ArrayList arr) {

		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (Util.isprimeAnagram(String.valueOf(arr.get(i)), String.valueOf(arr.get(j))) == true) {
					Stack.push(arr.get(i));
					Stack.push(arr.get(j));
				}
			}
		}
		Stack.display();
		Stack.Reverse();
		System.out.println("Reversed anagrams no ");
		Stack.display();
	}

	public static void main(String[] args) {
		ArrayList arr = Util.getPrimeNumbers();
		isPrimeAnagram(arr);

	}

}
