package p_09_superReducedString;

/* Problem 9 SuperReducedString
 * Reduce a string of lowercase characters in range ascii[‘a’..’z’]by doing a series of operations.
   In each operation, select a pair of adjacent letters that match, and delete them.

	Delete as many characters as possible using this method and return the resulting string.
 	If the final string is empty, return Empty String
 	*/
class Result {
	public static String superReducedString(String s) {
		// Write your code here
		char[] stack = new char[s.length()];
		int i = 0;
		for (int j = 0; j < s.length(); j++) {
			if (i > 0 && stack[i - 1] == s.charAt(j)) {
				i--;
			} else {
				stack[i] = s.charAt(j);
				i++;
			}
		}
		 String rs =new String(stack,0,i);
		 if(rs.isEmpty()) return "Empty String";
		 return rs;

	}
}

public class Solution {

	public static void main(String[] args) {
		String s = "aabbcddc";
		String rs1 = Result.superReducedString(s);
		System.out.println(rs1);

	}

}
