package p_20_Mini_MaxSum;
/*
 * Given five positive integers,
 *  find the minimum and maximum values that can be 
 *  calculated by summing exactly four of the five integers. 
 *  Then print the respective minimum and maximum values 
 *  as a single line of two space-separated long integers.
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Result {
	public static void miniMaxSum(List<Integer> arr) {
		List<Long> sumArr = new ArrayList<>();
		Long sum = 0l;

		for (int i = 0; i < arr.size(); i++) {
			sum = 0l;

			for (int j = 0; j < arr.size(); j++) {
				
				if (j == i)
					continue;
				else
					sum = sum + arr.get(j);
			}
			sumArr.add(sum);
		}
		Collections.sort(sumArr);
		System.out.println(sumArr.get(0) + " " + sumArr.get(sumArr.size()-1));
	}
}

public class Solution {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9 };

		List<Integer> Arr = new ArrayList<Integer>();
		for (int a : arr)
			Arr.add(a);
		Result.miniMaxSum(Arr);
	}
}
