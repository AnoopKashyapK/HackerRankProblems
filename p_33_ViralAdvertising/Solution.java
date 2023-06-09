package p_33_ViralAdvertising;

/*
 *  HackerLand Enterprise is adopting a new viral advertising strategy.
 *   When they launch a new product, they advertise it to exactly 5 people on social media.
 *   
 *   On the first day, half of those 5 people (i.e.,floor(5/2)=2 ) like the advertisement
 *    and each shares it with 3 of their friends. At the beginning of the second day,
 *      floor(5/2)x3=2x3=6
 *    people receive the advertisement.
 *    
 *    Each day, floor(recipients/2)  of the recipients like the advertisement 
 *    and will share it with 3 friends on the following day. 
 *    Assuming nobody receives the advertisement twice, determine how many people have liked
 *     the ad by the end of a given day, beginning with launch day as day .
 */
class Result {



    public static int viralAdvertising(int n) {
    	int shared=5;
    	int liked=0;
    	int cum=0;
    	for(int i=0;i<n;i++) {
    		liked=shared/2;
    		shared=liked*3;
    		cum=cum+liked;
    	}
		return cum;
    // Write your code here

    }

}
public class Solution {
	public static void main(String[] args) {
		int n=5;
		int l=Result.viralAdvertising(n);
		System.out.println(l);
	}
}
