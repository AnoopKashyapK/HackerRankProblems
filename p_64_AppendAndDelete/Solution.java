package p_64_AppendAndDelete;

/*
 	You have two strings of lowercase English letters. 
 	You can perform two types of operations on the first string:

	1)Append a lowercase English letter to the end of the string.
	2)Delete the last character of the string. 
		Performing this operation on an empty string results in an empty string.
	Given an integer,k , and two strings, s and t, determine whether 
	or not you can convert s to t by performing exactly k of the above operations on s.
	 If it's possible, print Yes. Otherwise, print No.
 */
import java.util.*;

class Result {
	public static String appendAndDelete(String s, String t, int k) {
		int ind = 0;
		while (ind < s.length() && ind < t.length()) {
			if (s.charAt(ind) == t.charAt(ind)) {
				ind++;
			} else
				break;
		}
		int min = 0;
		min = s.length() + t.length() - 2 * ind;
		if (k < min)
			return "No";
		if (k >= s.length() + t.length())
			return "Yes";
		if ((k - min) % 2 == 0)
			return "Yes";
		return "No";
	}
}

public class Solution {

	public static void main(String[] args) {
		System.out.println(Result.appendAndDelete("hackerhappy", "hackerhappy", 7));
	}

}
