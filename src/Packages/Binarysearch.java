package Packages;

import java.util.ArrayList;
import java.util.Collections;

public class Binarysearch {
	// binary search and manipulations
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Manipulation***");
		Manipulations();
		System.out.println("***Binary Search***");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(32);
		al.add(12);
		al.add(45);
		al.add(10);
		al.add(56);
		System.out.println(al);
		int position = Collections.binarySearch(al, 45);
		System.out.println("Position of 45 is : " + position);

	}

	static void Manipulations() {
		// sort,reverse,swap,maximum,minimum,fill,add all
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(32);
		al.add(12);
		al.add(45);
		al.add(10);
		al.add(56);
		System.out.println("Actual array list : " + al);
		Collections.sort(al);
		System.out.println("Sorting the array list : " + al);

		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 1; i <= 5; i++) {
			arr.add(i);
		}
		System.out.println("Actual array : " + arr);
		Collections.reverse(arr);
		System.out.println("Reversing the array : " + arr);
		Collections.swap(arr, 0, 4);
		System.out.println("Swapping the array list : " + arr);
		Collections.fill(arr, 24);
		System.out.println("Filling the values with 24 : " + arr);

		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		int n = 10;
		for (int i = 1; i <= n; i++) {
			arr1.add(i);
		}
		System.out.println("ArrayList is : " + arr1);
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.addAll(arr1);
		System.out.println("Copy array in another array list : " + arr2);
		int max = Collections.max(arr2);
		System.out.println("Maximum value in array list : " + max);
		int min = Collections.min(arr2);
		System.out.println("Minimum value in array list : " + min);
	}

}
