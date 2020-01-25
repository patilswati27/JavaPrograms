package com.bridgelabz.algoPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.bridgelabz.utility.Utility;

/**
 * @author swati
 * 
 */
public class Util {

	/**
	 * @param string1
	 * @param string2 checked both strings are Anagrams
	 */
	public static boolean isAnagram(String string1, String string2) {
		boolean status;
		BiPredicate<String, String> p = (s1, s2) -> (s1.length() != s2.length());
		p.test(string1, string2);
		status = false;
		char[] array = string1.toLowerCase().toCharArray();
		char[] array1 = string2.toLowerCase().toCharArray();
		Arrays.sort(array);
		Arrays.sort(array1);
		status = Arrays.equals(array, array1);

		if (status) {
			System.out.println(string1 + " and " + string2 + " are anagram");
		} else {
			System.out.println(string1 + " and " + string2 + " are not anagram");
		}
		return false;
	}
	
	public static boolean isprimeAnagram(String string1, String string2) {
		boolean status;
		BiPredicate<String, String> p = (s1, s2) -> (s1.length() != s2.length());
		p.test(string1, string2);
		status = false;
		char[] array = string1.toLowerCase().toCharArray();
		char[] array1 = string2.toLowerCase().toCharArray();
		Arrays.sort(array);
		Arrays.sort(array1);
		status = Arrays.equals(array, array1);

		if (status) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * display total prime numbers present between 1 to 1000
	 */
	public static ArrayList getPrimeNumbers() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int j = 0;
		for (int i = 2; i <= 1000; i++) {
			if (isPrime(i)) {
				arr.add(i);
				j++;
			}
		}
		return arr;
	}

