package com.bridgelabz.functionalPrograms;

import com.bridgelabz.utility.Utility;

public class HarmonicNo {

	public static void main(String[] args) {
	System.out.println("Enter number");	
    int number=Utility.inputInteger();
    System.out.println("Sum of Nth no is "+Utility.getHarmonicNumber(number));
   }	

}
