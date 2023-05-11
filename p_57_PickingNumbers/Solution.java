package p_57_PickingNumbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 	Given an array of integers, find the longest subarray where 
 	the absolute difference between any two elements is less than or equal to 1.
 */
class Result {
	public static int pickingNumbers(List<Integer> a) {
		int maxCount = 0;
		int count = 1;
		Collections.sort(a);
		for (int i = 0; i < a.size(); i++) {
			for (int j = i + 1; j < a.size(); j++) {
				if (a.get(j) - a.get(i) <= 1)
					count++;
			}
			if (count > maxCount)
				maxCount = Math.max(maxCount, count);
			count = 1;

		}
		return maxCount;
	}
}

public class Solution {
	public static void main(String[] args) {
		System.out.println(Result.pickingNumbers(Arrays.asList(1, 2, 2, 3, 1, 2)));
	}
}
