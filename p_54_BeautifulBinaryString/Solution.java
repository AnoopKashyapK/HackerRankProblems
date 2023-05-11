package p_54_BeautifulBinaryString;

import java.util.ArrayList;
import java.util.List;

/*
	Alice has a binary string. 
	She thinks a binary string is beautiful if and only if it doesn't contain the substring 
	"010".
	In one step, Alice can change a 0 to a 1 or vice versa.
	Count and print the minimum number of steps needed to make Alice see the string as beautiful.
	 
*/
class Result {

	public static int beautifulBinaryString(String b) {
		int count = 0;
		List<Character> list = new ArrayList<Character>();
		for (int j = 0; j < b.length(); j++) {

			list.add(b.charAt(j));
		}

		for (int i = 0; i < list.size() - 2; i++) {
			if (list.get(i) == '0' && list.get(i + 1) == '1' && list.get(i + 2) == '0') {
				count++;
				list.set(i + 2, '1');
			}
		}
		return count;

	}

}

public class Solution {

	public static void main(String[] args) {
		System.out.println(Result.beautifulBinaryString("010"));
	}

}
