package Packages;

import java.util.Arrays;

public class DupliateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new String("karthikeyan");
		int count = 0;
		char ch[] = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("Duplicate Elements : " + ch[j]);
					count++;
				}
			}
		}
		System.out.println("Counting duplicate elements : " + count);

	}

}
