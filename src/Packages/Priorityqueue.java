package Packages;

import java.util.PriorityQueue;
import java.util.*;

public class Priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(23);
		pq.add(5);
		pq.add(34);
		pq.add(11);
		pq.add(7);
		System.out.println("Priority queue is : " + pq);
		Iterator<Integer> iterator = pq.iterator();
		while (iterator.hasNext()) {
			System.out.print(pq.poll() + " ");
		}
	}

}
