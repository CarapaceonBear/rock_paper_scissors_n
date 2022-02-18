package rps_plus;

public class Main {

	public static void main(String[] args) {

		
		
		System.out.println("What the winning score going to be?");
		int winningScore = UserInput.input();
		
		System.out.println("\n ============== \n");
		
		System.out.println("Possible moves:\n1 - Rock       6 - Tree       11 - Water"
										+ "\n2 - Fire       7 - Wolf       12 - Dragon"
										+ "\n3 - Scissors   8 - Sponge     13 - Devil"
										+ "\n4 - Snake      9 - Paper      14 - Lightning"
										+ "\n5 - Human      10 - Air       15 - Gun");
		
		GameLogic.gameLoop(winningScore);
	}

}
