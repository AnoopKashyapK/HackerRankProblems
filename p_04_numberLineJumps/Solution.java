package p_04_numberLineJumps;

/*
 * You are choreographing a circus show with various animals. 
 * For one act, you are given two kangaroos on a number line ready to jump in the positive direction
 *  (i.e, toward positive infinity).

The first kangaroo starts at location  and moves at a rate of  meters per jump.
The second kangaroo starts at location  and moves at a rate of  meters per jump.
You have to figure out a way to get both kangaroos at the same location
 at the same time as part of the show. 
 If it is possible, return YES, otherwise return NO.*/
class Result {

	public static String kangaroo(int x1, int v1, int x2, int v2) {
		String result = "NO";
		if (v1 > v2) {
			while (x1 <= x2) {
				if (x1 == x2) {
					result = "YES";
					break;
				} else {
					x1 = x1 + v1;
					x2 = x2 + v2;
				}
			}
		}
		return result;
		// Write your code here

	}

}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 8, 3, 0, 3 };
		int x1 = arr[0];
		int v1 = arr[1];
		int x2 = arr[2];
		int v2 = arr[3];
		String result = Result.kangaroo(x1, v1, x2, v2);
		System.out.println("Is it possible :" + result);
	}

}
