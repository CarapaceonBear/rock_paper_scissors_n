package rps_plus;

public class Outcomes {

	public static String returnOutcome(int winningMove, int losingMove) {
		// index of winning move, either player's or computer's
		switch(winningMove) {
			case 0:
				return rock(losingMove);
			case 1:
				return fire(losingMove);
			case 2:
				return scissors(losingMove);
			case 3:
				return snake(losingMove);
			case 4:
				return human(losingMove);
			case 5:
				return tree(losingMove);
			case 6:
				return wolf(losingMove);
			case 7:
				return sponge(losingMove);
			case 8:
				return paper(losingMove);
			case 9:
				return air(losingMove);
			case 10:
				return water(losingMove);
			case 11:
				return dragon(losingMove);
			case 12:
				return devil(losingMove);
			case 13:
				return lightning(losingMove);
			case 14:
				return gun(losingMove);
		}
		return "";
	}
	
	public static String rock(int input) {
		switch(input) {
			case 1:
				return "Rock pounds out Fire";
			case 2:
				return "Rock crushes Scissors";
			case 3:
				return "Rock crushes Snake";
			case 4:
				return "Rock crushes Human";
			case 5:
				return "Rock blocks growth of Tree";
			case 6:
				return "Rock crushes Wolf";
			case 7:
				return "Rock crushes Sponge";
		}
		return "";
	}
	public static String fire(int input) {
		switch(input) {
			case 1:
				return "Fire melts Scissors";
			case 2:
				return "Fire burns Snake";
			case 3:
				return "Fire burns Human";
			case 4:
				return "Fire burns Tree";
			case 5:
				return "Fire burns Wolf";
			case 6:
				return "Fire burns Sponge";
			case 7:
				return "Fire burns Paper";
		}
		return "";
	}
	public static String scissors(int input) {
		switch(input) {
			case 1:
				return "Scissors behead Snake";
			case 2:
				return "Scissors cut Human";
			case 3:
				return "Scissors prune Tree";
			case 4:
				return "Scissors cut Wolf";
			case 5:
				return "Scissors cut Sponge";
			case 6:
				return "Scissors cut Paper";
			case 7:
				return "Scissors swish through Air";
		}
		return "";
	}
	public static String snake(int input) {
		switch(input) {
			case 1:
				return "Snake bites Human";
			case 2:
				return "Snake climbs Tree";
			case 3:
				return "Snake bites Wolf";
			case 4:
				return "Snake swallows Sponge";
			case 5:
				return "Snake nests in Paper";
			case 6:
				return "Snake breathes Air";
			case 7:
				return "Snake drinks Water";
		}
		return "";
	}
	public static String human(int input) {
		switch(input) {
			case 1:
				return "Human plants Tree";
			case 2:
				return "Human tames Wolf";
			case 3:
				return "Human cleans with Sponge";
			case 4:
				return "Human writes on Paper";
			case 5:
				return "Human breathes Air";
			case 6:
				return "Human drinks Water";
			case 7:
				return "Human slays Dragon";
		}
		return "";
	}
	public static String tree(int input) {
		switch(input) {
			case 1:
				return "Tree shelters Wolf";
			case 2:
				return "Tree outlives Sponge";
			case 3:
				return "Tree becomes Paper";
			case 4:
				return "Tree produces Air";
			case 5:
				return "Tree drinks Water";
			case 6:
				return "Tree shelters Dragon";
			case 7:
				return "Tree imprisons Devil";
		}
		return "";
	}
	public static String wolf(int input) {
		switch(input) {
			case 1:
				return "Wolf chews up Sponge";
			case 2:
				return "Wolf chews up Paper";
			case 3:
				return "Wolf breathes Air";
			case 4:
				return "Wolf drinks Water";
			case 5:
				return "Wolf outruns Dragon";
			case 6:
				return "Wolf bites Devil's heiny";
			case 7:
				return "Wolf outruns Lightning";
		}
		return "";
	}
	public static String sponge(int input) {
		switch(input) {
			case 1:
				return "Sponge soaks Paper";
			case 2:
				return "Sponge uses Air pockets";
			case 3:
				return "Sponge absorbs Water";
			case 4:
				return "Sponge cleanses Dragon";
			case 5:
				return "Sponge cleanses Devil";
			case 6:
				return "Sponge conducts Lightning";
			case 7:
				return "Sponge cleans Gun";
		}
		return "";
	}
	public static String paper(int input) {
		switch(input) {
			case 1:
				return "Paper fans Air";
			case 2:
				return "Paper floats on Water";
			case 3:
				return "Paper rebukes Dragon";
			case 4:
				return "Paper rebukes Devil";
			case 5:
				return "Paper defines Lightning";
			case 6:
				return "Paper outlaws Gun";
			case 7:
				return "Paper covers Rock";
		}
		return "";
	}
	public static String air(int input) {
		switch(input) {
			case 1:
				return "Air evaporates Water";
			case 2:
				return "Air freezes Dragon";
			case 3:
				return "Air chokes Devil";
			case 4:
				return "Air creates Lightning";
			case 5:
				return "Air tarnishes Gun";
			case 6:
				return "Air erodes Rock";
			case 7:
				return "Air blows out Fire";
		}
		return "";
	}
	public static String water(int input) {
		switch(input) {
			case 1:
				return "Water drowns Dragon";
			case 2:
				return "Water drowns Devil";
			case 3:
				return "Water conducts Lightning";
			case 4:
				return "Water rusts Gun";
			case 5:
				return "Water erodes Rock";
			case 6:
				return "Water puts out Fire";
			case 7:
				return "Water rusts Scissors";
		}
		return "";
	}
	public static String dragon(int input) {
		switch(input) {
			case 1:
				return "Dragon commands Devil";
			case 2:
				return "Dragon breathes Lightning";
			case 3:
				return "Dragon is immune to Gun";
			case 4:
				return "Dragon rests on Rock";
			case 5:
				return "Dragon breathes Fire";
			case 6:
				return "Dragon is immune to Scissors";
			case 7:
				return "Dragon spawns Snake";
		}
		return "";
	}
	public static String devil(int input) {
		switch(input) {
			case 1:
				return "Devil casts Lightning";
			case 2:
				return "Devil is immune to Gun";
			case 3:
				return "Devil hurls Rock";
			case 4:
				return "Devil breathes Fire";
			case 5:
				return "Devil is immune to Scissors";
			case 6:
				return "Devil transforms into Snake";
			case 7:
				return "Devil possesses Human";
		}
		return "";
	}
	public static String lightning(int input) {
		switch(input) {
			case 1:
				return "Lightning melts Gun";
			case 2:
				return "Lightning splits Rock";
			case 3:
				return "Lightning starts Fire";
			case 4:
				return "Lightning melts Scissors";
			case 5:
				return "Lightning strikes Snake";
			case 6:
				return "Lightning strikes Human";
			case 7:
				return "Lightning splits Tree";
		}
		return "";
	}
	public static String gun(int input) {
		switch(input) {
			case 1:
				return "Gun targets Rock";
			case 2:
				return "Gun Fires";
			case 3:
				return "Gun outclasses Scissors";
			case 4:
				return "Gun shoots Snake";
			case 5:
				return "Gun shoots Human";
			case 6:
				return "Gun targets Tree";
			case 7:
				return "Gun shoots Wolf";
		}
		return "";
	}
}
