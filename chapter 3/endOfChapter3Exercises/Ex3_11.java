/*
 * Find number of the days in a month based on user entry for month and year
 */

package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// User input for month and year
		
		System.out.print("Input a month using digits and a year: ");
		int userMonth = input.nextInt();
		int userYear = input.nextInt();
		
		// Determine if it's a leap year
		
		boolean isLeapYear = (userYear % 4 == 0 && userYear % 100 != 0) || (userYear % 400 == 0);
		
		// Display result
		
		// Determine month from input
		
		switch (userMonth) {
		case 1: System.out.print("January "); break;
		case 2: System.out.print("February "); break;
		case 3: System.out.print("March "); break;
		case 4: System.out.print("April "); break;
		case 5: System.out.print("May "); break;
		case 6: System.out.print("June "); break;
		case 7: System.out.print("July "); break;
		case 8: System.out.print("August "); break;
		case 9: System.out.print("September "); break;
		case 10: System.out.print("October "); break;
		case 11: System.out.print("November "); break;
		case 12: System.out.print("December "); break;
		} 
				
		//System.out.print(userMonth);
		System.out.print(userYear);
		System.out.print(" has");
		
		// Determine 30 or 31 days
		
			if (userMonth == 1 || userMonth == 3 
				|| userMonth == 5 || userMonth == 7 
				|| userMonth == 9 || userMonth == 10
				|| userMonth == 12) {
				
				System.out.print(" 31");
			
			} else if (userMonth == 4 || userMonth == 6 
				  || userMonth == 8 || userMonth == 11) {
				
				System.out.print(" 30");	
				
				// For February
			} else if (userMonth == 2 && isLeapYear == true){
				
				System.out.print(" 29");
				
			} else if (userMonth == 2 && isLeapYear == false) {
				
				System.out.print(" 28");
			}
			
		System.out.print(" days.");
		
	}

}
