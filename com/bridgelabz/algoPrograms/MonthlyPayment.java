package com.bridgelabz.algoPrograms;

public class MonthlyPayment {

	public static void main(String[] args) {
		float payment=Float.parseFloat(args[0]);
		float Rate=Float.parseFloat(args[1]);
		float Year=Float.parseFloat(args[2]);
		System.out.println(Util.monthlyPayment(payment, Year, Rate));

	}

}
