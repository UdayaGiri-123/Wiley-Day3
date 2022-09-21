package com.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> pqueue = new PriorityQueue<>();
		// using add method
		pqueue.add(1);// throws exception
		pqueue.add(5);
		// using offer method
		pqueue.offer(2);// returns false
		System.out.println(pqueue);

		// head is always the small numbers... but not the sorted
	}

}
