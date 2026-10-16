package Packages;

import java.util.Arrays;

public class ArraysUsingProgram_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 98, 34, 78, 100, 94, 34, 100, 19 };
		int[] arr_1 = { 39, 18, 101, 56, 39, 24 };
		MergeArrays(arr, arr_1);
		RemoveDuplicateArray(arr);
		SortArray(arr, arr_1);
		SearchElement(arr_1);
		CountOccur(arr);
		// LargestElement(arr_1);
		Find_Duplicate(arr);
		System.out.println("Second Largest Array  is " + SecondLargest(arr_1));
		System.out.println("Second smallest array is :  " + SecondSmallest(arr));
	}

	public static void MergeArrays(int[] arr, int[] arr_1) {
		int[] result = new int[arr.length + arr_1.length];
		for (int i = 0; i < arr.length; i++) {
			result[i] = arr[i];
		}
		for (int i = 0; i < arr_1.length; i++) {
			result[arr.length + i] = arr_1[i];
		}
		System.out.println("Merging two arrays : " + Arrays.toString(result));
	}

	public static void RemoveDuplicateArray(int[] arr) {
		int[] result = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(result));
	}

	public static void SortArray(int[] arr, int[] arr_1) {
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int key = arr[i];
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void SearchElement(int[] arr_1) {
		int find = 101;
		for (int i = 0; i < arr_1.length; i++) {
			if (arr_1[i] == find) {
				System.out.println("Search Element index : " + i);
			}
		}
	}

	public static void CountOccur(int[] arr) {
		int count = 0;
		int Target = 34;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == Target) {
				count++;
			}
		}
		System.out.println("Count Occurences of element : " + count);
	}

	public static void LargestElement(int[] arr_1) {
		int max = arr_1[0];
		for (int i = 0; i < arr_1.length; i++) {
			if (arr_1[i] > max) {
				max = arr_1[i];
			}
		}
		System.out.println("The largest element in given array : " + max);
	}

	public static void Find_Duplicate(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate Elements : " + arr[i]);
				}
			}
		}
	}

	public static int SecondLargest(int[] arr_1) { // 39, 18, 101, 56, 39, 24
		int n = arr_1.length;
		int larg = -1, secLarg = -1;
		for (int i = 0; i < n; i++) {
			if (arr_1[i] > larg) {
				secLarg = larg;
				larg = arr_1[i];
			} else if (arr_1[i] < larg && arr_1[i] > secLarg) {
				secLarg = arr_1[i];
			}
		}
		return secLarg;
	}

	public static int SecondSmallest(int[] arr) { // 98, 34, 78, 100, 94, 34, 100, 19
		int small = Integer.MAX_VALUE;
		int secSmall = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				secSmall = small;
				small = arr[i];
			}
		}
		return secSmall;
	}

}
