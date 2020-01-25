package com.bridgelabz.datastructPrograms;

import java.util.ArrayList;

/**
 * @author swati 
 * Display no of possible BST for given number
 */
public class BinarySearchTree {
//public Node root;

	/*
	 * public class Node { int data; Node left, right = null;
	 * 
	 * Node(int val) { this.data = val; this.left = null; this.right = null; }
	 * 
	 * }
	 */
	/**
	 * @param no
	 * @return factorial of a no
	 */
	public static int factorial(int no) {
		if (no == 1) {
			return no;
		} else {
			return no * factorial(no - 1);
		}
	}

	/**
	 * @param key to find no of bst
	 * @return no of possible BST combination
	 */
	public static int numOfBST(int key) {
		int catalanNumber = factorial(2 * key) / (factorial(key + 1) * factorial(key));
		return catalanNumber;
	}

	public static void main(String[] args) {
		System.out.println("No of possible BST " + numOfBST(5));
	}
}