package com.bridgelabz.utility;

import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LinkedListMethods {
static Node head;
	
	public static class Node{
		private Object data;
		private Node next;
		
	public Node(Object data) {
		this.data=data;
		this.next=null;
	}		
}

public void add(LinkedListMethods ls,Object data) {
	Node newNode =new Node(data);
	newNode.next=null;
	if(ls.head==null) {
		head=newNode;
	}
	else {
		Node last=ls.head;
		while(last.next!=null) {
			last=last.next;
		}
		last.next=newNode;
	}
		
}
public void display() {
	if(isEmpty()) {
		return;
	}
	Node current=head;
	while(current!=null) {
		Consumer<Node>c=a->System.out.print(a.data+"--->");
		c.accept(current);
		current=current.next;
	}
	Consumer<Node>c=a->System.out.println(a);
	c.accept(current);
	
}
public int size() {
	if(isEmpty()) {
		return 0;
		}
	Node current=head;
	int count=0; //to hold length of list
	while(current!=null) {
		count++;
	current=current.next;	
	}
	return count;
	
}
public Node deleteFirstNode(Node head) {
	if(head==null) {
		return head;
	}
	Node temp=head;
	head=head.next;//removing head node refe from 1st element 
	temp.next=null;
	return temp;
	
  }

	public boolean search(LinkedListMethods list, Object data) {
		if(isEmpty()) {
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

	public static boolean isEmpty() {
		Predicate<Node> p = h -> h == null;
		return p.test(head);
	}

	public void remove(LinkedListMethods list, Object obj) {
		Node current = head;
		Node previousNode = current;
		do {
			if (obj.equals(head.data)) {
				head = current.next;
			}
			 else if(!current.data.equals(obj)) {
				previousNode = current;
				current = current.next;
			}else {
				previousNode.next = current.next;
				break;
			}
		}while(current!=null);
	}	

	public void sortList(LinkedListMethods list) {
		Node current = head;
		Node index = null;
		Object temp;

		if (isEmpty()) {
			return;
		} else {
			while (current != null) {
				index = current.next;

				if (index != null) {
					temp = current.data;
					current.data = index.data;
					index.data = temp;
				}
				index = index.next;
			}
			current = current.next;
		}
}
}
	