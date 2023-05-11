package p_45_BigSorting;

import java.math.BigInteger;
import java.util.*;
/*
 	Consider an array of numeric strings where each string is a positive number with anywhere from  
 	1 to 10^6 digits. Sort the array's elements in non-decreasing,
 	 or ascending order of their integer values and return the sorted array.
 	 Example
		unsorted=['1','200','150','3'];
	Return the array ['1', '3', '150', '200'].
*/
import java.util.Arrays;
import java.util.List;

class Result {

	public static List<String> bigSorting(List<String> unsorted) {
		Comparator<String> comp = new Comparator<String>() {
			public int compare(String a, String b) {
				if (a.length() > b.length())
					return 1;
				else if (a.length() < b.length())
					return -1;
				else {
					BigInteger a1 = new BigInteger(a);
					BigInteger b1 = new BigInteger(b);
					return a1.compareTo(b1);
				}
			}
		};
		Collections.sort(unsorted, comp);
		return unsorted;
	}
}

public class Solution {
	public static void main(String[] args) {
		String arr[] = { "1", "3", "150", "200" };
		List<String> unsorted = new ArrayList<String>();
		for (String i : arr)
			unsorted.add(i);
		System.out.println(Result.bigSorting(unsorted));

	}
}
/*
 * long[] nums=new long[unsorted.size()]; for(int i=0;i<unsorted.size();i++) {
 * long num=Long.parseLong(unsorted.get(i)); nums[i]=num; } Arrays.sort(nums);
 * for(int j=0;j<unsorted.size();j++) { unsorted.set(j, nums[j]+""); } return
 * unsorted;
 */
