package Com.bridgelabz.AlgoPrograms;

/*
*Created by: swati                  
*Purpose: Calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine as a Change
* taking array for Notes
* using Recursion Calculating number of minimum Notes Return by Vending machine
**/
public class VendingMachine {
	public static void returnNotes(int noteCounts[], int change, int pos) {
		int notes[] = { 1000, 500, 100, 50, 10, 2, 1 };
		if (pos < notes.length) {
			if (change < notes[pos]) {
				returnNotes(noteCounts, change, ++pos);
			} else {
				change = change - notes[pos];
				noteCounts[pos]++;
				returnNotes(noteCounts, change, pos);
			}
		}
	}

	public static void main(String[] args) {

		int change = Integer.parseInt(args[0]);
		int notes[] = { 1000, 500, 100, 50, 10, 2, 1 };
		int noteCount[] = new int[notes.length];
		returnNotes(noteCount, change, 0);
		int count = 0;

		for (int i = 0; i < notes.length; i++) {
			if (noteCount[i] != 0) {
				System.out.println(notes[i] + " Rs note= " + noteCount[i]);
				count++;
			}
		}
		System.out.println("Minium No of Notes required " + count);
	}
}