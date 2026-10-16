package Packages;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("User input array");
		MergeArray();
		System.out.println("Given Arrays ");
		int[] arr_1 = { 10, 20, 30 };
		int[] arr_2 = { 40, 50, 60 };
		int[] Merge = new int[arr_1.length + arr_2.length];

		for (int i = 0; i < arr_1.length; i++) {
			Merge[i] = arr_1[i];// 10,20,30
		}
		for (int i = 0; i < arr_2.length; i++) {
			Merge[arr_1.length + i] = arr_2[i];
		}
		System.out.println(Arrays.toString(Merge));

	}

	public static void MergeArray() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the first arraysize");
			int value = sc.nextInt();
			int arraysize[] = new int[value];

			System.out.println("Enter the second arraysize");
			int value_1 = sc.nextInt();
			int arraysize_1[] = new int[value_1];

			int[] Merge = new int[arraysize.length + arraysize_1.length];

			for (int i = 0; i < arraysize.length; i++) {
				System.out.println("Enter the first arraysize");
				arraysize[i] = sc.nextInt();
				Merge[i] = arraysize[i];
			}
			for (int i = 0; i < arraysize_1.length; i++) {
				System.out.println("Enter the second arraysize");
				arraysize_1[i] = sc.nextInt();
				Merge[arraysize.length + i] = arraysize_1[i];
			}
			System.out.println(Arrays.toString(Merge));
		}
	}
}
