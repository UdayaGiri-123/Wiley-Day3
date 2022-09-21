package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Dequeuedemo {
public static void main(String args[]) {
	Deque <Integer> deque = new ArrayDeque<>();
	deque.addFirst(1);
	deque.addLast(5);
	deque.addLast(6);
	deque.addFirst(3);
	deque.addFirst(22);
	deque.add(2);
	//System.out.println(deque);
	deque.removeLast();
	//System.out.println(deque);
	//deque.clear();
	//System.out.println(deque);
	
	//Iterator 
	Iterator <Integer> iterator=deque.iterator();
	while(iterator.hasNext()) {
		System.out.print(iterator.next()+" ");
	}
	
	//descending Iterator
	Iterator <Integer> diterator=deque.descendingIterator();
	while(diterator.hasNext()) {
		System.out.print(diterator.next()+" ");
	}
	
	//peek 
	System.out.print(deque.element());

}
}
