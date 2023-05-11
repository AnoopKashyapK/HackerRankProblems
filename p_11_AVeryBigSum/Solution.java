package p_11_AVeryBigSum;
/*
 * Problem 11 A very big sum;
 * In this challenge, you are required to calculate and 
 * print the sum of the elements in an array, 
 * keeping in mind that some of those integers may be quite large.

	Function Description

	Complete the aVeryBigSum function in the editor below. 
	It must return the sum of all array elements.
 */
import java.util.ArrayList;
import java.util.List;

class Result {

   

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
    	long sum=0;
    	for(int i=0;i<ar.size();i++) {
    		sum=sum+ar.get(i);
    	}
    	return sum;
    }

}

public class Solution {
	public static void main(String[] args) {
		List<Long> ar=new ArrayList<Long>();
		long[] array= {1,2,3,4,5};
		for(long x:array) ar.add(x);
		long sum=Result.aVeryBigSum(ar);
		System.out.println("Sum of List :"+sum);
	}

} 
 