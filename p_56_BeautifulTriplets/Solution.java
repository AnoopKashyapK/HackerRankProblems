package p_56_BeautifulTriplets;

import java.util.*;

/*
	Given a sequence of integers a, a triplet (a[i],a[j],a[k]) is beautiful if:
	- i<j<k
	- a[j]-a[i]=a[k]-a[j]=d
	Given an increasing sequenc of integers and the value of d,
	 count the number of beautiful triplets in the sequence.
*/
class Result {

	public static int beautifulTriplets(int d, List<Integer> arr) {
		int count = 0;
		for (int i = 0; i < arr.size() - 2; i++) {
			for(int j=i+1;j<arr.size()-1;j++) {
				for(int k=j+1;k<arr.size();k++) {
					 if (arr.get(j) - arr.get(i) == d && arr.get(k) - arr.get(j) == d) count++;
				}
			}
		}
		return count;

	}
	public static int findK(int d,int count) {
		
		return count;
	}
	

}

public class Solution {
	public static void main(String[] args) {
		System.out.println(Result.beautifulTriplets(3, Arrays.asList(1, 2, 4, 5, 7, 8, 10)));
	}
}
