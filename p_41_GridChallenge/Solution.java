package p_41_GridChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
  	Given a square grid of characters in the range ascii[a-z], 
  	rearrange elements of each row alphabetically, ascending. 
  	Determine if the columns are also in ascending alphabetical order, top to bottom.
  	 Return YES if they are or NO if they are not.
  	 
  	 example:
  	 grid=['abc','ade','efg']
  	 
  	 The grid is illustrated below.

		a b c
		a d e
		e f g
		
		The rows are already in alphabetical order. 
		The columns a a e, b d f and c e g are also in alphabetical order,
		 so the answer would be YES. Only elements within the same row can be rearranged.
		  They cannot be moved to a different row.
*/

class Result {


    public static String gridChallenge(List<String> grid) {
    	for(int i=0;i<grid.size();i++) {
    		char[] c= grid.get(i).toCharArray();
    		Arrays.sort(c);
    		grid.set(i, new String(c));
    		
    	}
    	for(int p=0;p<grid.get(0).length()-1;p++) {
    		for(int q=p;q<grid.get(0).length();q++) {
    			if(!(grid.get(p).charAt(q)<=grid.get(p+1).charAt(q))) {
    				return "NO";
    			}
    		}
    	}
		return "YES";
    
    }

}
public class Solution {
	public static void main(String[] args) {
		String[] g= {"bbc","ade","efg"};
		List<String> grid=new ArrayList<String>();
		for(String s:g) grid.add(s);
		System.out.println(Result.gridChallenge(grid));
	}
}
