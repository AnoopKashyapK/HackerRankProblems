package p_51_MaximumPerimeterTriangle;

import java.util.*;

/*
	Given an array of stick lengths, use 3 of them to construct a non-degenerate triangle 
	with the maximum possible perimeter. 
	Return an array of the lengths of its sides as 3 integers in non-decreasing order.

	If there are several valid triangles having the maximum perimeter:
	
	Choose the one with the longest maximum side.
	If more than one has that maximum, choose from them the one with the longest minimum side.
	If more than one has that maximum as well, print any one them.
	If no non-degenerate triangle exists, return [-1].
*/
//− a + b > c a + c > b b + c > a
class Result {

    

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
		List<Integer> ans=new ArrayList<Integer>();
		Collections.sort(sticks);
		for(int i=sticks.size()-1;i>1;i--) {
			if(sticks.get(i)<(sticks.get(i-1)+sticks.get(i-2))){
				ans.add(sticks.get(i-2));
				ans.add(sticks.get(i-1));
				ans.add(sticks.get(i));
				break;
			}
		}
		if(ans.isEmpty()) {
			ans.add(-1);
		}
    	return ans;
    }

}
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2, 3,4,5,10};
		List a=new ArrayList<Integer>();
		for(int i:arr) a.add(i);
		System.out.println(Result.maximumPerimeterTriangle(a));

	}

}
