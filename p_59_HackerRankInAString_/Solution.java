package p_59_HackerRankInAString_;

/*
	We say that a string contains the word hackerrank if a subsequence of its characters
	 spell the word hackerrank. Remeber that a subsequence maintains the order of characters 
	 selected from a sequence.
*/
class Result {

	public static String hackerrankInString(String s) {
		String HR = "hackerrank";
		boolean complete = false;
		boolean finish = false;
		int i = 0;
		while (i < HR.length()) {
			for (int j = 0; j < s.length(); j++) {
				if (HR.charAt(i) == s.charAt(j)) {
					i++;
					if (i == HR.length() - 1) {
						complete = true;
						break;
					}
				}
				if (j == s.length() - 1)
					finish = true;
			}

			if (i == HR.length() - 1) {
				complete = true;
				break;
			}
			if (finish)
				break;
		}
		if (complete)
			return "YES";
		return "NO";
	}

}

public class Solution {
	public static void main(String[] args) {
		System.out.println(Result.hackerrankInString("hereiamstackerrank"));
	}
}
