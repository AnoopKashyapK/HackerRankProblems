package p_28_StrongPassword;

/*
 * Louise joined a social networking site to stay in touch with her friends.  
 * The signup page required her to input a name and a password. 
 * However, the password must be strong. 
 * The website considers a password to be strong if it satisfies the following criteria:

Its length is at least 6.
It contains at least one digit.
It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%^&*()-+

She typed a random string of length n in the password field but wasn't sure if it was strong. Given the string she typed, can you find the minimum number of characters she must add to make her password strong?

Note: Here's the set of types of characters in a form you can paste in your solution:

numbers = "0123456789"
lower_case = "abcdefghijklmnopqrstuvwxyz"
upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
special_characters = "!@#$%^&*()-+"
 */

class Result {

	/*
	 * Complete the 'minimumNumber' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER n 2. STRING password
	 */

	// (!Character.isDigit(ob1)&& !Character.isLetter(ob1)&&
	// !Character.isWhitespace(ob1))

	public static int minimumNumber(int n, String password) {
		int add = 0;
		boolean num = false;
		boolean uc = false;
		boolean lc = false;
		boolean sc = false;
		int count = 4;

		for (int i = 0; i < password.length(); i++) {

			if (Character.isUpperCase(password.charAt(i)) && uc == false) {
				count--;
				uc = true;
			}
			if (Character.isLowerCase(password.charAt(i)) && lc == false) {
				count--;
				lc = true;
			}
			if (Character.isDigit(password.charAt(i)) && num == false) {
				count--;
				num = true;
			}
			if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))
					&& !Character.isWhitespace(password.charAt(i)) && sc == false) {
				sc = true;
				count--;
			}
		}
		if (count > 0 || n < 6) {
			add = add + count;
			n = n + add;
			if (n < 6) {
				add = add + (6 - n);
			}
		}

		return add;

	}

}

public class Solution {
	public static void main(String[] args) {
		String s = "Ab1";
		int n = Result.minimumNumber(s.length(), s);
		System.out.println(n);
	}
}
