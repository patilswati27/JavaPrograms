package com.bridgelabz.datastructPrograms;

import java.util.Scanner;

/**
 * @author swati 
 * Display calender
 */
public class Calender {

	static int[][] calender = new int[5][7];
	static int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	static void initCal() {
		for (int i = 0; i < calender.length; i++) {
			for (int j = 0; j < calender[i].length; j++) {
				calender[i][j] = -10;
			}
		}
	}

	/**
	 * @param m month
	 * display the calender for given month and year
	 */
	public static String display(int m) {
		System.out.println("	Sun	Mon	Tue	Wed	Thu	Fri	Sat");

		for (int row = 0; row < calender.length; row++) {
			for (int j = 0; j < calender[row].length; j++) {
				if (calender[row][j] < 0 || calender[row][j] > month[m - 1]) {
					System.out.print("\t ");
				} else if (calender[row][j] > 0) {
					System.out.print("\t" + calender[row][j] + " ");
				}
			}
			System.out.println("\t");
		}
		return "Calender displayed";
	}

	static void putCalender(int d) {
		int d1 = 1;
		for (int i = d; i < calender[0].length; i++) {
			// System.out.print(d1);
			calender[0][i] = d1++;
		}
		for (int i = 1; i < calender.length; i++) {
			for (int j = 0; j < calender[i].length; j++) {
				calender[i][j] = d1++;
			}
		}

	}

	public static void dispCalender(int m, int y) {
		int d = dayOfWeek(m, y);
		initCal();
		putCalender(d);
		display(m);

	}

	public static int dayOfWeek(int m, int y) {
		int d = 1;
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		//System.out.println("value "+d0);
		return d0;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter month");
		int m = s.nextInt();
		System.out.println("enter year");
		int y = s.nextInt();
		System.out.println();
		System.out.println("Calender "+y);
		dispCalender(m, y);
	}
}
	
