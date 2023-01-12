/*
 *  Cost of shipping package (c) is based on weight in pounds (w)
 *  
 *  c(w) = 	3.5 	if 0 < w <= 1
 *  		5.5		if 1 < w <= 3
 *  		8.5		if 3 < w <= 10
 *  		10.5	if 10 < w <= 20
 *  
 *  If w is less than 0, inform user of invalid input
 *  If w is greater than 20, inform user package cannot be shipped
 */


package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user to input weight of package
		System.out.print("Enter the weight of the package you would like to send: ");
		double packageWeight = input.nextDouble();
		
		double packageCost = 0;
		
		// Determine if package is invalid or cannot be shipped
		if (packageWeight <= 0) {
			System.out.println("Invalid input.");
		}
		
		if (packageWeight > 20) {
			System.out.println("This package is too heavy to ship.");
		}
		
		// Determine shipping cost
		if (packageWeight > 0 && packageWeight <= 1) {
			packageCost = 3.5;
		} else if (packageWeight > 1 && packageWeight <= 3) {
			packageCost = 5.5;
		} else if (packageWeight > 3 && packageWeight <= 10) {
			packageCost = 8.5;
		} else if (packageWeight > 10 && packageWeight <= 20) {
			packageCost = 8.5;
		} 
		
		// Display cost
		System.out.println("The cost to ship a package that weighs " + packageWeight +
				" pounds is $" + packageCost + " dollars.");

	}

}
