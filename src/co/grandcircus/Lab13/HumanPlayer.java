package co.grandcircus.Lab13;

import java.util.Scanner;

public class HumanPlayer extends Player {

	private Scanner scnr;
	private String choice;
	
	public HumanPlayer(String name, Scanner scnr) {
		super(name);
		this.scnr = scnr;
	}
	@Override
	public Roshambo generateRoshambo() {
		choice = Validator.getStringMatchingRegex(scnr, "Choose your weapon: rock, paper or scissors\n",
				"rock|paper|scissors");
		
		if (choice.equalsIgnoreCase("rock")) {
//			System.out.print("You chose: "); //added this into the Main instead of here. Seemed easier, but maybe there's a better way??
			return Roshambo.ROCK;
		}else if (choice.equalsIgnoreCase("paper")) {
//			System.out.print("You chose: ");
			return Roshambo.PAPER;
		}else {
//			System.out.print("You chose: ");
			return Roshambo.SCISSORS;
		}
		
	}
//	public Roshambo whoWins() { // started a who wins method but counldn't connect all the dots, maybe something to come back to 
//		if (choice.equalsIgnoreCase("rock") && RockPlayer
//	}

	
}
