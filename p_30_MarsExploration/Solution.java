package p_30_MarsExploration;
/*
 *	A space explorer's ship crashed on Mars! They send a series of SOS messages to Earth for help.
 *  Letters in some of the SOS messages are altered by cosmic radiation during transmission.
 *   Given the signal received by Earth as a string, s , 
 *   determine how many letters of the SOS message have been changed by radiation
 */
class Result {


    public static int marsExploration(String s) {
		int count=0;
    	for(int i=0;i<s.length()-2;i=i+3) {
    		if(s.charAt(i)!='S') count++;
    		if(s.charAt(i+1)!='O') count++;
    		if(s.charAt(i+2)!='S') count++;
    	}
    	
    	return count;

    }

}

public class Solution {
	public static void main(String[] args) {
		String s="SOSTOT";
		int n=Result.marsExploration(s);
		System.out.println(n);
		
	}
}
