/*
 * Modify computeChange.java so that only nonzero denominations are displayed
 *  and plurals are differentiated from singles
 */

package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Receive the amount
				System.out.print("Enter an amount: ");
				
				double userAmount = input.nextDouble();
				
				int remainingAmount = (int)(userAmount * 100);
				
				// Find remaining dollars
				int numberOfDollars = remainingAmount / 100;
				remainingAmount = remainingAmount % 100;
				
				// Find remaining quarters
				int numberOfQuarters = remainingAmount / 25;
				remainingAmount = remainingAmount % 25;
				
				// Find remaining dimes
				int numberOfDimes = remainingAmount / 10;
				remainingAmount = remainingAmount % 10;
				
				// Find remaining nickels
				int numberOfNickels = remainingAmount / 5;
				remainingAmount = remainingAmount % 5;
				
				// Find remaining pennies
				int numberOfPennies = remainingAmount;
				
				// Display with nonzero and singles versus multiples taken into account
				System.out.println("Your amount of $" + userAmount + " consists of: "); 
				System.out.print(numberOfDollars == 0 ? "" 
						: numberOfDollars == 1? numberOfDollars + " dollar, "
						: numberOfDollars + " dollars, ");
				System.out.print(numberOfQuarters == 0 ? "" 
						: numberOfQuarters == 1? numberOfQuarters + " quarter, "
						: numberOfQuarters + " quarters, ");
				System.out.print(numberOfDimes == 0 ? "" 
						: numberOfDimes == 1? numberOfDimes + " dime, "
						: numberOfDimes + " dimes, ");
				System.out.print(numberOfNickels == 0 ? "" 
						: numberOfNickels == 1? numberOfNickels + " nickel, "
						: numberOfNickels + " nickel, ");
				System.out.print(numberOfPennies == 0 ? "" 
						: numberOfPennies == 1? numberOfPennies + " penny "
						: numberOfPennies + " pennies ");

	}

}
