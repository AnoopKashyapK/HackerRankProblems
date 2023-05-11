package p_47_MinimumDistances;

/*
	The distance between two array values is the number of indices between them.
	 Given a, find the minimum distance between any pair of equal elements in the array.
	  If no such value exists, return -1.
	  
	  a=[3,2,1,2,3];
	 There are two matching pairs of values: 3 and 2. 
	 The indices of the 3's are 0 and 4, so their distance is d[i,j]=|i-j|=4.
	  The indices of the 2's are 1 and 3, so their distance is d[i,j]=|i-j|=2.
	   The minimum distance is 2.
*/
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					int temp = j - i;
					if (temp < min) {
						min = temp;
					}
				}
			}
		}
		if (min == Integer.MAX_VALUE)
			min = -1;
		System.out.println(min);
	}

}
