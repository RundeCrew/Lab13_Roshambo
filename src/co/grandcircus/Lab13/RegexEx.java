package co.grandcircus.Lab13;

import java.util.Scanner;

public class RegexEx {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String input = scnr.nextLine();
		
		// Will match input that consists ONLY of lower case letters and spaces.
		if (input.matches("[a-z ]+")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		scnr.close();

	}

}
