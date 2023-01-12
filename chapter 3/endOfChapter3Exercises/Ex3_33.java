/*
 * Compare costs
 */
package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// User input
		System.out.println("Enter the weight and price for package 1: ");
		double package1Weight = input.nextDouble();
		double package1Price = input.nextDouble();
		
		System.out.println("Enter the weight and price for package 2: ");
		double package2Weight = input.nextDouble();
		double package2Price = input.nextDouble();
		
		// Compare
		if (package1Price / package1Weight > package2Price / package2Weight) {
			System.out.println("Package 2 has a better price.");
		} else if (package1Price / package1Weight < package2Price / package2Weight) {
			System.out.println("Package 1 has a better price.");
		} else {
			System.out.println("Both packages are an equal price.");
		}

	}

}
