package p_53_Pangrams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

/*
 	A pangram is a string that contains every letter of the alphabet. 
 	Given a sentence determine whether it is a pangram in the English alphabet.
 	 Ignore case. Return either pangram or not pangram as appropriate.
 */
class Result {

	/*
	 * Complete the 'pangrams' function below.
	 *
	 * The function is expected to return a STRING. The function accepts STRING s as
	 * parameter.
	 */

	public static String pangrams(String s) {
		List<Character> aToz = new ArrayList<Character>();
		for (char j = 'a'; j <= 'z'; j++) {
			aToz.add(j);
		}
		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				continue;
			}
			char c = Character.toLowerCase(s.charAt(i));
			list.add(c);
		}
		Set<Character> set = new LinkedHashSet<Character>();
		set.addAll(list);
		list.clear();
		list.addAll(set);
		Collections.sort(list);
		System.out.println(list);
		if (aToz.equals(list))
			return "pangram";
		return "not pangram";
	}

}

public class Solution {

	public static void main(String[] args) {
		System.out.println(Result.pangrams("We promptly judged antique ivory buckles for the next prize"));

	}

}
