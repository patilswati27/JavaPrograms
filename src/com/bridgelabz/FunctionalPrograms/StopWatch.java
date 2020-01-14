package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.utility.Utility;

public class StopWatch {

	public static void main(String[] args) {
		long start=Utility.startwatch();
		//System.out.println(start);
		try {
			Thread.sleep(9000);;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Elapsed time is "+Utility.elapsedTime(start));
	}

}
