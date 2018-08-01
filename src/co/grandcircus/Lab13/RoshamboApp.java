package co.grandcircus.Lab13;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String playAgain = "y";
		RockPlayer computer = new RockPlayer("Dwayne");
		RandomPlayer random = new RandomPlayer("Randy");
		String name = Validator.getString(scnr, "Enter your name: ");
		
		HumanPlayer human = new HumanPlayer(name, scnr);
		
		do  {
	
		int opponent = Validator.getInt(scnr, human + ", who would you like to play Dwayne or Randy?? Enter '1' for Dwayne or '2' for 'Randy'.", 1, 2);
		//Roshambo weapon;
		
		if (opponent == 1) {    // if the player chooses the player that choose Rock everytime.
			Roshambo computerR = computer.generateRoshambo();
			Roshambo human1 = human.generateRoshambo();
			//System.out.println("Dwayne played " + computerR);
				if (human1 == Roshambo.ROCK) {
					System.out.println("You played " + human1);
					System.out.println("Dwayne played " + computerR);
					System.out.println("You Tied!");
				}
				else if (human1 == Roshambo.PAPER) {
					System.out.println("You played " + human1);
					System.out.println("Dwayne played " + computerR);
					System.out.println("You Win!");
				}
				else {
					System.out.println("You played " + human1);
					System.out.println("Dwayne played " + computerR);
					System.out.println("You Lose, wah wah.");
				}
		}
		else if (opponent == 2) {      // if the player chooses the the random player
			Roshambo playerChoice2 = random.generateRoshambo();
			Roshambo human2 = human.generateRoshambo();
				if ((human2 == Roshambo.ROCK && playerChoice2 == Roshambo.ROCK) || 
						(human2 == Roshambo.PAPER && playerChoice2 == Roshambo.PAPER) || 
						(human2 == Roshambo.SCISSORS && playerChoice2 == Roshambo.SCISSORS)) {
					System.out.println("You played " + human2);
					System.out.println("Randy played: " + playerChoice2);
					System.out.println("You Tied!");
				}
				if ((human2 == Roshambo.ROCK && playerChoice2 == Roshambo.PAPER) || 
						(human2 == Roshambo.PAPER && playerChoice2 == Roshambo.SCISSORS) || 
						(human2 == Roshambo.SCISSORS && playerChoice2 == Roshambo.ROCK)) {
					System.out.println("You played " + human2);
					System.out.println("Randy played: " + playerChoice2);
					System.out.println("You Lose, wah wah.");
				}				
				if ((human2 == Roshambo.ROCK && playerChoice2 == Roshambo.SCISSORS) || 
						(human2 == Roshambo.PAPER && playerChoice2 == Roshambo.ROCK) || 
						(human2 == Roshambo.SCISSORS && playerChoice2 == Roshambo.PAPER)) {
					System.out.println("You played " + human2);
					System.out.println("Randy played: " + playerChoice2);
					System.out.println("You Win!");
				}				
		}
		System.out.println("\n" + name + ", would you like to play again?"); // if the player wants to play again it will take them back to pick a player again
		playAgain = scnr.next();											// maybe could add in an option to play same player again vs starting all over again
		
		}while (playAgain.trim().toLowerCase().startsWith("y"));
		
		System.out.println("Thanks, " + name + "for playing Rock, Paper Scissors!");
	}

}
