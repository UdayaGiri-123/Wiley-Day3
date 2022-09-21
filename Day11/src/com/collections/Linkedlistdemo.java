package com.collections;

import java.util.LinkedList;

public class Linkedlistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// uses linkedlist to store elements.
		// LinkedList class extends AbstractSequentialList and
		// implements the List, Deque, Cloneable, Serializable interfaces. Like
		// ArrayList, LinkedList is also not synchronized.
		LinkedList<Integer> list = new LinkedList<>();
		list.addFirst(1);
		list.addLast(5);
		list.addLast(6);
		list.addFirst(3);
		list.addFirst(22);
		list.add(2); 	
		list.set(0, null);
		System.out.println(list.get(0));
	}

}
