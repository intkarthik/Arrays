package Packages;

import java.util.Scanner;

public class Searchelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("User input to search an element ");
		search();
		int[] arr = { 28, 45, 78, 56, 98 };
		int target = 56;
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("Target Element is : " + i);
				found = true;
			}
		}

	}

	public static void search() {
		// boolean found = false;
		try (Scanner sc = new Scanner(System.in)) {
			 System.out.println("Enter the arraysize : ");
			int value = sc.nextInt();
			int[] arraysize = new int[value];

			for (int i = 0; i < arraysize.length; i++) {
				System.out.println("Enter the array values ");
				arraysize[i] = sc.nextInt();
				if (arraysize[i] == 67) {
					System.out.println("Target element is : " + i);
					break;
				}
			}
		}
	}

}
