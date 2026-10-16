package Packages;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		set_1();
		set_2();
		set_3();
	}

	static void set_1() {
		Set<Integer> st = new HashSet<Integer>();
		st.add(23);
		st.add(34);
		st.add(12);
		st.add(100);
		st.add(89);
		st.add(23);
		Iterator<Integer> it = st.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		st.remove(100);
		System.out.println();
		System.out.println("After removing : " + st);
	}

	static void set_2() {
		Set<Integer> st = new LinkedHashSet<Integer>();
		st.add(23);
		st.add(34);
		st.add(12);
		st.add(100);
		st.add(89);
		st.add(23);
		Iterator<Integer> it = st.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}

	static void set_3() {
		Set<Integer> st = new TreeSet<Integer>();
		st.add(23);
		st.add(34);
		st.add(12);
		st.add(100);
		st.add(89);
		st.add(23);
		Iterator<Integer> it = st.iterator();
		System.out.println("********TreeSet***********");
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println("Size : " +  st.size());
	}

}
