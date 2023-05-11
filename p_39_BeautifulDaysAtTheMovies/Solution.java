package p_39_BeautifulDaysAtTheMovies;

import java.util.*;

/*
  	Lily likes to play games with integers.  
  	She has created a new game where she determines the difference between a number and its reverse. 
  	For instance, given the number 12, its reverse is 21. Their difference is 9.
  	 The number 120 reversed is 21, and their difference is 99.
  	 
  	 She decides to apply her game to decision making. 
  	 She will look at a numbered range of days and will only go to a movie on a beautiful day.
  	 
  	 Given a range of numbered days,[i...j]  and a number k, determine the number of days in the range
  	  that are beautiful. Beautiful numbers are defined as numbers where |i-reverse(i) |
  	   is evenly divisible by k. If a day's value is a beautiful number, it is a beautiful day.
  	    Return the number of beautiful days in the range.
 */
class Result {

	public static int beautifulDays(int i, int j, int k) {

		int count = 0;
		for (int a = i; a <= j; a++) {

			if (isBeautiful(a, k))
				count++;
		}
		return count;

	}

	public static boolean isBeautiful(int num, int k) {
		String nums = num + "";
		String revs = "";

		for (int i = nums.length() - 1; i >= 0; i--) {
			revs = revs + nums.charAt(i);
		}

		int rev = Integer.parseInt(revs);
		if (Math.abs(num - rev) % k == 0)
			return true;

		return false;
	}

}

public class Solution {
	public static void main(String[] args) {
		System.out.println(Result.beautifulDays(20, 23, 6));
	}
}
