/*
 * Currency exchange for Euro
 * Press 1 for Euro to Dollar
 * Press 0 for Dollar to Euro
 */

package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Get input for rate
		System.out.println("Enter exhange rate: ");
		double exchangeRate = input.nextDouble();
		
		// Get input for either Euro to Dollar or Dollar to Euro
		System.out.println("Enter 0 for Dollar to Euro conversion, or 1 for Euro to Dollar conversion.");
		int conversionDirection = input.nextInt();
		
		if (conversionDirection == 0) {
			System.out.println("Enter Dollar amount: ");
			Double dollarAmount = input.nextDouble();
			Double euroConversion = dollarAmount * exchangeRate;
			// Convert
			System.out.println("$" + dollarAmount + "is " + euroConversion + " Euro.");
			
		} else if (conversionDirection == 1) {
			System.out.println("Enter Euro amount: ");
			Double euroAmount = input.nextDouble();
			Double dollarConversion = euroAmount / exchangeRate;
			// Convert
			System.out.println(euroAmount + " Euro is " + "$" + dollarConversion);
		} else {
			System.out.println("Invalid entry ");
			System.exit(1);
		}
		
	}

}
