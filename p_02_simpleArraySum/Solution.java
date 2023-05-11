package p_02_simpleArraySum;

/*
 * Given an array of integers, find the sum of its elements.
	For example, if the array 
	array=[1,2,3],
	1+2+3=6
   so return 6.
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Result {

	/*
	 * Complete the 'simpleArraySum' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY ar as parameter.
	 */

	public static int simpleArraySum(List<Integer> ar) {
		int sum = 0;
		for (int n : ar) {
			sum = sum + n;
		}
		return sum;
	}
}

public class Solution {
	public static void main(String[] args) throws IOException {

		int arr[] = { 1, 2, 3 };
		List<Integer> ar = new ArrayList<Integer>();
		for (int i : arr) {
			ar.add(i);
		}
		System.out.println(ar);
		int result = Result.simpleArraySum(ar);
		System.out.println("Sum is " + result);

	}
}
