/*
 * Use operators to determine if a user-entered integer is 
 * divisible by 5, 6, or 5 & 6
 * 								
 */
package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Pick a number
		System.out.println("Enter an integer: ");
		
		int userNum = input.nextInt();
		
		// Result 
		if (userNum % 5 == 0 && userNum % 6 == 0)
			System.out.println(userNum + " is divisible by 5 and 6.");
				
		if (userNum % 5 == 0 || userNum % 6 == 0)
			System.out.println(userNum + " is divisible by 5 or 6.");
				
		if (userNum % 5 == 0 ^ userNum % 6 == 0)
			System.out.println(userNum + " is divisible by 5 or 6, but not both.");

	}

}
