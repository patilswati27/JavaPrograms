package com.bridgelabz.algoPrograms;

import com.bridgelabz.utility.Utility;

/**
 * @author swati
 * According to provided input return day of the week
 *
 */
public class DayOfWeek {

	public static void main(String[] args) {
		System.out.println("Enter month date and year ");
		int month=Utility.inputInteger();
		int date=Utility.inputInteger();
		int year=Utility.inputInteger();
		Util.dayOfWeek(month, date, year);
	}

}
