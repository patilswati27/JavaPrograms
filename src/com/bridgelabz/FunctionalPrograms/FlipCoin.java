package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.utility.Utility;

/**
 * @author swati
 *
 */
public class FlipCoin {

	public static void main(String[] args) {
		System.out.println("Enter number ");
		int number=Utility.inputInteger();
		System.out.println(number);
		Utility.flipCoin(number);
	   }
	}


