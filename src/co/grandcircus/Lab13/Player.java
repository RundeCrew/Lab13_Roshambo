package co.grandcircus.Lab13;

public abstract class Player {

	private String name;
	
	// constructor
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	// return one of R P or S
	abstract public Roshambo generateRoshambo(); 
	
	// pretty print line
	public String toString() {
		return "\n" + name;
	}
}
