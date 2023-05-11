package p_05_staircase;
//	Staircase detail
//	
//	This is a staircase of size : N=4
//	
//	   #
//	  ##
//	 ###
//	####

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
    	for(int i=0;i<n;i++) {
    		for(int j=1;j<=n;j++) {
    			if(j<n-i) {
    				System.out.print(" ");
    			}
    			else {
    				System.out.print("#");
    			}
    		}
    		if(i!=n-1)
    		System.out.println();
    	}
    }
}
public class Solution {
	public static void main(String[] args) {
			int n=4;
		 Result.staircase(n);
	}
}
