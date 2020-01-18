package Com.bridgelabz.AlgoPrograms;

import java.util.Arrays;
/**
 * @param It will get String array, start index and end index
 * Give array in sorted order by merge sort algorithm
 */
public class MergeSortAlgo {
	public static void merge(int arr[], int start, int end) {
		int mid;
		if (start < end) {
			mid = (start + end) / 2;
			merge(arr, 0, mid);
			merge(arr, mid + 1, end);
			mergeSort(arr, start, mid, end);
		}
	}

static void mergeSort(int []arr,int start,int mid,int end) {
		int i=start;
		int j=mid+1;
		int k=0;
		int []result=new int[end];
		
		while(i<=mid && j<=end) {
			if(arr[i]<arr[j]) {
				result[k]=arr[i];
				i++;
			}
			else {
				result[k]=arr[j];
				j++;
			}
		k++;	
		}
		    while(arr[i]<mid) {
			  result[k]=arr[i];
			  i++;
			  k++;
		}
		   while(arr[j]<end) {
			 result[k]=arr[j];
			 j++;
			 k++;
	 }
		   
		/*
		 * int index=start; while(index<=k) { arr[index++]=result[k]; k++; }
		 */
		 }
	public static void main(String[] args) {
		int[] array = { 3, 7, 1, 9, 3, 10, 5, 16, 13, 19 };
		merge(array, 0, array.length-1);
		System.out.println("sorted array " + Arrays.toString(array));

	}

}
