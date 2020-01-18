package Com.bridgelabz.AlgoPrograms;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		System.out.println("Enter month date and year ");
		int month=Utility.inputInteger();
		int date=Utility.inputInteger();
		int year=Utility.inputInteger();
		Util.dayOfWeek(month, date, year);
	}

}