	/**
	 * @param no
	 * @return no is prime or not
	 */
	public static boolean isPrime(int no) {
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				return false;
			}
		}
		return true;
	}

	/*
	 * static void primeNumbers() { List range= (List) IntStream.rangeClosed(2,
	 * 1000); int no=(int) range.forEach(i); int arr=(int)
	 * range.stream().filter(i->i%no!=0).collect(Collectors.toList()); }
	 */

	/**
	 * @param arr to check its elements are anagram or not
	 */
	static void isPrimeAnagram(ArrayList arr) {
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (isAnagram(String.valueOf(arr.get(i)), String.valueOf(arr.get(j))))

					/*
					 * Consumer<Integer> c=s->System.out.println(""+arr.get(i) + " and " +
					 * arr.get(j)+" "); c.accept(s);
					 */

					System.out.print("[" + arr.get(i) + " and " + arr.get(j) + "] ");
			}
		}
	}

	/**
	 * @param arr
	 * @param start starting position
	 * @param last  end
	 * @param val   no to be search
	 * @return int number
	 */
	static int integerBinarySearch(int[] arr, int start, int last, int val) {
		int Start = (int) Utility.startwatch();
		while (start <= last) {
			int mid = start + (last - start) / 2;
			if (arr[mid] == val) {
				return mid;
			}
			if (val < arr[mid]) {
				return integerBinarySearch(arr, start, mid - 1, val);
			} else {
				return integerBinarySearch(arr, mid + 1, last, val);
			}
		}
		System.out.println("elapsed time for integerBinarySearch " + Utility.elapsedTime(Start));
		return -1;
	}

	/**
	 * @param It will get String array, start index, end index and key Give index of
	 *           key value of which will find in array
	 * @return index of key value
	 */
	static int stringBinarySearch(String[] arr, int start, int last, String key) {
		while (start <= last) {
			int mid = start + (last - start) / 2;
			if (arr[mid].hashCode() == key.hashCode()) {
				return mid;
			}
			if (arr[mid].hashCode() < key.hashCode()) {
				return stringBinarySearch(arr, mid + 1, last, key);
			} else {
				return stringBinarySearch(arr, start, mid - 1, key);
			}
		}
		return -1;
	}

	/**
	 * @param It will get integer array, start index and end index Give array in
	 *           sorted order by bubble sort algorithm
	 */
	static void bubbleSortInt(int[] arr, int start, int end) {
		int Start = (int) Utility.startwatch();
		for (int i = 0; i <= arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		/*
		 * Stream<int[]>s1=Stream.of(arr); s1.forEach(System.out :: println);
		 */

		System.out.print("BubbleSort array ");
		for (int no : arr) {
			System.out.print(no + " ");
		}
		System.out.println();
		System.out.println("elapsed time for bubbleSortInt " + Utility.elapsedTime(Start));

	}

	/**
	 * @param It will get string array, start index and end index Give array in
	 *           sorted order by bubble sort algorithm
	 */
	static void bubbleSortStr(String[] arr, int start, int end) {
		int Start = (int) Utility.startwatch();
		for (int i = 0; i <= arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j].hashCode() > arr[j + 1].hashCode()) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Bubblesort string ");
		for (String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("elapsed time for bubbleSortStr " + Utility.elapsedTime(Start));
	}

	/**
	 * @param It will get integer array, start index and end index Give array in
	 *           sorted order by bubble sort algorithm
	 */
	public static void insertionSortInt(int[] arr, int start, int end) {
		int Start = (int) Utility.startwatch();
		for (int i = 1; i <= end; i++)
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		System.out.println("Insertion sort array ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("elapsed time for insertionSortInt " + Utility.elapsedTime(Start));
	}

	/**
	 * @param get String array, start index and end index Give array in sorted order
	 *            by bubble sort algorithm
	 *
	 */
	public static String[] insertionSortStr(String[] arr, int start, int end) {
		int Start = (int) Utility.startwatch();

		for (int i = 1; i <= end; i++)
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j].hashCode() > arr[j + 1].hashCode()) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		System.out.println("Insertion sort String ");
		for (String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("elapsed time for insertionSortStr " + Utility.elapsedTime(Start));
		return arr;
	}

	/**
	 * @param Arr
	 * @param start
	 * @param mid
	 * @param end   Merge small array together
	 */
	static void merge(int Arr[], int start, int mid, int end) {

		// create a temp array
		int temp[] = new int[end - start + 1];
		int i = start, j = mid + 1, k = 0;

		// traverse both arrays and in each iteration add smaller of both elements in
		// temp
		while (i <= mid && j <= end) {
			if (Arr[i] <= Arr[j]) {
				temp[k] = Arr[i];
				k++;
				i++;
			} else {
				temp[k] = Arr[j];
				k += 1;
				j += 1;
			}
		}
		while (i <= mid) {
			temp[k] = Arr[i];
			k++;
			i++;
		}
		while (j <= end) {
			temp[k] = Arr[j];
			k++;
			j++;
		}
		for (i = start; i <= end; i++) {
			Arr[i] = temp[i - start];
		}
	}

	/**
	 * @param Arr start and end are the starting and ending index of current
	 *            interval of Arr
	 */
	public static void mergeSort(int Arr[], int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(Arr, start, mid);
			mergeSort(Arr, mid + 1, end);
			merge(Arr, start, mid, end);
		}
	}

	/**
	 * @param t temprature in celsius
	 */
	static void CelsiusToFahrenheit(int t) {
		int temperature = (t * 9 / 5) + 32;
		System.out.println(t + " Celsius= " + temperature + "F");
	}

	/**
	 * @param t temp in fahrenheit
	 */
	static void FahrenheitToCelsius(int t) {
		int temperature = ((t - 32) * 5) / 9;
		System.out.println(t + " F= " + temperature + "C");
	}

	/**
	 * @param p principl amount
	 * @param y noOfyear
	 * @param r rate of interest
	 * @return monthly payment
	 */
	static double monthlyPayment(float p, float y, float r) {
		float n = 12 * y;
		double rate = r / (12 * 100);
		double payment = p * rate / (1 - Math.pow((1 + rate), -n));
		return payment;
	}

	/**
	 * @param decimal no
	 * @return binary no
	 */
	static int[] toBinary(int no) {
		if (no < 0) {
			throw new IllegalArgumentException("Enter Only positive decimal number");
		}
		int number = no;
		int[] arr = new int[30];
		int index = 0;
		while (no > 0) {
			arr[index++] = no % 2;
			no = no / 2;
		}
		System.out.println("Binary of " + number + " is ");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		return arr;

	}

	/**
	 * @param binary no
	 * @return decimal no
	 */
	static int toDecimal(int[] arr) {
		int dec = 0;
		int j = 7;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				dec = dec + (int) Math.pow(2, j);
			}
			j--;
		}
		return dec;
	}

	/**
	 * @param c nonnegative integer Computes the square root of a nonnegative number
	 *          c using Newton's method:
	 */
	public static void sqrt(int c) {
		double epsilon = 1.0e-15; // relative error tolerance
		double t = c;
		// repeatedly apply Newton update step until desired accuracy is achieved
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}
		System.out.println(t);
	}

	/**
	 * @param m month
	 * @param d date
	 * @param y year return day
	 */
	public static void dayOfWeek(int m, int d, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;
		// System.out.println(d0);
		switch (d0) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("Thuesday");
			break;
		case 3:
			System.out.println("Wenesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		}

	}
}