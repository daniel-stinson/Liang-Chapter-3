/*
 * Display a future day of the week
 */

package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// User enters an int for day of the week
		System.out.print("Enter an integer for a day of the week, 0 is Sunday, 6 is Saturday: ");
		int dayOfWeek = input.nextInt();
		
		// User enters days elapsed
		System.out.println("Enter the number of days elapsed since today: ");
		int daysElapsed = input.nextInt();
		
		// Calculate number of days that have passed
		int newDayOfWeek = (dayOfWeek + daysElapsed) % 7;
		
		// Display result
		switch (dayOfWeek) {
		case 0: System.out.println("Today is Sunday."); break;
		case 1: System.out.println("Today is Monday."); break;
		case 2: System.out.println("Today is Tuesday."); break;
		case 3: System.out.println("Today is Wednesday."); break;
		case 4: System.out.println("Today is Thursday."); break;
		case 5: System.out.println("Today is Friday."); break;
		case 6: System.out.println("Today is Saturday.");
		}
		
		switch (newDayOfWeek) {
		case 0: System.out.println("The future day is Sunday."); break;
		case 1: System.out.println("The future day is Monday."); break;
		case 2: System.out.println("The future day is Tuesday."); break;
		case 3: System.out.println("The future day is Wednesday."); break;
		case 4: System.out.println("The future day is Thursday."); break;
		case 5: System.out.println("The future day is Friday."); break;
		case 6: System.out.println("The future day is Saturday."); break;
		}
	}

}
