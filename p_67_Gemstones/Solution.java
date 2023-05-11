package p_67_Gemstones;

import java.util.*;

/*
There is a collection of rocks where each rock has various minerals embeded in it. 
Each type of mineral is designated by a lowercase letter in the range ascii[a-z].
There may be multiple occurrences of a mineral in a rock. 
A mineral is called a gemstone if it occurs at least once in each of the rocks in the collection.
Given a list of minerals embedded in each of the rocks, 
display the number of types of gemstones in the collection.
Example
arr=['abc','abc','bc']
The minerals b and c appear in each rock, so there are 2 gemstones.

*/
class Result {

	public static int gemstones(List<String> arr) {
		String gem = "";
		for (char i = 'a'; i <= 'z'; i++) {
			int count = 0;
			boolean Break = false;
			for (int j = 0; j < arr.size(); j++) {
				
				if (!arr.get(j).contains(Character.toString(i))) {
					Break = true;
					break;
				}
			}
			if (!Break) {
				gem = gem + "" + i;
			}

		}
		System.out.println(gem);
		return gem.length();

	}

}

public class Solution {

	public static void main(String[] args) {
		System.out.println(Result.gemstones(Arrays.asList("abcdde", "baccd", "eeabg")));

	}

}
