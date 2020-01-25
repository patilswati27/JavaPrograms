package com.bridgelabz.algoPrograms;

import java.util.ArrayList;

/**
 * @author swati
 * display prime no which are angram
 */
public class PrimeAnagram {

	public static void main(String[] args) {
	ArrayList arr=Util.getPrimeNumbers();
	Util.isPrimeAnagram(arr);
   }
}
