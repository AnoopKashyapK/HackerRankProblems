package p_36_Marcs_Cakewalk;

import java.util.ArrayList;
import java.util.Collections;
/*
 	Marc loves cupcakes, but he also likes to stay fit. 
 	Each cupcake has a calorie count, and Marc can walk a distance to expend those calories.
 	 If Marc has eaten j cupcakes so far, after eating a cupcake with c calories he must walk at least 
 	 (2^j)Xc  miles to maintain his weight.
 */
import java.util.List;

class Result {

	public static long marcsCakewalk(List<Integer> calorie) {
		long cal = 0;
		Collections.sort(calorie);
		Collections.reverse(calorie);
		for (int j = 0; j < calorie.size(); j++) {
			cal = (long) (cal + ((Math.pow(2, j)) * calorie.get(j)));
		}

		return cal;
	}

}

public class Solution {
	public static void main(String[] args) {

		List<Integer> calorie = new ArrayList<Integer>();
		int[] arr = { 5, 10, 7 };
		for (int i : arr)
			calorie.add(i);
		long cal = Result.marcsCakewalk(calorie);
		System.out.println(cal);
	}
}
