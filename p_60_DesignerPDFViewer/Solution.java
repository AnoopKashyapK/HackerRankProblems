package p_60_DesignerPDFViewer;

import java.util.*;

/*
	When a contiguous block of text is selected in a PDF viewer, the selection is highlighted with a blue rectangle. 
	In this PDF viewer, each word is highlighted independently. For example:
	There is a list of 26 character heights aligned by index to their letters.
	 For example, 'a' is at index 0 and 'z' is at index 25. There will also be a string.
     Using the letter heights given, determine the area of the rectangle highlight in 
     mm^2 assuming all letters are 1mm wide.
*/
class Result {

	public static int designerPdfViewer(List<Integer> h, String word) {
		// Write your code here

		List<Character> az = new ArrayList<Character>();
		for (char i = 'a'; i <= 'z'; i++) {
			az.add(i);
		}
		int max = 0;
		for (int j = 0; j < word.length(); j++) {
			char c = word.charAt(j);
			int height = h.get(az.indexOf(c));
			max = Math.max(max, height);
		}
		return max * word.length();
	}

}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Result.designerPdfViewer(
				Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7), "zaba"));

	}

}
