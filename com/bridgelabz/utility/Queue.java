package com.bridgelabz.utility;

/**
 * @author swati 
 * Implemented all queue methods using linkedlist
 *
 */
public class Queue {

	static LinkedListMethods list = new LinkedListMethods();

	/**
	 * @param obj to add in queue
	 * @return 
	 */
	public static int enqueue(Object obj) {
		list.add(list, obj);
		return (int) obj;
	}

	/**
	 * @return front element in queue
	 */
	public Object dequeue() {
		return list.pollFirst();
	}
		
	public Object dequeue1(Object obj) {
		return list.remove(list, obj);
	}
		
	/**
	 * Display queue
	 */
	public static void display() {
		list.display();
	}

	/**
	 * @return size of the queue
	 */
	public int size() {
		return list.size();
	}

}
