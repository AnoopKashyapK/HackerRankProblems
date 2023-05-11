package p_16_BirthdayCakeCandles;
/*
 * You are in charge of the cake for a child's birthday. 
 * You have decided the cake will have one candle for each year
 *  of their total age. They will only be able to blow out the tallest
 *   of the candles. 
 * Count how many candles are tallest.
 * Example

	candles=[4,4,1,3];
The maximum height candles are 4 units high. 
There are 2 of them, so return 2.
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Result {

    

    public static int birthdayCakeCandles(List<Integer> candles) {
    	int max=0;
    	Collections.sort(candles);
    	int greatest=candles.get(candles.size()-1);
    	for(int i=0;i<candles.size();i++) {
    		if(greatest==candles.get(i) ) {
    			max++;
    		}
    	}
    	return max;
    // Write your code here

    }

}
public class Solution {
	public static void main(String[] args) {
		int[] arr = {1,1,1,1,1};
		List<Integer> candles=new ArrayList<Integer>();
		for(int a:arr) candles.add(a);
		int max=Result.birthdayCakeCandles(candles);
		System.out.println(max);
		
		}
 	
}
