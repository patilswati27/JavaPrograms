package com.bridgelabz.functionalPrograms;

import com.bridgelabz.utility.Utility;

/**
 * @author swati
 *
 */
public class Array2D {

	public static <T> void main(String[] args) {
		System.out.println("Enter no of rows");
      	int rows=Utility.inputInteger();
		System.out.println("Enter no of columns");
		int col=Utility.inputInteger();
		Utility.twodArray(rows, col);
	}
}
