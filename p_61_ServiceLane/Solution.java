package p_61_ServiceLane;

import java.util.*;

/*
 	A driver is driving on the freeway. 
 	The check engine light of his vehicle is on, and the driver wants to get service immediately.
 	 Luckily, a service lane runs parallel to the highway. It varies in width along its length.
 	 You will be given an array of widths at points along the road (indices),
 	 then a list of the indices of entry and exit points. 
 	 Considering each entry and exit point pair, 
 	 calculate the maximum size vehicle that can travel that segment of the service lane safely.
 */
class Result {

	public static List<Integer> serviceLane(int n, List<List<Integer>> cases,List<Integer> width) {
		// Write your code here
		int min=0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<cases.size();i++) {
			for(int j=cases.get(i).get(0);j<=cases.get(i).get(1);j++) {
				
				//min==0?min=width.get(j):min=Math.min(width.get(j), min);
				if(min==0) min=width.get(j);
				else {
					min=Math.min(width.get(j), min);
				}
			}
			list.add(min);
			min=0;
		}
		return list;
	}
}

public class Solution {

	public static void main(String[] args) {
		System.out.println(Result.serviceLane(8, Arrays.asList(Arrays.asList(0, 3),
				Arrays.asList(4, 6),Arrays.asList(6, 7),
				Arrays.asList(3, 5),Arrays.asList(0, 7)), 
				Arrays.asList(2, 3, 1, 2, 3, 2, 3, 3)));
	}

}
