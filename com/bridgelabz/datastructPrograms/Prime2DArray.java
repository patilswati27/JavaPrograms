package com.bridgelabz.datastructPrograms;

import java.util.ArrayList;
import java.util.Arrays;

import com.bridgelabz.algoPrograms.Util;
import com.bridgelabz.utility.Utility;

public class Prime2DArray {
	static int j;

	public static boolean getPrimeNumbers(int j) {
		if (Util.isPrime(j)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter no of rows");
		int row = Utility.inputInteger();
		System.out.println("Enter no of col");
		int col = Utility.inputInteger();
		int[][] A = new int[12][12];
		int B[] = new int[row * col];
        
		for (int i = 2; i <= 1000 && j<=row*col-1; i++) {
		
				if (getPrimeNumbers(i) == true) {
					B[j] = i;	
					j++;
				}
			}
				int x = 0;
				for (int k = 0; k < row; k++) {
					for (int j = 0; j < col; j++) {
						A[k][j] = B[x];
						x++;
					}
				}
             
				System.out.println("The Final Array is : ");
				for(int i=0; i<row; i++)
				{
					for(j=0; j<col; j++)
					{
						System.out.print(A[i][j]+"\t");
					}
					System.out.println();
				}
			}
		}

	

