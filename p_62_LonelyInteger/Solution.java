package p_62_LonelyInteger;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 	Given an array of integers,
 	 where all elements but one occur twice, find the unique element.
 */
class Result {

	public static int lonelyinteger(List<Integer> a) {
		Collections.sort(a);
		for (int i = 0; i < a.size() - 1; i++) {
			if (a.get(i) == a.get(i + 1))
				i++;
			else
				return a.get(i);
		}
		return a.get(a.size() - 1);
	}
}
public class Solution {
	public static void main(String[] args) {
		System.out.println(Result.lonelyinteger(Arrays.asList(1, 1, 2)));
	}
}
