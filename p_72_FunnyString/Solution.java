package p_72_FunnyString;

import java.util.*;

/*
	In this challenge, you will determine whether a string is funny or not.
	To determine whether a string is funny, create a copy of the string in reverse e.g.abc -> cba .
	Iterating through each string, compare the absolute difference in the ascii values of the characters
	 at positions 0 and 1, 1 and 2 and so on to the end.
	 If the list of absolute differences is the same for both strings, they are funny.

	Determine whether a give string is funny. If it is, return Funny, otherwise return Not Funny.
	Example
	
	s="lmnop"
	
	The ordinal values of the charcters are [108,109,110,111,112].s(reverse)="ponml"
	and the ordinals are [112,111,110,109,108].
	The absolute differences of the adjacent elements for both strings are [1,1,1,1],
	so the answer is Funny.
*/
class Result {


    public static String funnyString(String s) {
    	List<Integer> val=new ArrayList<Integer>();
    	for(int i=0;i<s.length();i++) {
    		val.add((int)s.charAt(i));
    	}
    	List<Integer> diff=new ArrayList<>();
    	for(int j=0;j<val.size()-1;j++) {
    		diff.add(Math.abs(val.get(j)-val.get(j+1)));
    	}
    	List<Integer> revdiff=new ArrayList<>();
    	for(int j=val.size()-1;j>0;j--) {
    		revdiff.add(Math.abs(val.get(j)-val.get(j-1)));
    	}
    	//System.out.println(diff+"\n"+revdiff);
    	
    	return diff.equals(revdiff)?"Funny":"Not Funny";
    }

}
public class Solution {
	public static void main(String[] args) {
		System.out.println(Result.funnyString("acxzpq"));
	}
}
