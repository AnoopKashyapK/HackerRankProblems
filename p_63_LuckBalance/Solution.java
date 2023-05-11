package p_63_LuckBalance;

import java.util.*;

/*
 	Lena is preparing for an important coding competition that is preceded by a number of sequential 
 	preliminary contests. 
 	Initially, her luck balance is 0. She believes in "saving luck",
 	 and wants to check her theory. 
 	 Each contest is described by two integers, L[i] and T[i]:
 	 * L[i] is the amount of luck associated with a contest.
 	  If Lena wins the contest, her luck balance will decrease by L[i];
 	   if she loses it, her luck balance will increase by L[i].
 	 * T[i] denotes the contest's importance rating.
 	  It's equal to 1 if the contest is important, and it's equal to 0 if it's unimportant.
 	  If Lena loses no more than k important contests,
 	   what is the maximum amount of luck she can have after competing in all the preliminary contests?
 	    This value may be negative.
*/

class Result {

	public static int luckBalance(int k, List<List<Integer>> contests) {
		int luck = 0;
		List<Integer> luckList = new ArrayList<Integer>();
		for (int i = 0; i < contests.size(); i++) {
			if (contests.get(i).get(1) == 0) {
				luck = luck + contests.get(i).get(0);
			} else
				luckList.add(contests.get(i).get(0));
		}
		Collections.sort(luckList);
		Collections.reverse(luckList);
		System.out.println(luckList);
		for (int j = 0; j < luckList.size(); j++) {
			if(j<k) {
			luck = luck + luckList.get(j);
			}
			else luck = luck - luckList.get(j);
		}
		return luck;
	}
}

public class Solution {

	public static void main(String[] args) {
		System.out.println(Result.luckBalance(3, Arrays.asList(Arrays.asList(5, 1), Arrays.asList(2, 1),
				Arrays.asList(1, 1), Arrays.asList(8, 1), Arrays.asList(10, 0), Arrays.asList(5, 0))));

	}

}