/*
 * Determine if a three-digit integer input is a palindrome (i.e. 131, 282...)
 */

package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_12 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		// Prompt
		System.out.println("Enter a three-digit integer, pressing Enter after each digit: ");
		
		// Input
		int digitOne = input.nextInt();
		int digitTwo = input.nextInt();
		int digitThree = input.nextInt();
		
		// Calculate
		Boolean isPalindrome;
		
		if (digitOne == digitThree) {
			isPalindrome = true;
		} else {
			isPalindrome = false;
		}
		
		// Output
		System.out.println("Your input of " + digitOne + digitTwo + digitThree + " as a palindrome is " + isPalindrome);

	}

}
