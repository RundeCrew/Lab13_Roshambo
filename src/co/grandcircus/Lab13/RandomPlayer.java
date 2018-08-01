package co.grandcircus.Lab13;



public class RandomPlayer extends Player {

	public RandomPlayer(String random) {
		super("Randy");
	}

	@Override
	public Roshambo generateRoshambo() {
		int rIndex= (int) (Math.random() * 3);
		return Roshambo.values()[rIndex];
//		
//	
//		switch (random) {
//			case 1:
//				return Roshambo.ROCK;
//			case 2:
//				return Roshambo.PAPER;
//			case 3:
//				return Roshambo.SCISSORS;
//			default :
//				return null;
//	}
	}
}
