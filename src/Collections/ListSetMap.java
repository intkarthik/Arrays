package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class ListSetMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListArray();
		LinkedArray();
		Trees();
		Set();
	}

	static void ListArray() {
		// allow duplicates and return in insertion order
		System.out.println("***List***");
		List<Integer> lt = new ArrayList<Integer>();
		lt.add(23);
		lt.add(12);
		lt.add(34);
		lt.add(45);
		lt.add(45);
		lt.add(24);
		System.out.println(lt);
		Iterator<Integer> it = lt.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}

	static void LinkedArray() {
		System.out.println("***Array List***");
		ArrayList<Integer> ll = new ArrayList<Integer>();
		ll.add(12);
		ll.add(100);
		ll.add(67);
		ll.add(34);
		ll.add(4, 23);
		ll.add(1, 90);
		System.out.println("Linked list : " + ll);
		System.out.println("Top of element : " + ll.getFirst());
		System.out.println("Last element : " + ll.getLast());
		System.out.println("Finding based on position : " + ll.get(1));
		System.out.println(ll.contains(100)); // return values in boolean values
		System.out.println("finding index values using  values : " + ll.indexOf(67));
		// System.out.println(ll.lastIndexOf(67));
		System.out.println("Size of array : " + ll.size());
		// System.out.println(ll.isEmpty());
	}

	static void Trees() {
		System.out.println("***Trees***");
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(10, "Karthikeyan");
		mp.put(2, "Ananth");
		mp.put(3, "Arunachalam");
		mp.put(4, "Tamil");
		mp.put(5, "Gokulakannan");
		System.out.println("Hashmap content is : " + mp);
		System.out.println("Get value by key : " + mp.get(3));
		System.out.println("Get all key values : " + mp.keySet());
		System.out.println("Get all the values : " + mp.values());
		System.out.println("Returns a Setfor iterating pairs : " + mp.entrySet());
		System.out.println(mp.containsKey(5));// return values in boolean
		System.out.println(mp.containsValue("Arunachalam")); // return values in boolean
		System.out.println(mp.size());
		mp.replace(4, "Vimal");
		System.out.println("Updating : " + mp);
		// System.out.println(mp.computeIfAbsent(4,"Vijay"));
	}

	static void Set() {
		System.out.println("***Set***");
		LinkedHashSet<Integer> lt = new LinkedHashSet<Integer>();
		lt.addFirst(24);
		lt.addLast(100);
		lt.add(45);
		lt.add(28);
		lt.add(75);
		System.out.println(lt);
		System.out.println(lt.contains(100));
		System.out.println(lt.removeLast());
		System.out.println(lt);
		System.out.println(lt.removeFirst());
		System.out.println(lt);

	}
}
