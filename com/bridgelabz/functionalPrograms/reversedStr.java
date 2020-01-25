package com.bridgelabz.functionalPrograms;

public class reversedStr {

	public static void main(String[] args) {
		String str="hi swati hello";
		String[] words = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++)
	        {
	           java.lang.String word = words[i]; 
	           java.lang.String reverseWord = "";
	           for(int j =word.length()-1; j >= 0; j--) 
		   {
			reverseWord = reverseWord+word.charAt(j);
		   }
		   reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);

	}

	}



