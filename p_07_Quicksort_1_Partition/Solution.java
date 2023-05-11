package p_07_Quicksort_1_Partition;

import java.util.*;

/*
	The previous challenges covered Insertion Sort,
	 which is a simple and intuitive sorting algorithm with a running time of O(n^2).
	  In these next few challenges, we're covering a divide-and-conquer algorithm called Quicksort
	   (also known as Partition Sort). 
	   This challenge is a modified version of the algorithm that only addresses partitioning. 
	   It is implemented as follows:
	   Step 1: Divide
		Choose some pivot element,p , and partition your unsorted array, arr, 
		into three smaller arrays:left ,right , and equal , where each element in left<p, 
		each element in right>p , and each element in equal=p.
*/
class Result {
	public static List<Integer> quickSort(List<Integer> arr) {
		int p = arr.get(0);
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		for (int i = 1; i < arr.size(); i++) {
			if (arr.get(i) < p)
				left.add(arr.get(i));
			else if (arr.get(i) > p)
				right.add(arr.get(i));
		}
		List<Integer> fin = new ArrayList<Integer>();

		fin.addAll(left);
		fin.add(p);
		fin.addAll(right);
		return fin;
	}

}

public class Solution {

	public static void main(String[] args) {
		 int arr[] = {4, 5, 3, 7, 2};
		 List<Integer> a= new ArrayList<Integer>();
		 for(int i:arr) a.add(i);
		 System.out.println(Result.quickSort(a));

	}

}
