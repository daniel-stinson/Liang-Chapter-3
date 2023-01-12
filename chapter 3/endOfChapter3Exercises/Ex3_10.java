/*
 * Modify SubtractionQuiz to include adding of two random integers less than 100
 */

package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_10 {

	public static void main(String[] args) {
		int n1 = (int)(int)(Math.random() * 101);
		int n2 = (int)(int)(Math.random() * 101);
		int correctAnswer = n1 + n2;
		
		 // Get input
		Scanner input = new Scanner(System.in);
		
		System.out.print(
		"What is " + n1 + " + " + n2 + "? ");
		
		int answer = input.nextInt();
		
		// Display answer using if statement
		
		System.out.println(n1 + n2 == answer ? "You are correct." : "You are incorrect. The answer is " + correctAnswer);
		
	}

}
