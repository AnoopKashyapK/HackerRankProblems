package p_46_EqualizeTheArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
	Given an array of integers, determine the minimum number of elements to 
	delete to leave only elements of equal value.
*/

class Result {

	public static int equalizeArray(List<Integer> arr) {
		List<Integer> cr = new ArrayList<Integer>();
		Collections.sort(arr);
		int count = 1;
		for (int i = 0; i < arr.size() - 1; i++) {
			if (arr.get(i) == arr.get(i + 1))
				count++;
			else {
				cr.add(count);
				count = 1;
			}
		}
		cr.add(count);

		Collections.sort(cr);
		int max = cr.get(cr.size() - 1);
		return arr.size() - max;
	}
}

public class Solution {

	public static void main(String[] args) {
		int[] a = { 3, 3, 2, 1, 3 };
		List<Integer> arr = new ArrayList();
		for (int i : a)
			arr.add(i);
		System.out.println(Result.equalizeArray(arr));
	}

}
