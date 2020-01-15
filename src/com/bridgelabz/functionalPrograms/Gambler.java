package com.bridgelabz.functionalPrograms;

import com.bridgelabz.utility.Utility;

public class Gambler {

	public static void main(String[] args) {
		System.out.println("Enter stake amount");
		int stake=Utility.inputInteger();
		System.out.println("Enter goal");
		int goal=Utility.inputInteger();
		System.out.println("Enter no of trials to attempt ");
		int trials=Utility.inputInteger();
		Utility.gambler(stake, goal, trials);

	}

}
