package Com.bridgelabz.AlgoPrograms;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class GuessGame {
	static Scanner sc = new Scanner(System.in);

	static int search(int low, int high) {
		if (high - low == 1) {
			return low;
		} else {
			int mid = low + (high - low) / 2;
			System.out.println("is no is less than " + mid+"?"+ " Enter true or false");
			try {
				boolean status = sc.nextBoolean();
				if (status == true) {
					return search(low, mid);
				} else {
					return search(mid, high);
				}
			} catch (InputMismatchException e) {
				System.out.println("input proper string ");
			}

		}
		return 0;
	}

	public static void main(String args[]) {
		int no = Integer.parseInt(args[0]);
		int n = (int) Math.pow(2, no);
		System.out.printf("Think of an integer number between %d and %d\n", 1, n - 1);
		int number = search(0, n);
		System.out.printf("Your number is %d\n",number);
	}

}
