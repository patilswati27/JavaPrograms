package com.bridgelabz.functionalPrograms;

import com.bridgelabz.utility.Utility;

public class PrimeFactorization {

	public static void main(String[] args) {
		System.out.println("enter number");
		int number=Utility.inputInteger();
		System.out.println("Prime factors are ");
		Utility.primeFactor(number);

	}

}
