package Packages;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 30, 10, 39, 34, 30 };
		int count = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate Elements : " + arr[j]);
					count++;
				}
			}
		}
		System.out.println("Counting duplicate numbers :" + count);
		duplicate(arr);
	}

	static void duplicate(int[] arr) {
		Set<Integer> st = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (st.contains(arr[i])) {
				System.out.println(arr[i]);
			}
			st.add(arr[i]);

		}
	}

}
