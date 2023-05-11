package p_43_SherlockAndSquares;

/*
 	Watson likes to challenge Sherlock's math ability.
 	 He will provide a starting and ending value that describe a range of integers, 
 	 inclusive of the endpoints. 
 	 Sherlock must determine the number of square integers within that range.
 	 Note: A square integer is an integer which is the square of an integer, e.g.1,4,9,16,25 .

	Example
	a=24;
	b=49;
	 
	There are three square integers in the range:25, 36  and 49. Return 3.
*/
class Result {

	public static int squares(int a, int b) {
		int A=(int)Math.sqrt(a);
		int B=(int)Math.sqrt(b);
		if (A*A>=a) return B-A+1;
		return B-A;
		

	}

}

public class Solution {

	public static void main(String[] args) {
		System.out.println(Result.squares(24, 49));
	}

}
