package com.bridgelabz.utility;

public class Stack {

	static LinkedListMethods stack = new LinkedListMethods();

	/**
	 * @param obj to push into stack
	 */
	public static void push(Object obj) {
		stack.add(stack, obj);
	}

	/**
	 * It will remove the obj from stack
	 */
	public void pop() {
		stack.removeLast();
	}

	/**
	 * @return top object from the stack
	 */
	public Object peek() {
		if (stack.isEmpty())
			return "-1";
		Object obj = stack.getLast();
		return obj;
	}

	/**
	 * @return stack is empty or not
	 */
	public static boolean isEmpty() {
		return stack.isEmpty();
	}

	/**
	 * @return size of the stack
	 */
	public int size() {
		return stack.size();
	}

	/**
	 * Display stack data
	 */
	public static void display() {
		stack.display();
	}

	/**
	 * to reverse data
	 */
	public static void Reverse() {
		stack.reverseList();
	}

}
