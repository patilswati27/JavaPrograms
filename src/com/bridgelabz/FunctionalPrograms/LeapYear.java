package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter year to check");
		int year=Utility.inputInteger();
		if(Utility.isLeapYear(year)) {
			System.out.println("Leap year");
		}else {
			System.out.println("Not a leap year");
		}
		
	}

}
