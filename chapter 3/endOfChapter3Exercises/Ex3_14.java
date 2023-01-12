/*
 *  Heads or tails guessing game
 */


package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_14 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	// Prompt user to guess heads or tails
	System.out.print("Guess heads or tails as a 0 or 1: ");
	int userChoice = input.nextInt();
	
	// Generate H or T
	int coin = (int)(Math.random() * 2);
	
	if (coin == 0) {
		System.out.println("The coin shows heads.");
	} else {
		System.out.println("The coin shows tails.");
	}
	
	// Check if guess is correct
	if (coin == userChoice) {
		System.out.println("You chose correctly.");
	} else {
		System.out.println("You chose incorrectly.");
	}

	}

}
