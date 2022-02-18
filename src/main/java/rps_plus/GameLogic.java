package rps_plus;

public class GameLogic {

	static String[] moves = {"Rock", "Fire", "Scissors", "Snake", "Human", "Tree", "Wolf", "Sponge", "Paper", "Air", "Water", "Dragon", "Devil", "Lightning", "Gun"};
	
	public static int computerChoice() {
		int x = (int) (Math.random() * 15) + 1;
		return x;
	}
	
	public static void gameLoop(int winningScore) {
		int playerScore = 0;
		int computerScore = 0;
		int playerMove;
		int computerMove;
		int roundResult;
		
		// loop game until either player gets a winning score
		while (playerScore < winningScore && computerScore < winningScore) {
			System.out.println("What move will you use?");
			
			playerMove = (UserInput.input()) - 1;
			System.out.println("You selected " + moves[playerMove]);
			computerMove = (GameLogic.computerChoice()) - 1;
			System.out.println("The machine selected " + moves[computerMove]);
			roundResult = gameRound(playerMove, computerMove);
			if (roundResult == 1) {
				playerScore ++;
			} else if (roundResult == 2) {
				computerScore ++;
			}
			System.out.println("Player: " + playerScore + " - Computer: " + computerScore);
		}
		// determine who reached the winning score
		if (playerScore > computerScore) {
			System.out.println("\nYou have defeated the machine");
		} else {
			System.out.println("\nThe machines have won");
		}
		
	}
		
	public static int gameRound(int playerMove, int computerMove) {
		// if moves are listed in order, such that each beats the next 7:	
		// all playermoves are equal, relative to starting position
		// ie. win against the next 7, lose to preceeding 7
		// assess computer move from position 0, by subtracting playerMove
		int x = computerMove - playerMove;
		if (x < 0) {
			x += 15;
		}
		if (x == 0) {
			System.out.println("It's a tie.");
			return 0;
		} else if (x < 8){
			// win
			System.out.println(Outcomes.returnOutcome(playerMove, x));
			return 1;
		} else {
			// lose
			System.out.println(Outcomes.returnOutcome(computerMove, (15 -x)));
			return 2;
		}
	}
}
