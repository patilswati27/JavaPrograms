package com.bridgelabz.datastructPrograms;

import java.util.InputMismatchException;
import java.util.function.Predicate;

import com.bridgelabz.utility.Queue;
import com.bridgelabz.utility.Utility;

/**
 * @author swati
 * check string for palindrome using queue
 */
public class PalindromeChecker {

	public static boolean ispalindrome(String str) {
		Queue Q = new Queue();
		String[] words = str.split("");
		for (int i = 0; i < words.length; i++) {
			Q.enqueue(words[i]);
		}
		// Q.display();
		int j = words.length - 1;
		int count = 0;
		while (Q.size() > 0) {
			if (Q.dequeue().equals(words[j])) {
				count++;
				j--;
			}
		}
		Predicate<Integer> p = s -> s == words.length;
		return p.test(count);
	}

	public static void main(String[] args) {
		try {
			System.out.println("Enter string ");
			String str = Utility.inputString();

			if (ispalindrome(str)) {
				System.out.println(str + " is palindrome");
			} else {
				System.out.println(str + " is not palindrome");
			}

		} catch (InputMismatchException e) {
			System.out.println("Enter only string ");
		}

	}

}
