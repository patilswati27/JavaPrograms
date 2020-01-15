package com.bridgelabz.functionalPrograms;

import com.bridgelabz.utility.Utility;

public class Permutation {

	public static void main(String[] args) {
		System.out.println("Enter string");		
		java.lang.String str=Utility.inputString();
		System.out.println("Permutation of string using recursive approach");
		Utility.permute(0, str.length(),str);
		char[] array=str.toCharArray();
		System.out.println("permutation of string using iterative approach ");
		Utility.permutation(array,str.length());		
	}

}
