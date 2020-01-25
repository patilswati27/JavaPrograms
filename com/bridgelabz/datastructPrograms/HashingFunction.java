package com.bridgelabz.datastructPrograms;

import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.utility.LinkedListMethods;

public class HashingFunction {
Util u=new Util();
	public static void hashSearch(LinkedListMethods list[], String[] num) {
		for (int i = 0; i < num.length; i++) {
			int number = Integer.parseInt(num[i]);
			int dec = number % 11;
			list[dec].insert(number);
		}
	}

	public static void search(int number, LinkedListMethods list[]) {
		int dec = number % 11;
		if (list[dec].search(list, number)) {
			list[dec].remove(list, number);
			System.out.println("Remove number "+number);
		} else {
			list[dec].insert(number);
			System.out.println("Added no "+number);
		}
	}

	public static void main(String[] args) throws IOException {

		LinkedListMethods list[] = new LinkedListMethods[11];
		String num[] = Util.readFromFile("/home/admin106/Desktop/number.txt").split(" ");
		for (int i = 0; i < 11; i++) {
			list[i] = new LinkedListMethods();
		}
		hashSearch(list, num);
		int n = Integer.parseInt(args[0]);
		search(n, list);
		FileWriter fw = new FileWriter("/home/admin106/Desktop/number.txt");
		fw.write("");
		fw.close();
		/*
		 * for (int i=0; i < 11; i++) { if (list[i].size() == 0) { continue; }
		 * list[i].display(); System.out.println(); }
		 */
		for (int i = 0; i < 11; i++) {
			if (list[i].size() == 0) {
				continue;
			}
			Util.appendToFile(list[i], "/home/admin106/Desktop/number.txt");
		}

	}
}
