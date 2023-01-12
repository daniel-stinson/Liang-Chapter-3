/*
 * Check ISBN number using formula:
 * 
 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
 */

package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_09 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Enter the first 9 digits
		
		System.out.print("Enter the first 9 digits of the ISBN-Number: ");
		int d1 = input.nextInt();
		int d2 = input.nextInt();
		int d3 = input.nextInt(); 
		int d4 = input.nextInt();
		int d5 = input.nextInt();
		int d6 = input.nextInt();
		int d7 = input.nextInt();
		int d8 = input.nextInt();
		int d9 = input.nextInt();
		
		// Calculate the total using the formula
		// (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
		
		int checkSum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		// Display using if statement
		if(checkSum == 10) {
			System.out.println("The ISBN-10 number is: ");
			System.out.print(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + "X");
		} else {
			System.out.println("The ISBN-10 number is: ");
			System.out.println(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + checkSum);
		}
		
	}

}
