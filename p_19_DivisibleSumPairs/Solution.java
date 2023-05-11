package p_19_DivisibleSumPairs;
/*
 * Given an array of integers and a positive integer k , 
 * determine the number of (i,j)  pairs where i<j and  ar[i]+ar[j]  is divisible by k .

Example

ar=[1,2,3,4,5,6]
k=5

Three pairs meet the criteria: [1,4] , [2,3]  and [4,6] so return 3 
 * */
import java.util.ArrayList;
import java.util.List;

class Result {
	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		int pairs = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((ar.get(i) + ar.get(j)) % k == 0) {
					pairs++;
				}
			}
		}
		return pairs;
		// Write your code here

	}

}

public class Solution {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 6, 1, 2 };
		List<Integer> ar = new ArrayList<Integer>();
		for (int a : arr)
			ar.add(a);
		int k = 3;
		int pairs = Result.divisibleSumPairs(ar.size(), k, ar);
		System.out.println(pairs);
	}

}
