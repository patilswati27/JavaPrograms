package com.bridgelabz.datastructPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import com.bridgelabz.utility.LinkedListMethods;
import com.bridgelabz.utility.LinkedListMethods.Node;

public class Util {
	public static String readFromFile(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String str = br.readLine();
		Object words;
		while((words = br.readLine()) != null) {
			str = words + " " +str;
		}
		br.close();
		return str;

	}

	public static void writeToFile(LinkedListMethods list, String filename) {
	
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

			PrintWriter pw = new PrintWriter(filename);
			int size = list.size();
			int i = 0;
			while (i < size) {
				pw.write(list.write() + " ");
				i++;
			}
			pw.close();
			bw.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
public static void appendToFile(LinkedListMethods list,String fileName) {
		
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,true));
			PrintWriter pw = new PrintWriter(bw);
			int i=0;
			int n = list.size();
			while(i<n) {
				pw.append(list.pollFirst()+" ");
				i++;
			}
			pw.flush();
			pw.close();
			bw.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

