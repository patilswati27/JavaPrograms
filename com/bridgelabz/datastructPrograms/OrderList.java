package com.bridgelabz.datastructPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.LinkedListMethods;

public class OrderList {
	static Scanner  sc=new Scanner(System.in);
	static LinkedListMethods list = new LinkedListMethods();
	
	static void orderedList() throws IOException {
		Object str = Util.readFromFile("/home/admin106/Desktop/wordlist.txt");
        String words[]=(((String) str).split(" "));
        for(String string:words) {
             list.add(list, string);
        }
        list.display();
        System.out.println("Enter word to search");
        Object obj=sc.nextLine();
        if(list.search(list, obj)) {
        	list.remove(list,obj);
        }else {
        	list.insert(obj);
        }
        list.display();
        Util.writeToFile(list,"/home/admin106/Desktop/wordlist.txt");		
	}
	
	public static void main(String[] args) throws IOException {
		orderedList();
	}

}
