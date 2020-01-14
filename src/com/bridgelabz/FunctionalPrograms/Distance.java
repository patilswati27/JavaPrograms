package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.utility.Utility;

/**
 * @author swati
 * Prints the distance from (x, y) to the origin, where x and y
 * are integers.
 */
public class Distance 
{
	public static void main(String[] args) {
	int x=Integer.parseInt(args[0]);
	int y=Integer.parseInt(args[1]);
	//System.out.println("first arg is "+x);
	Utility.getDistance(x, y);
	
	}

}
