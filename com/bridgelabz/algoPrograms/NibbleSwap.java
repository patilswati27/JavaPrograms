package com.bridgelabz.algoPrograms;

/**
 * @author swati
 * get binary no swap its nibble and display its decimal no
 */
public class NibbleSwap {
	public static void nibbleSwap(int[] arr) {
		int i = 0, j = 4;
		while (i < 4) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j++;
		}
		int no = Util.toDecimal(arr);
		System.out.println("\nDecimal no after nibbleswaping is " + no);
	}

	public static void main(String[] args) {
		int[] binary = Util.toBinary(11);
		nibbleSwap(binary);

	}

}
