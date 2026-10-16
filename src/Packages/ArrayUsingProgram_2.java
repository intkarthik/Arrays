package Packages;

import java.util.Arrays;

public class ArrayUsingProgram_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr_1 = { 23, 9, 100, 98, 45, 66, 9 };
		int[] arr_2 = { 45, 23, 34, 90, 11 };
		EvenOdd(arr_1);
		SearchElement(arr_1);
		CopyInAnother(arr_2);
		MergeTwoArrays(arr_1, arr_2);
	}

	public static void EvenOdd(int[] arr_1) {
		for (int i = 0; i < arr_1.length; i++) {
			if (arr_1[i] % 2 == 0) {
				System.out.println(arr_1[i]);
			}
		}
		int count = 0;
		for (int i = 0; i < arr_1.length; i++) {
			if (arr_1[i] % 2 != 0) {
				count++;
			}
		}
		System.out.println("Count given odd numbers : " + count);
	}

	public static void SearchElement(int[] arr_1) {
		int search = 66;
		for (int i = 0; i < arr_1.length; i++) {
			if (arr_1[i] == search) {
				System.out.println("The index of search element : " + i);
			}
		}
	}

	public static void CopyInAnother(int[] arr_2) {
		int[] CopyArray = new int[arr_2.length];
		for (int i = 0; i < arr_2.length; i++) {
			CopyArray[i] = arr_2[i];
		}
		System.out.println(Arrays.toString(CopyArray));
	}

	public static void MergeTwoArrays(int[] arr_1, int[] arr_2) {
		int[] result = new int[arr_1.length + arr_2.length];
		for (int i = 0; i < arr_1.length; i++) {
			result[i] = arr_1[i];
		}
		for (int i = 0; i < arr_2.length; i++) {
			result[arr_1.length + i] = arr_2[i];
		}
		System.out.println(Arrays.toString(result));
	}

}
