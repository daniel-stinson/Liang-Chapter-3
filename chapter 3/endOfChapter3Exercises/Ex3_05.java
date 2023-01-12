/*
 * Revise ComputeAndInterpretBMI to allow user to enter feet, inches, and pounds
 */

package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// User enters feet, inches, and pounds
		System.out.print("Enter height in feet and inches, then weight in pounds: ");
		int feet = input.nextInt();
		int inches = input.nextInt();
		int pounds = input.nextInt();
		
		int height = feet * 12 + inches;
	
		final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
		final double METERS_PER_INCH = 0.0254; // Constant
		
		// Calculate
		double weightInKilograms = pounds * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		
		// Display calculation
		System.out.println("Your BMI is: " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}

}
