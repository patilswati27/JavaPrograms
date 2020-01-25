package com.bridgelabz.datastructPrograms;

import com.bridgelabz.utility.LinkedListMethods;
import com.bridgelabz.utility.Queue;
import com.bridgelabz.utility.QueueImplementedUsingLinkedList;
import com.bridgelabz.utility.Utility;

public class CashCounter {
	public static void main(String[] args) {
		QueueImplementedUsingLinkedList<Integer> queue = new QueueImplementedUsingLinkedList<Integer>();
		System.out.println("Enter people size");
		int people =Utility.inputInteger();

		System.out.println("Hi! Welcome to bank simulation: ");
		for (int i = 0; i < people; i++) {

			queue.enQueue(i);
			queue.service();
			queue.deQueue();
		}
		if (queue.isEmpty()) {
			System.out.println("Queue is empty");
		}
		System.out.println("Bank Closing balance is : " + queue.bankBalance);
	
	}

}