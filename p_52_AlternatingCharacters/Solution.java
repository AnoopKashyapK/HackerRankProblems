package p_52_AlternatingCharacters;
/*
 	You are given a string containing characters A and B only. 
 	Your task is to change it into a string such that there are no matching adjacent characters. 
 	To do this, you are allowed to delete zero or more characters in the string.

	Your task is to find the minimum number of required deletions.
 */

class Result {

    
    public static int alternatingCharacters(String s) {
    	int count=0;
    	char prev=s.charAt(0);
    	for(int i=1;i<s.length();i++) {
    		if(s.charAt(i)==prev) {
    			count++;
    		}
    		else prev=s.charAt(i);
    	}
    	return count;
   
    }

}
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Result.alternatingCharacters("AABB"));

	}

}
