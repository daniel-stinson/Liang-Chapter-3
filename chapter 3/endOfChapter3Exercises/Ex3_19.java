/*
 * Compute perimeter of a triangle using input that reads the three edges of the triangle
 * and computes if the perimeter is valid. The input is valid if the sum of each pair of edges
 * is greater than the remaining edge
 */


package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Get user input
		System.out.println("Enter the first edge (x,y) of a triangle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.println("Enter the second edge (x,y) of a triangle: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		System.out.println("Enter the second edge (x,y) of a triangle: ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		// Determine if valid
		Boolean isValidTriangle = true;
		
		if  (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3
			|| x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2
			|| x3 + y3 > x1 + y1 && x2 + y2 > x1 + y1){
		isValidTriangle = false;
		}
		
		// Display 
		System.out.println("Is your triangle valid? ");
		System.out.println(isValidTriangle);
		

		// Calculate sides 
				double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
				double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
				double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

		// Display the perimeter
			System.out.println("perimeter of triangle is " + (side1 + side2 + side3));

	}

}
