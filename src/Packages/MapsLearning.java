package Packages;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapsLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashmap();
		LinkedHashmap();
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(23, "Macbook Air");
		mp.put(34, "Dell lap");
		mp.put(18, "Hp lap");
		System.out.println("Map content is : " + mp);
		System.out.println(mp.get(18));
		System.out.println(mp.keySet());// return all the key set
		System.out.println(mp.values());// return all the values
		System.out.println(mp.entrySet());

		Map<Integer, String> mp1 = new HashMap<Integer, String>();
		mp1.put(23, "Macbook");
		mp1.put(34, "Dell");
		mp1.put(18, "Hp");
		System.out.println(mp1);
		mp1.putAll(mp);
		System.out.println(mp1);

	}

	static void Hashmap() { // It return in non sequential order
		// put,replace,get,values,entry set,remove
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "One");
		hmap.put(2, "Two");
		hmap.put(3, "Three");
		hmap.put(4, "Four");
		hmap.put(5, "Five");
		System.out.println("Hashmap Content is : " + hmap);
		System.out.println("key = 3 value is :" + hmap.get(3));
		hmap.replace(4, "Fourty");
		System.out.println("Updated value key = 4 is : " + hmap.get(4));
		System.out.println(hmap.values());
		System.out.println(hmap.keySet());
		// hmap.clear();
		System.out.println(hmap);
	}

	static void LinkedHashmap() {// It return in sequential order
		LinkedHashMap<String, Integer> lmap = new LinkedHashMap<String, Integer>();
		lmap.put("Arunachalam", 24);
		lmap.put("Ananth", 23);
		lmap.put("Karthikeyan", 27);
		lmap.put("Tamil", 21);
		System.out.println("LinkedHashmap content is : " + lmap);
		System.out.println("Key = Karthikeyan value is : " + lmap.get("Karthikeyan"));
		System.out.println("All the key values :" + lmap.keySet());
		System.out.println("All the values are : " + lmap.values());

	}

}