/*
 * Zoeller's congruence using formula h = (q + (26 * (m+1) / 10 ) + k + (k / 4) + (j / 4) + (5 * j)) % 7
 * h = day of the week (0 = Saturday, 6 = Friday)
 * q = day of the month
 * m = month (3 = March, 12 = December, January = 13 of previous year, February = 14 of previous year)
 * j = year / 100
 * k = year of the century (year % 100)
 */
package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter information
		System.out.println("Enter year: ");
		int year = input.nextInt();
		
		System.out.println("Enter month 1-12: ");
		int month = input.nextInt();
		
		System.out.println("Enter day of the month 1-31: ");
		int day = input.nextInt();
		
		// Calculations
		
		// Change January and February to 13 and 14 instead of 1 and 2
		if (month == 1) {
			month = 13;
			year = year - 1;
		} else if (month == 2) {
			month = 14;
			year = year - 1;
		}
		int k = year % 100;
		int j = year / 100;
		
		int dayOfWeek = (day + (26 * (month + 1) / 10 ) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
		
		// Display
		System.out.print("Day of the week is: "); 
	
		// Determine day of the week
		switch(dayOfWeek % 7) {
			case 0: System.out.print("Saturday"); break;
			case 1: System.out.print("Sunday"); break;
			case 2: System.out.print("Monday"); break;
			case 3: System.out.print("Tuesday"); break;
			case 4: System.out.print("Wednesday"); break;
			case 5: System.out.print("Thursday"); break;
			case 6: System.out.print("Friday"); break;
			}
	}

}
