/*
 * Sort three and display integers in ascending order
 */
package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter three integers
		System.out.print("Enter three integers: ");
		
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		int temp;
		
		// Sort the integers
		if (y < x || z < x){
			if (y < x){
				temp = x;
				x = y;
				y = temp; 
			}
			if (z < x){
				temp = x;
				x = z;
				z = temp;
			}
		}
		if (z < y){
			temp = y;
			y = z;
			z = temp;
		}
	
		// Display results
		System.out.println("The numbers in ascending order are: " + x + ", " + y + ", " + z);

	}

}
