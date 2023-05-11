package p_12_Plus_Minus;
/*
 * Given an array of integers, 
 * calculate the ratios of its elements that are positive, 
 * negative, and zero. Print the decimal value of each 
 * fraction on a new line with 6 places after the decimal.
 * */
import java.util.ArrayList;
import java.util.List;

class Result {
	public static void plusMinus(List<Integer> arr) {
		// Write your code here
		double cp = 0, cn = 0, cz = 0;               
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > 0)
				cp++;

			else if (arr.get(i) < 0)
				cn++;

			else if (arr.get(i) == 0)
				cz++;
			
		}
	
		System.out.println(String.format("%.6f", cp/arr.size()));
		System.out.println(String.format("%.6f", cn/arr.size()));
		System.out.println(String.format("%.6f", cz/arr.size()));
	}
}

public class Solution {
	public static void main(String[] args) {
		List<Integer> ar=new ArrayList<>();
		int[] array= {1,2,0,-4,-5};
		for(int x:array) ar.add(x);
		Result.plusMinus(ar);
	}
}
