/*
 * Add three numbers, revision of example addition quiz
 */

package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Create three random numbers and result
		int number1 = (int)(Math.random() * 11);
		int number2 = (int)(Math.random() * 11);
		int number3 = (int)(Math.random() * 11);
		int answer = number1 + number2 + number3;
		
		// User guesses the sum of the numbers
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "?");
		int guess = input.nextInt();
		
		// Check if correct
		if (guess == answer) {
			System.out.println("That is correct!");
		} 
		else {
			System.out.println("That is incorrect.");
		}

	}

}
