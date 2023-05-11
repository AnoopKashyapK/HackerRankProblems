package p_15_DiagonalDifference;
/*
 	Given a square matrix, calculate the absolute difference between 
 	the sums of its diagonals.

	For example, the square matrix  is shown below:
	
	1 2 3
	4 5 6
	9 8 9 
 * */
import java.util.ArrayList;
import java.util.List;

class Result {


    public static int diagonalDifference(List<List<Integer>> arr) {
		int sum1=0;
		int sum2=0;
		int diff=0;
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i).get(i));
			sum1=sum1+arr.get(i).get(i);
	
			System.out.println(arr.get(i).get(arr.size()-i-1));
			sum2=sum2+arr.get(i).get(arr.size()-i-1);
		}
		diff=sum1-sum2;
    	return diff>=0 ? diff : diff*(-1);
    // Write your code here

    }

}
public class Solution {
	public static void main(String[] args) {
		List<List<Integer>> arr=new ArrayList<List<Integer>>();
		List<Integer> l1=new ArrayList<Integer>();

		List<Integer> l2=new ArrayList<Integer>();

		List<Integer> l3=new ArrayList<Integer>();

		List<Integer> l4=new ArrayList<Integer>();
		int[] r1= {1,2,3,4};
		int[] r2= {4,5,6,3};
		int[] r3= {9,8,9,6};
		int[] r4= {2,8,9,6};
		for(int a:r1) l1.add(a);
		for(int b:r2) l2.add(b);
		for(int c:r3) l3.add(c);
		for(int d:r4) l4.add(d);
		arr.add(l1);
		arr.add(l2);
		arr.add(l3);
		arr.add(l4);
		int diff=Result.diagonalDifference(arr);
		System.out.println(diff);
		
		
	}
}
