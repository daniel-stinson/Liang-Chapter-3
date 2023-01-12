/*
 * Generate a random point (x,y) on a rectangle centered at (0,0) with a width of 100, and height of 200
 */

package endOfChapter3Exercises;

public class Ex3_16 {

	public static void main(String[] args) {
		
		// Generate random width and height
		int rectangleWidth = (int)((Math.random() * (50 + 50)) -50);
		int rectangleHeight = (int)((Math.random() * (100 + 100)) -100);

		// Display coordinates
		System.out.println("X and Y coordinates in rectangle centered at (0,0)");
		System.out.println("with width 100 and height 200: (" + rectangleWidth + ", " + rectangleHeight + ")");
		

	}

}
