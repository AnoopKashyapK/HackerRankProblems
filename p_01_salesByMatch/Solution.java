package p_01_salesByMatch;

/*There is a large pile of socks that must be paired by color.
Given an array of integers representing the color of each sock,
determine how many pairs of socks with matching colors there are.
Example 
n=7
ar=[1,2,1,2,1,3,2];
There is one pair of color  and one of color . 
There are three odd socks left, one of each color. 
The number of pairs is */
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Result {
	public static int sockMerchant(int n, List<Integer> ar) {

		int pairs = 0;
		int repeat = 1;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (ar.get(i) == ar.get(j) && ar.get(j) != 0) {
					repeat++;
					ar.set(j, 0);
				}
			}
			pairs = pairs + repeat / 2;
			repeat = 1;
		}

		return pairs;

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {

		int arr[] = { 5, 6, 8, 1, 8, 8 };
		List<Integer> ar = new ArrayList<Integer>();
		for (int i : arr) {
			ar.add(i);
		}
		System.out.println(ar);
		int result = Result.sockMerchant(ar.size(), ar);
		System.out.println("Number of pairs " + result);

	}
}
