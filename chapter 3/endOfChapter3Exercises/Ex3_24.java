/*
 * Picks a card from a standard deck
 */
package endOfChapter3Exercises;



public class Ex3_24 {

	public static void main(String[] args) {
		
		// Generate a random card
		int card = (int)(Math.random() * 53);
		
		// Display card
		System.out.print("Your card is the ");
		
		// If statement to determine suit
		switch(card % 13) {
		case 0: System.out.print("Ace"); break;
		case 1: System.out.print("Two"); break;
		case 2: System.out.print("Three"); break;
		case 3: System.out.print("Four"); break;
		case 4: System.out.print("Five"); break;
		case 5: System.out.print("Six"); break;
		case 6: System.out.print("Seven"); break;
		case 7: System.out.print("Eight"); break;
		case 8: System.out.print("Nine"); break;
		case 9: System.out.print("Ten"); break;
		case 10: System.out.print("Jack"); break;
		case 11: System.out.print("Queen"); break;
		case 12: System.out.print("King"); break;
		}
		
		// If statements to determine suit
		switch(card % 4) {
		case 0: System.out.print(" of Hearts"); break;
		case 1: System.out.print(" of Spades"); break;
		case 2: System.out.print(" of Diamonds"); break;
		case 3: System.out.print(" of Clubs"); break;
		}
		
		

	}

}
