package com.bridgelabz.utility;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	static Scanner sc = new Scanner(System.in);

	/**
	 * @return string
	 */
	public static String inputString() {
		try {
			return sc.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * 
	 * @return integer input
	 */
	public static int inputInteger() {
		try {
			return sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("input integer value");
		}
		return 0;
	}

	public static String replaceString(String inputstring) {
		String string1 = "";
		if (inputstring.length() >= 3) {

			String string = "hello, username how are you.";
			string1 = string.replace("username", inputstring);
		} else {
			System.out.println("Username should be greater than three characters");
		}
		return string1;
	}

	/**
	 * @param no to Determine head or tail
	 */
	public static void flipCoin(int no) {
		int headcount = 0;
		int tailcount = 0;
		for (int i = 0; i <= no; i++) {
			if (Math.random() < 0.5) {
				tailcount++;
			} else {
				headcount++;
			}
			;
			int headpercent = (headcount * 100) / no;
			int tailpercent = (tailcount * 100) / no;
			System.out.println("head =" + headpercent + "% vs tail = " + tailpercent + "%");
		}
	}

	/**
	 * @param year To Check year is leap or not @returnSystem.out.println("Enter the
	 *             username");
	 */
	public static Boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}
		return false;
	}

	/**
	 * @param no calculate power of 2
	 */
	public static void power(int no) {
		if (no >= 0 && no < 31) {
			for (int i = 0; i <= no; i++) {
				int x = (int) (Math.pow(2, i));
				System.out.println("2^" + i + " =" + x);
			}
		} else {
			System.out.println("Overflow");
		}
	}

	/**
	 * @param number to calculate harmonic no
	 * @return sum of harmonic no
	 */
	public static double getHarmonicNumber(int number) {
		double sum = 0;
		for (int i = 1; i < number; i++) {
			sum = sum + (1 / (double) i);
		}
		return sum;
	}

	/**
	 * @param no to find prime factor
	 */
	public static void primeFactor(int no) {
		for (int i = 2; i <= no; i++) {

			while (no % i == 0) {
				System.out.print(+i + " ");
				no = no / i;
			}
		}
		if (no < 1) {
			System.out.print(no);
		}
	}

	/**
	 * @param stake  is actual amount
	 * @param goal
	 * @param trials is no of attempts Simulates a gambler who start with $stake to
	 *        reach $goal.
	 */
	public static void gambler(int stake, int goal, int trials) {
		int won = 0;
		int loss = 0;
		int bets = 0;

		for (int i = 0; i < trials; i++) {
			int cash = stake;
			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5) {
					cash++; // win 1
				} else {
					cash--;// loss 1
				}
			}
			if (cash == goal) {
				won++; // check goal achived?
			} else {
				loss--;
			}

		}
		System.out.println("wins " + won + " of trials " + trials);
		int winpercent = (won * 100) / trials;
		int losspercent = (loss * 100) / trials;
		System.out.println("winpercent is " + winpercent);
		System.out.println("losspercent is " + losspercent);
		System.out.println("Average bets " + (bets * 100) / trials);
	}

	/**
	 * @param rows
	 * @param col  TWODARRAY of integers, doubles, or booleans
	 */
	public static void twodArray(int rows, int col) {
		Scanner sc = new Scanner(System.in);
		PrintWriter writer = new PrintWriter(System.out);
		Integer[][] integerarray = new Integer[rows][col];
		Double[][] doublearray = new Double[rows][col];
		Boolean[][] booleanarray = new Boolean[rows][col];

		writer.print("Enter your choice \n");
		writer.print("1.Integer Array \n");
		writer.print("2.Double Array \n");
		writer.print("3.boolean Array \n");
		writer.flush();
		System.out.println();
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			writer.write("Enter the elements\n");
			writer.flush();
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < col; j++) {
					integerarray[i][j] = sc.nextInt();
				}
			}
			printArray(integerarray, rows, col);
			System.out.println();
			twodArray(rows, col);
			break;

		case 2:
			writer.write("Enter the elements\n");
			writer.flush();
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < col; j++) {
					doublearray[i][j] = sc.nextDouble();
				}
			}
			printArray(doublearray, rows, col);
			System.out.println();
			twodArray(rows, col);
			break;

		case 3:
			writer.write("Enter the elements\n");
			writer.flush();
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < col; j++) {
					booleanarray[i][j] = sc.nextBoolean();
				}
			}
			printArray(booleanarray, rows, col);
			System.out.println();
			twodArray(rows, col);
			break;
		default:
			writer.println("Invalid choice");
			writer.flush();
			writer.close();
		}
	}

	/**
	 * @param <T>
	 * @param arrays
	 * @param row 
	 * @param col 
	 * generic method to display array of all types
	 */
	public static <T> void printArray(T[][] arrays, int rows, int col) {
		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays.length; j++) {
				writer.print(arrays[i][j] + " ");
				writer.flush();
			}
			System.out.println();
		}
	}

	/**
	 * @param array to find sum of 3 distict no
	 */
	public static void sumofThreeIntegers(int[] array) {
		int count = 0;
		// check for triplets in array
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int k = j + 1; k < array.length; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						count++;
						System.out.println(array[i] + " + " + array[j] + " + " + array[k] + " = " + "0");
					}
				}
			}
		}
		System.out.println("Number of distinct primeFactor triplets " + count);

	}

	/**
	 * @param x
	 * @param y
	 */
	public static void getDistance(int x, int y) {
		double distance = Math.sqrt((Math.pow(x, x) + Math.pow(y, y)));
		System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + distance);
	}
	/**
	 * @param permutation function
	 * @param str string to calculate permutation using recursive approach
	 * @param x starting index
	 * @param y end index
	 */
	public static void permute(int x, int y, String str) {
		if (x == y) {
			System.out.println(str);
		} else {
			for (int i = x; i < y; i++) {
				str = swap(x, i, str);
				permute(x + 1, y, str);
				str = swap(x, i, str);
			}
		}
	}
	/**
	 * Swap Characters at position
	 * 
	 * @param s string value
	 * @param i position 1
	 * @param j position 2
	 * @return swapped string
	 */
	public static String swap(int i, int j, String s) {
		char array[] = s.toCharArray();
		char temp = 0;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		return String.valueOf(array);
	}
	/**
	 * permutation function using iterative method
	 * 
	 * @param array
	 * @param size
	 * @param n
	 */
	public static String permutation(char[] array, int size) {
		if (size == 1) {
			System.out.println(Arrays.toString(array));
		}
		for (int i = 0; i < size; i++) {
			permutation(array, size - 1);
			// if size is odd, swap first and last
			// element
			if (size % 2 == 1) {
				char temp = array[0];
				array[0] = array[size - 1];
				array[size - 1] = temp;
			}
			// If size is even, swap ith and last element
			else {
				char temp = array[i];
				array[i] = array[size - 1];
				array[size - 1] = temp;
			}
		}
		return Arrays.toString(array);
	}
	/**
	 * getting current time and return it
	 */
	public static long startwatch() {
		return System.nanoTime();
	}
	/**
	 * @return elapsed time
	 */
	public static long elapsedTime(long start) {
		long stop = System.nanoTime();
		//System.out.println(stop);
		return (stop - start);
	}
	/**
	 * Give root of x for a*x*x*+b*x+c
	 */
	public static void getRootOfx() {
		int a, b, c;
		System.out.println("Enter value of a, b and c");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		double delta = (b * b - 4 * a * c);
		double x1 = ((-b + Math.sqrt(delta)) / (2 * a));
		double x2 = ((-b - Math.sqrt(delta)) / (2 * a));
		System.out.println("Root 1 of x " + (int) x1);
		System.out.println("Root 2 of x " + (int) x2);
	}

	/**
	 * @param t temprature (t<50)
	 * @param v speed (v<120)
	 */
	public static void getTemprature(double t, double v) {
		if (t < 50 && v > 3 && v < 120) {
			double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
			System.out.println("Temperature = " + t);
			System.out.println("Wind speed  = " + v);
			System.out.println("Wind chill  = " + w);
		} else {
			System.out.println("improper input");
		}
	}

	/**
	 * @param array Generate random number
	 */
	public static void getRandomNumbers(char array[]) {
		int max = 10000000;
		int count = 0;
		String Coupon = "";
		int random = (int) (Math.random() * max);
		StringBuffer sb = new StringBuffer();
		while (random > 0) {
			sb.append(array[random % array.length]);
			random /= array.length;
			count++;
			// Coupon=sb.toString();
		}
		System.out.println("Random no required " + count);
		System.out.println("Coupon Code: " + Coupon);
	}

}