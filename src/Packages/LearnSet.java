package Packages;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet { // set return in non sequential order
// add,add all,remove,remove all,size,toArray
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashset();
		Linkedset();
		set();
		Treeset();
	}

	static void set() {
		// set interface with hash set will not follow sequential order
		System.out.println("***Set***");
		Set<Integer> st = new HashSet<Integer>();
		st.add(12);
		st.add(34);
		st.add(10);
		Iterator<Integer> it = st.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Size of set : " + st.size());
		st.remove(34);
		System.out.println(st);// after removing the values
		st.add(56);
		System.out.println(st);
		Set<Integer> st1 = new HashSet<Integer>();
		st1.add(45);
		st1.add(12);// set will not allow duplicate values
		st1.add(32);
		st.addAll(st1);
		// st.retainAll(st1);
		System.out.println(st);

	}

	static void Hashset() {
		System.out.println("***Hashset***");
		HashSet<String> st = new HashSet<String>();
		st.add("Karthik");
		st.add("Vimal");
		st.add("Logu");
		HashSet<String> st1 = new HashSet<String>();
		st1.add("Arunachalam");
		st1.add("Tamil");
		st1.add("Dharun");
		System.out.println(st1.contains("Dharun"));

		st.addAll(st1);
		Iterator<String> it = st.iterator();
		while (it.hasNext()) {
			System.err.println(it.next());
		}
		System.out.println("Size : " + st.size());
		HashSet<Integer> hst = new HashSet<Integer>();
		hst.add(23);
		hst.add(11);
		hst.add(90);
		hst.add(10);
		hst.add(100);
		System.out.println(hst);
	}

	static void Linkedset() {
		// Linked set will return in sequential order
		System.out.println("***Linkedset***");
		LinkedHashSet<String> lst = new LinkedHashSet<String>();
		lst.add("Vijay");
		lst.add("Nagul");
		lst.add("Ganesh");
		lst.add("Ananth");
		LinkedHashSet<String> st = new LinkedHashSet<String>();
		st.add("Karthik");
		st.add("Vimal");
		st.add("Logu");
		System.out.println("First element : " + st.getFirst());
		lst.addAll(st);
		Iterator<String> it = lst.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("first element : " + lst.getFirst());
		System.out.println("Last element : " + lst.getLast());
		System.out.println("Actual size : " + lst.size());
		st.remove("Karthik");
		System.out.println("After removing element size : " + lst.size());
		LinkedHashSet<Integer> hst = new LinkedHashSet<Integer>();
		hst.add(23);
		hst.add(11);
		hst.add(90);
		hst.add(10);
		hst.add(100);
		System.out.println(hst);
	}

	static void Treeset() {
		// tree set will return in sorted order
		System.out.println("***TreeSet***");
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(23);
		tree.add(11);
		tree.add(90);
		tree.add(10);
		tree.add(100);
		System.out.println("Tree content is : " + tree);
		System.out.println("First Element : " + tree.first());
		System.out.println("Last Element : " + tree.last());
		System.out.println("Size of the given element : " + tree.size());
		Iterator<Integer> it = tree.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println("Remove first element : " + tree.pollFirst());
		System.out.println(tree);
		System.out.println("Remove last element : " + tree.pollLast());
		System.out.println(tree);
		System.out.println("Head : " + tree.headSet(90));// head set will return before 90 values
		System.out.println("Tail : " + tree.tailSet(23));// tail set return 23 after values
		System.out.println(tree.subSet(23, 90));
	}

}
