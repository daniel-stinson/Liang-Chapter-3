/*
 * Rock, Paper, Scissors
 */

package endOfChapter3Exercises;

import java.util.Scanner;

public class Ex3_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Player chooses and computer generates number too
		System.out.println("Choose rock [0], paper [1], or scissors [2]: ");
		int playerChoice = input.nextInt();
		int computerChoice = (int)(Math.random() * 4);
		
		// If sequence of results
		// Player chooses Rock
		if (playerChoice == 0 && computerChoice == 2) {
			System.out.println("You chose rock, the computer chose scissors. You win!");
		} else if (playerChoice == 0 && computerChoice == 0) {
			System.out.println("You chose rock, the computer chose rock. You tied!");
		} else if (playerChoice == 0 && computerChoice == 1) {
			System.out.println("You chose rock, the computer chose paper. You lost!");
		}
		
		// Player chooses Paper
		if (playerChoice == 1 && computerChoice == 0)
			System.out.println("You chose paper, the computer chose rock. You win!");
		else if (playerChoice == 1 && computerChoice == 1) 
			System.out.println("You chose paper, the computer chose paper. You tied!");
		else if (playerChoice == 1 && computerChoice == 2) 
			System.out.println("You chose paper, the computer chose scissors. You lost!");
		
		
		// Player chooses Scissors
		if (playerChoice == 2 && computerChoice == 1) 
			System.out.println("You chose scissors, the computer chose paper. You win!");
		else if (playerChoice == 2 && computerChoice == 2) 
			System.out.println("You chose scissors, the computer chose scissors. You tied!");
		else if (playerChoice == 2 && computerChoice == 0) 
			System.out.println("You chose scissors, the computer chose rock. You lost!");
	}
}
