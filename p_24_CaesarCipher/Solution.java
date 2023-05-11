package p_24_CaesarCipher;
/*
 * Julius Caesar protected his confidential information by encrypting it
 *  using a cipher. Caesar's cipher shifts each letter by a 
 *  number of letters. If the shift takes you past the end of the alphabet,
 *   just rotate back to the front of the alphabet. 
 *   In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
 * */
class Result {
	public static String caesarCipher(String s, int k) {
		k = k % 26;
		String small = "abcdefghijklmnopqrstuvwxyz";
		String cap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String news = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch)) {
				int loc = cap.indexOf(s.charAt(i));
				int newloc=(loc+k)%26;
				ch = cap.charAt(newloc);
				news += ch;
			
			}
			else if (Character.isLowerCase(ch)) {
				int loc = small.indexOf(s.charAt(i));
				int newloc=(loc+k)%26;
				ch = small.charAt(newloc);
				news += ch;
		
			} else
				news +=ch ;

		}
		return news;
	}

}

public class Solution {
	public static void main(String[] args) {
		String s = "Anoop-Kashyap-K";
		int k = 2;
		String cs = Result.caesarCipher(s, k);
		System.out.println(cs);
	}
}
