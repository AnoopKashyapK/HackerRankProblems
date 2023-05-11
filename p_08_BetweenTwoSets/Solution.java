package p_08_BetweenTwoSets;

import java.util.Collections;
import java.util.*;

/*
There will be two arrays of integers. 
Determine all integers that satisfy the following two conditions:

1)The elements of the first array are all factors of the integer being considered
2)The integer being considered is a factor of all elements of the second array
*/
//class Result {
//	public static int findGCD(int a, int b) {
//
//		if (b == 0)
//			return a;
//
//		return findGCD(b, a % b);
//	}
//
//	public static int getTotalX(List<Integer> a, List<Integer> b) {
//
//		int lcmOfA = a.get(0);
//		int gcdOfA = a.get(0);
//
//		int lcmOfB = b.get(0);
//		int gcdOfB = b.get(0);
//
//		for (int i = 1; i < a.size(); i++) {
//			gcdOfA = findGCD(a.get(i), lcmOfA);
//			lcmOfA = (lcmOfA * a.get(i)) / gcdOfA;
//		}
//
//		for (int j = 1; j < b.size(); j++) {
//			gcdOfB = findGCD(b.get(j), lcmOfB);
//
//		}
//		int count = 0;
//		int result = 0;
//		while (count <= gcdOfB) {
//			count = count + lcmOfA;
//			if (gcdOfB % count == 0) {
//				result++;
//			}
//		}
//		return result;
//
//	}
//
//}


class Result {

	  /*
	   * Complete the 'getTotalX' function below.
	   *
	   * The function is expected to return an INTEGER.
	   * The function accepts following parameters:
	   *  1. INTEGER_ARRAY a
	   *  2. INTEGER_ARRAY b
	   */

	 static int getGCD(int n1, int n2) {
	    if (n2 == 0) {
	      return n1;
	    }
	    return getGCD(n2, n1 % n2);
	  }

	 static int getLCM(int n1, int n2) {
	    if (n1 == 0 || n2 == 0)
	      return 0;
	    else {
	      int gcd = getGCD(n1, n2);
	      return Math.abs(n1 * n2) / gcd;
	    }
	  }

	  public static int getTotalX(List<Integer> a, List<Integer> b) {
	    int result = 0;

	    // Get LCM of all elements of a
	    int lcm = a.get(0);
	    for (Integer integer : a) {
	      lcm = getLCM(lcm, integer);
	    }

	    // Get GCD of all elements of b
	    int gcd = b.get(0);
	    for (Integer integer : b) {
	      gcd = getGCD(gcd, integer);
	    }

	    // Count multiples of lcm that divide the gcd
	    int multiple = 0;
	    while (multiple <= gcd) {
	      multiple += lcm;

	      if (gcd % multiple == 0)
	        result++;
	    }

	    return result;
	  }

	}
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 6 };
		int[] brr = { 24, 36 };
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		for (int i : arr)
			a.add(i);
		for (int j : brr)
			b.add(j);
		System.out.println(Result.getTotalX(a, b));

	}

}
