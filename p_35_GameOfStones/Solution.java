package p_35_GameOfStones;
/*
 *	Two players called p1 and p2 are playing a game with a starting number of stones.
 * Player 1 always plays first, and the two players move in alternating turns.
 *  The game's rules are as follows:

In a single move, a player can remove either 2, 3,or 5 stones from the game board.
If a player is unable to make a move, that player loses the game.
Given the starting number of stones, find and print the name of the winner. 
P1 is named First and P2 is named Second. Each player plays optimally,
meaning they will not make a move that causes them to lose the game if a winning move exists. 
 */
class Result {

	public static String gameOfStones(int n) {

		if (n % 7 < 2)
			return "Second";
		return "First";

	}
}

public class Solution {
	public static void main(String[] args) {
		String s = Result.gameOfStones(65);
		System.out.println(s);

	}
}
