package com.bridgelabz.functionalPrograms;

import java.util.Arrays;

public class StringReverse {
public static void main(String args[]) {
	java.lang.String s="Hi Hello Swati";
    char[] array= s.toCharArray();
    int last=0;
    last=array.length-1;
    for (int start=0;start < last;start++,last--) 
    { 
        char temp = array[start]; 
        array[start] = array[last]; 
        array[last]=temp; 
    } 
    for(char c : array) 
        System.out.print(c); 
    System.out.println(); 
} 
}
	
	/*
	 * public static void main(String[] args) { String outString=""; String
	 * s="Hi Hello Swati"; char [] words=s.toCharArray(); for(int
	 * i=words.length-1;i>=0;i--) { outString=outString+words[i]+""; }
	 * System.out.println(outString); }
	 */

