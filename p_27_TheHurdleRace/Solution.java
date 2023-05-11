package p_27_TheHurdleRace;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/*
 * A video player plays a game in which the character competes in a hurdle race. 
 * Hurdles are of varying heights, and the characters have a maximum height they can jump.
 * There is a magic potion they can take that will increase their maximum jump height by 1 unit 
 * for each dose.
 *  How many doses of the potion must the character take to be able to jump all of the hurdles.
 *   If the character can already clear all of the hurdles, return 0. 
 */
import java.util.List;

class Result {

    /*
     * Complete the 'hurdleRace' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY height
     */

    public static int hurdleRace(int k, List<Integer> height) {
    	Collections.sort(height);
    	int large=height.get(height.size()-1);
    	if(k>=large) return 0;
    	else return large-k;
    	
    }

}
public class Solution {
	public static void main(String[] args) {
		int arr[]= {1 ,6 ,3 ,5 ,2};
		List<Integer> a=new ArrayList<Integer>();
		for(int i:arr) a.add(i);
		int k=Result.hurdleRace(4, a);
		System.out.println(k);
	}
}
