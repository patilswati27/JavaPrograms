package com.bridgelabz.DatastructPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import com.bridgelabz.utility.LinkedListMethods;

public class Util {
	public static Object readFromFile(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		Object str = br.readLine();
		Object words;
		while ((words = br.readLine()) != null) {
			str = words + " " + str;
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
}
