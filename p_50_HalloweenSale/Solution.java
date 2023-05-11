package p_50_HalloweenSale;

/*
 * You wish to buy video games from the famous online video game store Mist.

	Usually, all games are sold at the same price, p dollars.
	 However, they are planning to have the seasonal Halloween Sale next month in which 
	 you can buy games at a cheaper price.
	  Specifically, the first game will cost p dollars, and every subsequent game will cost d dollars
	   less than the previous one. 
	   This continues until the cost becomes less than or equal to m dollars, 
	   after which every game will cost m dollars. 
	   How many games can you buy during the Halloween Sale?
	   
	  Example 
	  p=20
	  d=3
	  m=6
	  s=70
	  
	  The following are the costs of the first 11, in order:
	  		20,17,14,11,8,6,6,6,6,6,6
	  Start at p=20 units cost, reduce that by d=3 units each iteration until reaching a 
	  minimum possible price,m=6 . Starting with s=70 units of currency in your Mist wallet,
	   you can buy 5 games:20+17+14+11+8=70 .
 * */
class Result {
	public static int howManyGames(int p, int d, int m, int s) {
		int count = 0;
		int nextsale = p;
		while (s >= nextsale) {
			count++;
			s = s - nextsale;
			nextsale = Math.max(nextsale - d, m);

		}

		return count;

	}
}

public class Solution {
	public static void main(String[] args) {
		System.out.println(Result.howManyGames(20, 3, 6, 70));
	}
}
