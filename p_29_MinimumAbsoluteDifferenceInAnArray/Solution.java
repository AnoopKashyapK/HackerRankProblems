package p_29_MinimumAbsoluteDifferenceInAnArray;

import java.util.ArrayList;
import java.util.Collections;
/*
	 *The absolute difference is the positive difference between two values a and b, 
	 *is written |a-b| or |b-a|  and they are equal.
	 * If a=3 and , b=2 ,|2-3|=|3-2|=1 .
	 * Given an array of integers, 
	 * find the minimum absolute difference between any two elements in the array.
	
	Example. arr=[-2,2,4]
	
	There are 3 pairs of numbers:[-2,2] ,[-2,4] and [2,4]. The absolute differences for these pairs are
	|(-2)-2|=4 ,|(-2)-4|=6  and |2-4|=2 . 
	The minimum absolute difference is 2. 
 */
import java.util.List;

class Result {

//	public static int minimumAbsoluteDifference(List<Integer> arr) {
//		List<Integer> diff=new ArrayList<Integer>();
//		for(int i=0;i<arr.size()-1;i++) {
//			for(int j=i+1;j<arr.size();j++) {
//				System.out.println("("+arr.get(i)+","+arr.get(j)+")");
//				int sub=arr.get(i)-arr.get(j);
//				if(sub<0) sub=sub*-1;
//				diff.add(sub);
//			}
//		}
//		Collections.sort(diff);
//		return diff.get(0);
//	}

	public static int minimumAbsoluteDifference(List<Integer> arr) {
		List<Integer> diff = new ArrayList<Integer>();
		Collections.sort(arr);
		for (int i = 0; i < arr.size() - 1; i++) {
			int sub = arr.get(i) - arr.get(i + 1);
			if (sub < 0)
				sub = sub * -1;
			diff.add(sub);
		}
		Collections.sort(diff);
		return diff.get(0);
	}

}

public class Solution {
	public static void main(String[] args) {
		int a[] = { -59, -36, -13, 1, -53, -92, -2, -96, -54, 75 };
		List<Integer> arr = new ArrayList<Integer>();
		for (int i : a)
			arr.add(i);
		int n = Result.minimumAbsoluteDifference(arr);
		System.out.println(n);
	}
}
