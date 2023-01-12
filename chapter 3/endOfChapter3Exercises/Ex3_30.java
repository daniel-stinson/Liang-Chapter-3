/*
 * Alter getCurrentTime to display using the 12-hour format
 */
package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Get time zone
		System.out.println("Enter time zone offset to GMT");
		int timeZone = input.nextInt();
		
		// Obtain the total milliseconds since midnight, Jan 1, 1970
				 long totalMilliseconds = System.currentTimeMillis();
				
				 // Obtain the total seconds since midnight, Jan 1, 1970
				 long totalSeconds = totalMilliseconds / 1000;
				 
				 // Compute the current second in the minute in the hour
				 long currentSecond = totalSeconds % 60;
				
				 // Obtain the total minutes
				 long totalMinutes = totalSeconds / 60;
				
				 // Compute the current minute in the hour
				 long currentMinute = totalMinutes % 60;
				
				 // Obtain the total hours
				 long totalHours = totalMinutes / 60;
				
				 // Compute the current hour
				 long currentHour = totalHours % 24;
				 currentHour = currentHour + timeZone;
				 
				 // Change hour to 12-hour format
				 if (currentHour >= 12) {
					 currentHour = currentHour - 12;
				 }
				
				 // Display results
				 System.out.println("Current time is " + currentHour + ":"
				 + currentMinute + ":" + currentSecond);

	}

}
