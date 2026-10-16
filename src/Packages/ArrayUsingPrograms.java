package Packages;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUsingPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 100, 100, 98, 100, 76, 94, 45, 119 };
		int[] arr_1 = { 120, 34, 87, 89 };
		ReadAllArrays(arr);// Print all given arrays
		AddArray(arr);// Sum of all given arrays
		CountEvenOdd(arr);// count odd and even numbers
		MergeTwoArrays(arr, arr_1);// merging two arrays
		SearchElement(arr, arr_1);// Searching the element
		ReverseArray(arr, arr_1);// Reversing the given array
		LargestArray(arr);// Find the Largest array
		SmallestArray(arr_1);// Find the Smallest array
		CountOccurences(arr, arr_1);// counting occurrences of given array
		DuplicateElement(arr);// Find duplicate elements
		RemoveDuplicateElement_AfterSorting(arr);// Remove Duplicate elements and sorting
		SortingArray_RemoveDuplicateElement(arr);// sorting elements and removing duplicate elements
		// SortArrayAsc(arr, arr_1);// sorting the arrays in ascending and descending
	}

	public static void ReadAllArrays(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void AddArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("The sum of given array is : " + sum);
	}

	public static void CountEvenOdd(int[] arr) {
		int count = 0;
		int oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			} else {
				oddCount++;
			}
		}
		System.out.println("The count of given even array is : " + count);
		System.out.println("The count of given odd array is : " + oddCount);

	}

	public static void MergeTwoArrays(int[] arr, int[] arr_1) {
		int[] merge_array = new int[arr.length + arr_1.length];
		for (int i = 0; i < arr.length; i++) {
			merge_array[i] = arr[i];
		}
		for (int i = 0; i < arr_1.length; i++) {
			merge_array[arr.length + i] = arr_1[i];
		}
		System.out.println(Arrays.toString(merge_array));
	}

	public static void SearchElement(int[] arr, int[] arr_1) {
		int TargetElement = 45;
		int SecTargetElement = 87;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == TargetElement)
				System.out.println("SearchElement index 45 : " + i);
		}
		for (int i = 0; i < arr_1.length; i++) {
			if (arr_1[i] == SecTargetElement)
				System.out.println("Search Element index 87 is : " + i);
		}
	}

	public static void SortArrayAsc(int[] arr, int[] arr_1) {
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
		for (int i = 0; i < arr_1.length; i++) {
			int j = i - 1;
			int key = arr_1[i];
			while (j >= 0 && arr_1[j] < key) {
				arr_1[j + 1] = arr_1[j];
				j--;
			}
			arr_1[j + 1] = key;
		}
		System.out.println(Arrays.toString(arr_1));
	}

	public static void ReverseArray(int[] arr, int[] arr_1) {
		for (int k = arr.length - 1; k >= 0; k--) {
			System.out.print(arr[k] + " ");
		}
		System.out.println();
		for (int l = arr_1.length - 1; l >= 0; l--) {
			System.out.print(arr_1[l] + " ");
		}
		System.out.println();
	}

	public static void LargestArray(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("The Largest array in given element : " + max);
	}

	public static void SmallestArray(int[] arr_1) {
		int min = arr_1[0];
		for (int i = 0; i < arr_1.length; i++) {
			if (arr_1[i] < min) {
				min = arr_1[i];
			}
		}
		System.out.println("The Smallest array in given element : " + min);
	}

	public static void CountOccurences(int[] arr, int[] arr_1) {
		int Count_Occur = 100;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == Count_Occur) {
				count++;
			}
		}
		System.out.println("Counting occurences of given array 100  : " + count);
		int count_occur = 34;
		int count_SecondArray = 0;
		for (int i = 0; i < arr_1.length; i++) {
			if (arr_1[i] == count_occur) {
				count_SecondArray++;
			}
		}
		System.out.println("Counting occurences of given second array  34 is : " + count_SecondArray);
	}

	public static void DuplicateElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println("Duplicate Element is : " + arr[i]);
				break;
			}
		}

	}

	public static void RemoveDuplicateElement_AfterSorting(int[] arr) {
		int[] result = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(result));
		for (int i = 0; i < result.length; i++) {
			int j = i - 1;
			int key = result[i];
			while (j >= 0 && result[j] > key) {
				result[j + 1] = result[j];
				j--;
			}
			result[j + 1] = key;
		}
		System.out.println(Arrays.toString(result));
	}

	public static void SortingArray_RemoveDuplicateElement(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int key = arr[i];
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		System.out.println(Arrays.toString(arr));
		int[] result = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(result));
	}

}
