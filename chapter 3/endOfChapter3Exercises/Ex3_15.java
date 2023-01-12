/*
 * Lottery game: User enters 3-digit integer
 * if complete match, user gets 10000
 * if all digits are contained user gets 3000
 * if one digit is matched user gets 1000
 */

package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Generate a lottery number
		int lottery = (int)(Math.random() * 1000);
		
		// Prompt the user to enter a guess
		System.out.print("Enter your lottery pick (three digits): ");
	    int guess = input.nextInt();
	    
		// Get digits from lottery
		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = lottery / 10 % 10;
		int lotteryDigit3 = lottery % 10;
		
		// Get digits from guess
		int guessDigit1 = guess / 100;
		int guessDigit2 = guess / 10 % 10;
		int guessDigit3 = guess % 10;
		
		System.out.println("The lottery number is: " + lottery);
		System.out.println("Lottery digit 1 is: " + lotteryDigit1);
		System.out.println("Lottery digit 2 is: " + lotteryDigit2);
		System.out.println("Lottery digit 3 is: " + lotteryDigit3);
	
		// Check the guess
		if (guess == lottery)
			System.out.println("Exact match: you win $10,000");
		else if (guessDigit3 == lotteryDigit2 
				&& guessDigit2 == lotteryDigit1
				&& guessDigit1 == lotteryDigit3
				|| guessDigit2 == lotteryDigit1 
				&& guessDigit1 == lotteryDigit3
				&& guessDigit3 == lotteryDigit1)
			System.out.println("Match all digits: you win $3,000");
		else if (guessDigit1 == lotteryDigit1 
				|| guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match");
		
		
	}

}
