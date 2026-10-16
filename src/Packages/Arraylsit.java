package Packages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Arraylsit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraylist();
		EvenOdd();
		ArrayList<Integer> mylist = new ArrayList<>();
		mylist.add(0, 34);
		mylist.add(1, 12);
		mylist.add(2, 45);
		mylist.add(3, 23);
		mylist.add(4, 56);
		System.out.println("List content is : " + mylist);
		for (int result : mylist) {
			System.out.print(result + " ");
		}
		System.out.println();
		mylist.remove(2);
		System.out.println("List content is : " + mylist);
		ArrayList<Integer> mylist1 = new ArrayList<Integer>();
		mylist1.addAll(mylist);// adding all the elements from the other list by using add all method
		System.out.println("List 1 content is : " + mylist1);
	}

	static void EvenOdd() {
		int[] numbers = { 10, 99, 45, 12, 75, 34 };
		for (int result : numbers) {
			if (result % 2 == 0) {
				System.out.println("The number is even " + result);
			} else
				System.out.println("The number is odd: " + result);
		}
	}

	static void Arraylist() {
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		mylist.add(45);
		mylist.add(32);
		mylist.add(11);
		mylist.add(100);
		System.out.println(mylist);
		Collections.sort(mylist);
		System.out.println("Sorted order : " + mylist);
		
	}

}
