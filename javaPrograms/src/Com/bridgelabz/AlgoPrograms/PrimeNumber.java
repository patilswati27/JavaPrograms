package Com.bridgelabz.AlgoPrograms;

import java.util.ArrayList;

/**
 * @author swati
 * display prime no in the range of 1000
 */
public class PrimeNumber {

	public static void main(String[] args) {
	ArrayList arr=Util.getPrimeNumbers();
	System.out.println("Prime numbers in the range 1 to 1000 is " + arr);
	}

}
