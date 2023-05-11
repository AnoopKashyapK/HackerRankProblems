package p_68_TwoStrings;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 	Given two strings, 
 	determine if they share a common substring.
 	 A substring may be as small as one character.
 	 Example
 	 s1="and"
 	 s2="art"
 	 These share the common substring a.
 */
class Result {
	public static String twoStrings(String s1, String s2) {
		String s = "";
		List<Character> S1 = s1.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
		List<Character> S2 = s2.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
		Collections.sort(S1);
		Collections.sort(S2);
		Set<Character> set1 = new HashSet<>();
		set1.addAll(S1);
		S1.clear();
		S1.addAll(set1);
		System.out.println(S1);
		Set<Character> set2 = new HashSet<>();
		set2.addAll(S2);
		S2.clear();
		S2.addAll(set2);
		System.out.println(S2);
		String one=S1.toString()
                .substring(1,3* S1.size() - 1)
                .replaceAll(", ", "");
		String two=S2.toString()
                .substring(1,3* S2.size() - 1)
                .replaceAll(", ", "");
		for (int i = 0; i < Math.min(one.length(), two.length()); i++) {
			if (one.contains(Character.toString(two.charAt(i)))) {
				s = s + "" + two.charAt(i);
			}
		}
		
		return s.length() == 0 ? "NO" : "YES";
	}

}

public class Solution {
	public static void main(String[] args) {
		System.out.println(Result.twoStrings("wouldyoulikefries", "abcabcabcabcabcabc"));
	}
}
