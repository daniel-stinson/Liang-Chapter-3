/*
 * Revise the windchill calculator of 2.17 to validate input
 */

package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Input
		System.out.println("Enter the temperature in Fahrenheit between -58 and 41 degrees: ");
		double outsideTemp = input.nextDouble();
		
		System.out.print("Enter the speed of the wind greater than 2 miles per hour: ");
		double windSpeed = input.nextDouble();
		
		// Validate wind speed and temperature
		if (outsideTemp < -58 || outsideTemp > 41 || windSpeed < 2) {
			System.out.println("Input is invalid.");
			System.exit(1);
		}
		
		// Calculate
		double windchill = 35.74 + (0.6215 * outsideTemp) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * outsideTemp * Math.pow(windSpeed, 0.16));
		
		// Output
		System.out.println("\n");
		System.out.println("The wind-chill temperature is: " + windchill + " degrees.");

	}

}
