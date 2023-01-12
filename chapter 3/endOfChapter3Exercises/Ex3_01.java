/*
 * Solve a quadratic equation with its formula
 */

package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// User enters a, b, and c
		System.out.println("Enter a number for a, b, and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		// Compute
		double discriminant = Math.pow(b, 2) - 4 * a * c;
		
		// If discriminant is positive, display two roots
		if (discriminant > 0) {
			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);  
			double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a); 
			System.out.println("The equation has two roots: " + root1 + " and " + root2);
		} 
		else if (discriminant == 0) {
			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
			System.out.println("The equation has one roots: " + root1);
		}
		else {
			System.out.println("The equation has no real roots.");
		}

	}

}
