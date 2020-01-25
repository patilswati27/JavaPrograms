package com.bridgelabz.utility;


import java.util.function.Consumer;
import java.util.function.Predicate;


/**
 * @author swati 
 * Implemented all linkedList methods
 *
 */
public class LinkedListMethods {
	static Node head;

	public static class Node {
		private Object data;
		private Node next;
		public Object obj;

		public Node(Object data) {
			this.data = data;
			this.next = null;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}
	}

	/**
	 * @param ls
	 * @param data to add in list
	 */
	public void add(LinkedListMethods ls, Object data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (ls.head == null) {
			head = newNode;
		} else {
			Node last = ls.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		//System.out.println("element added");
	}
	/**
	 * display list data
	 */
	public void display() {
		if (isEmpty()) {
			return;
		}
		Node current = head;
		while (current != null) {
			Consumer<Node> c = a -> System.out.print(a.data + "--->");
			c.accept(current);
			current = current.next;
		}
		Consumer<Node> c = a -> System.out.println(a);
		c.accept(current);

	}

	/**
	 * @return size of list
	 */
	public int size() {
		if (isEmpty()) {
			return 0;
		}
		Node current = head;
		int count = 0; // to hold length of list
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;

	}

	/**
	 * Delete first node of list
	 */
	public void deleteFirstNode() {
		if (head == null) {
			return;
		}
		Node temp = head;
		head = head.next;// removing head node refe from 1st element
		temp.next = null;
	}

	/**
	 * @param list
	 * @param data to search
	 * @return true or false
	 */
	public boolean search(LinkedListMethods list, Object data) {
		if (isEmpty()) {
			return false;
		}
		Node current = head;
		while (current != null) {
			if (current.data.equals(data))
				return true;

			current = current.next;
		}
		return false;

	}

	public Object write() {
		Object data = head.data;
		head = head.next;
		return data;
	}

	/**
	 * @return list is empty or not
	 */
	public static boolean isEmpty() {
		Predicate<Node> p = h -> h == null;
		return p.test(head);
	}

	/**
	 * @param list
	 * @param obj  to remove Remove the object from the list
	 * @return 
	 */
	public Object remove(LinkedListMethods list, Object obj) {
		Node current = head;
		Node previousNode = current;
		do {
			if (obj.equals(head.data)) {
				head = current.next;
			} else if (!current.data.equals(obj)) {
				previousNode = current;
				current = current.next;
			} else {
				previousNode.next = current.next;
				break;
			}
		} while (current != null);
		return previousNode;
	}

	/**
	 * To reversed a list
	 */
	public void reverseList() {
		if (head == null) {
			return;
		}
		Node current = head;
		Node previous = null;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}

	}

	public static void addAfter(Node previousNode, Node newNode) {
		newNode.next = previousNode.next;
		previousNode.next = newNode;

	}

	/**
	 * @param obj to insert Insert object at appropriate position based on previous
	 *            node in the list
	 */
	public void insert(Object obj) {
		Node newNode = new Node();
		newNode.data = obj;
		newNode.next = null;
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			Node previousNode = head;
			if ((head.data.hashCode()) > (obj.hashCode())) {
				newNode.next = current;
				head = newNode;
			} else {
				while (true) {
					if ((current.data.hashCode()) > (obj.hashCode())) {
						addAfter(previousNode, newNode);
						break;
					} else if (current.next == null && (current.data.hashCode()) < (obj.hashCode())) {
						current.next = newNode;
						break;
					}
					if (current.next == null) {
						break;
					}
					previousNode = current;
					current = current.next;
				}
			}
		}
	}

	/**
	 * @return last node of list
	 */
	public static Object getLast() {
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		return current.data;

	}

	/**
	 * @return Retrives and return first node
	 */
	public Object pollFirst() {

		Object obj = head.data;
		head = head.next;
		return obj;
	}

	/**
	 * Remove last node of list
	 */
	public void removeLast() {
		Node current = head;
		Node previousNode = current;
		if (current.next == null) {
			head = null;
			return;
		}
		while (current.next != null) {
			previousNode = current;
			current = current.next;
		}
		previousNode.next = null;

	}
	
	public void add1(LinkedListMethods[] ls, Object data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (head == null) {
			head = newNode;
		} else {
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}

	}
	
	
	public static boolean search(LinkedListMethods[] list, Object data) {
		if (LinkedListMethods.isEmpty()) {
			return false;
		}
		Node current = head;
		while (current != null) {
			if (current.data.equals(data))
				return true;

			current = current.next;
		}
		return false;

	}
	
	public static void remove(LinkedListMethods[] list, Object obj) {
		Node current = head;
		Node previousNode = current;
		do {
			if (obj.equals(head.data)) {
				head = current.next;
			} else if (!current.data.equals(obj)) {
				previousNode = current;
				current = current.next;
			} else {
				previousNode.next = current.next;
				break;
			}
		} while (current != null);
	}
}




