package p_66_JumpingOnTheClouds;

import java.util.*;

/*
	There is a new mobile game that starts with consecutively numbered clouds.
	 Some of the clouds are thunderheads and others are cumulus. 
	 The player can jump on any cumulus cloud having a number that is equal to the number
	  of the current cloud plus 1 or 2.
	 The player must avoid the thunderheads. 
	 Determine the minimum number of jumps it will take to jump from the starting postion to the last
	  cloud.
	   It is always possible to win the game.
	 For each game, you will get an array of clouds numbered  if they are safe or 
	 0 if 1 they must be avoided.
*/
class Result {
	public static int jumpingOnClouds(List<Integer> c) {
		int jump = 0;
		int i=0;
		while(i<c.size()-1) {
			if(i+2==c.size()||c.get(i+2)==1) {
				i++;
				jump++;
			}
			else {
				i=i+2;
				jump++;
			}
		}
		return jump;
	}
}

public class Solution {

	public static void main(String[] args) {
		System.out.println(Result.jumpingOnClouds(Arrays.asList(0, 0, 0, 0, 1, 0)));
	}

}
