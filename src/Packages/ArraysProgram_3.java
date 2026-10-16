package Packages;

import java.util.Arrays;

public class ArraysProgram_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 67, 23, 56, 90, 8, 23, 11 };
		int[] arr_1 = { 32, 11, 67, 100, 32, 67 };
		SearchElement(arr);
		CopyOneArray(arr_1);
		MergeArray(arr, arr_1);
		CountOccurences(arr_1);
		DuplicateElements(arr_1);
		RemoveDuplicates(arr);
		LargestArray(arr_1);
		SmallestArrays(arr);
		CountSum();
		System.out.println("The second largest array is : " + SecondLargest(arr_1));
		System.out.println("The second smallest array is : " + SecondSmallest(arr));
	}

	public static void SearchElement(int[] arr) {
		int find = 90;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == find) {
				System.out.println("The index of " + find + ": " + i);
			}
		}
	}

	public static void CopyOneArray(int[] arr_1) {
		int[] copyArray = new int[arr_1.length];
		for (int i = 0; i < arr_1.length; i++) {
			copyArray[i] = arr_1[i];
		}
		System.out.println(Arrays.toString(copyArray));
	}

	public static void MergeArray(int[] arr, int[] arr_1) {
		int[] result = new int[arr.length + arr_1.length];
		for (int i = 0; i < arr.length; i++) {
			result[i] = arr[i];
		}
		for (int i = 0; i < arr_1.length; i++) {
			result[arr.length + i] = arr_1[i];
		}
		System.out.println(Arrays.toString(result));
	}

	public static void CountOccurences(int[] arr_1) {
		int find = 32;
		int count = 0;
		for (int i = 0; i < arr_1.length; i++) {
			if (arr_1[i] == find)
				count++;
		}
		System.out.println("Count Occurences : " + count);
	}

	public static void DuplicateElements(int[] arr_1) {
		for (int i = 0; i < arr_1.length; i++) {
			for (int j = i + 1; j < arr_1.length; j++) {
				if (arr_1[i] == arr_1[j]) {
					System.out.println("Duplicate Elemnt is : " + arr_1[i]);
				}
			}
		}
	}

	public static void RemoveDuplicates(int[] arr) {
		int[] result = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(result));
		for (int i = 1; i < result.length; i++) {
			int j = i - 1;
			int key = result[i];
			while (j >= 0 && result[j] > key) {
				result[j + 1] = result[j];
				j--;
			}
			result[j + 1] = key;
		}
		System.out.println("Ascending order :" + Arrays.toString(result));
		for (int i = 1; i < result.length; i++) {
			int j = i - 1;
			int key = result[i];
			while (j >= 0 && result[j] < key) {
				result[j + 1] = result[j];
				j--;
			}
			result[j + 1] = key;
		}
		System.out.println("Descending order :" + Arrays.toString(result));
	}

	public static void LargestArray(int[] arr_1) {
		int[] result = Arrays.stream(arr_1).distinct().toArray();
		System.out.println(Arrays.toString(result));
		int max = arr_1[0]; // { 32, 11, 67, 100, 32 }
		for (int i = 0; i < arr_1.length; i++) {
			if (arr_1[i] > max)
				max = arr_1[i];
		}
		System.out.println("The largest array is : " + max);
	}

	public static void SmallestArrays(int[] arr) { // { 67, 23, 56, 90, 8, 23 }
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("The smallest array is : " + min);
	}

	public static void CountSum() {
		int sum = 6;
		int count = 0;
		int[] arr_2 = { 1, 5, 7, -1, 5 };
		for (int i = 0; i < arr_2.length; i++) {
			for (int j = i + 1; j < arr_2.length; j++) {
				if (arr_2[i] + arr_2[j] == sum)
					count++;
			}
		}
		System.out.println("Counting sum of 6 is : " + count);
	}

	public static int SecondLargest(int[] arr_1) { // { 32, 11, 67, 100, 32, 67 }
		int larg = Integer.MIN_VALUE;
		int sec_larg = Integer.MIN_VALUE;
		int n = arr_1.length;
		for (int i = 0; i < n; i++) {
			if (arr_1[i] > larg) {
				sec_larg = larg;
				larg = arr_1[i];
			} else if (arr_1[i] < larg && arr_1[i] > sec_larg) {
				sec_larg = arr_1[i];
			}
		}
		return sec_larg;
	}

	public static int SecondSmallest(int[] arr) { // { 67, 23, 56, 90, 8, 23 }
		int n = arr.length;
		int small = Integer.MAX_VALUE;
		int sec_small = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] < small) {
				sec_small = small;
				small = arr[i];
			} else if (arr[i] > small && arr[i] < sec_small) {
				sec_small = arr[i];
			}
		}
		return sec_small;
	}
}