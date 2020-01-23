package com.bridgelabz.DatastructPrograms;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

import com.bridgelabz.utility.LinkedListMethods;

public class UnorderedList {
	static Scanner sc = new Scanner(System.in);
	static LinkedListMethods list = new LinkedListMethods();

	public static void unorderedList() throws IOException {
		Object str = Util.readFromFile("/home/admin106/Desktop/wordlist.txt");
		String[] words = ((String) str).split(" ");

		for (String ele : words) {
			list.add(list, ele);
		}

		list.display();
		System.out.println("Enter text to search in file");
		String text = sc.nextLine();
		if (list.search(list, text)) {
			list.remove(list, text);
		} else {
			list.add(list, text);
		}
		list.display();
		Util.writeToFile(list, "/home/admin106/Desktop/wordlist.txt");
	}

	public static void main(String[] args) throws IOException {
		unorderedList();
	}

}
