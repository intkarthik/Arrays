package Packages;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("User input to sort the element in asc ");
		sortArray();
		int[] value = { 100, 30, 40, 67 };
		for (int i = 1; i < value.length; i++) {
			int j = i - 1;
			int key = value[i];
			while (j >= 0 && value[j] > key) {
				value[j + 1] = value[j];
				j--;
			}
			value[j + 1] = key;
		}
		System.out.println(Arrays.toString(value));
	}

	public static void sortArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the arraysize : ");
		int value = sc.nextInt();
		int[] arraysize = new int[value];

		for (int i = 1; i < arraysize.length; i++) {
			System.out.println("Enter the arrays to sort the elements ");
			arraysize[i] = sc.nextInt();
			int j = i - 1;
			int key = arraysize[i];
			while (j >= 0 && arraysize[j] > key) {
				arraysize[j + 1] = arraysize[j];
				j--;
			}
			arraysize[j + 1] = key;
		}
		System.out.println(Arrays.toString(arraysize));
	}

	public static void DescArray(int[] value) {

		for (int i = 1; i < value.length; i++) {

			int j = i - 1;
			int key = value[i];
			while (j >= 0 && value[j] < key) {
				value[j + 1] = value[j];
				j--;
			}
			value[j + 1] = key;
		}
		System.out.println(Arrays.toString(value));
	}

}
