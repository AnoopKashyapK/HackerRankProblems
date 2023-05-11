package p_13_SubArrayDivision;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

/*
 * Problem 13 Sub ArrayDivision
 Two children, Lily and Ron, want to share a chocolate bar. 
 Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
Determine how many ways she can divide the chocolate.
 */
class Result {

	public static int birthday(List<Integer> s, int d, int m) {
		int count = 0;
		int sum = 0;
		for (int i = 0; i <= s.size() - m; i++) {
			sum = 0;
			for (int j = i; j < i + m; j++) {
				int current = s.get(j);
				sum = sum + s.get(j);
			}
			// System.out.println("sum at "+i+" is "+sum);
			if (sum == d) {
				count++;
			}
		}
		return count;
	}

}

public class Solution {
	public static void main(String[] args) {

		int[] ar = { 1, 2, 1, 3, 2 };
		int d = 3;
		int m = 2;
		List<Integer> s = new ArrayList<Integer>();
		for (int x : ar)
			s.add(x);
		int count = Result.birthday(s, d, m);
		System.out.println(count);
	}

}
