/*
 * This program displays a random month, day and year
 */

package endOfChapter3Exercises;

public class Ex3_04 {

	public static void main(String[] args) {
		
		// Generate a random number between 0-11 
		int monthNum = (int)(Math.random() * 12);
		
		// Translate that number to a month and display
		switch (monthNum % 12) {
		case 0: System.out.print("January"); break;
		case 1: System.out.print("February"); break;
		case 2: System.out.print("March"); break;
		case 3: System.out.print("April"); break;
		case 4: System.out.print("May"); break;
		case 5: System.out.print("June"); break;
		case 6: System.out.print("July"); break;
		case 7: System.out.print("August"); break;
		case 8: System.out.print("September"); break;
		case 9: System.out.print("October"); break;
		case 10: System.out.print("November"); break;
		case 11: System.out.print("December"); 
		}
		
		// Random day (Not specific to actual total days)
		int dayNum = (int)(Math.random() * 32);
			if (dayNum == 0 || dayNum > 32) {
				System.out.print(" 30,");
			} System.out.print(" " + dayNum + ", ");
		
		// Random year
		int yearNum = (int)(Math.random() * 2050);
		System.out.print(yearNum);
		}

}
