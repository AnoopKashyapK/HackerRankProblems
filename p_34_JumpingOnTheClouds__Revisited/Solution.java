package p_34_JumpingOnTheClouds__Revisited;
/*
 *  A child is playing a cloud hopping game.
 *   In this game, there are sequentially numbered clouds that can be thunderheads or cumulus clouds.
 *    The character must jump from cloud to cloud until it reaches the start again.
 *    
 *    
	There is an array of clouds, c and an energy level e=100. 
	The character starts from c[0] and uses 1 unit of energy to make a jump of size k to cloud c[(i+k)%n]. 
	If it lands on a thundercloud,c[i]=1 , its energy (e) decreases by 2 additional units. 
	The game ends when the character lands back on cloud 0.
	
	Given the values of n, k, and the configuration of the clouds as an array c, 
	determine the final value of e after the game ends.
 *    
 */

public class Solution {

static int jumpingOnClouds(int[] c, int k) {
	int e=100;
	for(int i=k;i<e;i=i+k) {
		if(i>=c.length) i=i%c.length;
		if(c[i]==0) e--;
		if(c[i]==1) e=e-3;
		if(i==0) break;
	}
	
	return e;
}

	public static void main(String[] args) {
		int[] c= {0,0,1,0 };
		int e=jumpingOnClouds(c, 2);
		System.out.println(e);
	}
}
