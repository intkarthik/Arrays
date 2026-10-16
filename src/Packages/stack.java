package Packages;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack {
//First in First Out
	public static void main(String[] args) {// push,pop,peek,search,empty
		// TODO Auto-generated method stub
		System.out.println("***Stack Example***");
		StackExample();
		queue();
		Stack<Integer> mylist = new Stack<>();
		mylist.push(12);
		mylist.push(34);
		mylist.push(45);
		System.out.println("Stack content is : " + mylist);
		mylist.pop();// 45 stack will be removed
		mylist.push(56);
		mylist.push(33);
		System.out.println(mylist);
		System.out.println("Top of the statck is : " + mylist.peek());
		// System.out.println("Position at the top of the stack is : " +
		// mylist.search(1));
		System.out.println(mylist.empty());
		for (int i : mylist) {
			if (i % 2 != 0) {
				System.out.println("Given statck is odd : " + i);
			}
		}
		System.out.println(mylist.getFirst());
	}

	static void queue() {
		Queue<Integer> mylist = new LinkedList<Integer>();
		mylist.offer(12); // offer,add is used to add the elements in queue
		mylist.offer(34); // peek is used to return first element in queue
		mylist.offer(11); // poll is used to print and remove the first element
		mylist.offer(45);
		System.out.println("Queue content is : " + mylist);
		System.out.println("First element is : " + mylist.peek());
		System.out.println("Queue content is : " + mylist.poll());
		System.out.println(mylist);
	}

	static void StackExample() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(23);
		stack.push(12);
		stack.push(90);
		stack.push(76);
		System.out.println("Stack content is : " + stack);
		int removed = stack.pop();// pop will remove top of the stack
		System.out.println("Removed :" + removed);
		System.out.println(stack);
		System.out.println("Top of the Element :" + stack.peek());// peek will print the top of element
	}
}
