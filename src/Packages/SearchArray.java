package Packages;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		Search();
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the element : ");
			int[] array = { 11, 20, 10, 29, 30, 45 };
			int target = sc.nextInt();
			int n = array.length;
			boolean isFound = false;
			for (int i = 0; i < n; i++) {
				if (array[i] == target) {
					System.out.println("Same element : " + i);
					isFound = true;
				}
			}
			if (!isFound) {
				System.out.println("Element not found in the array");
			}
		}

	}

	public static void Search() {
		String[] name = { "Karthikeyan", "Gokulakannan", "Arunachalam", "Ananth" };
		String names;
		boolean isFound = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input :");
		names = scanner.nextLine();
		for (int i = 0; i < name.length; i++) {
			if (name[i].equals(names)) {
				System.out.println("Search element : " + i);
				isFound = true;
			}
		}
		if (!isFound) {
			System.out.println("Element not found ");
		}

	}

}
