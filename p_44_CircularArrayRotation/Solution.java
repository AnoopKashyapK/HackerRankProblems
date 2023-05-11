package p_44_CircularArrayRotation;

import java.util.ArrayList;
import java.util.List;

/*
 	 John Watson knows of an operation called a right circular rotation on an array of integers.
 	 One rotation operation moves the last array element to the first position and shifts all 
 	 remaining elements right one. 
 	 To test Sherlock's abilities, Watson provides Sherlock with an array of integers.
 	 Sherlock is to perform the rotation operation a number of times then determine the value 
 	 of the element at a given position.

	For each array, perform a number of right circular rotations and return the values of the elements 
	at the given indices.
*/
class Result {

	public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
		k = k % a.size();
		int size = a.size();
		for (int i = 0; i < queries.size(); i++) {
			int pos = (queries.get(i) - k + size) % size;
			queries.set(i, a.get(pos));
		}
		return queries;

	}

}

public class Solution {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5 };
		int[] que = { 1, 2 };
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> q = new ArrayList<Integer>();
		for (int i : arr)
			a.add(i);
		for (int j : que)
			q.add(j);
		System.out.println(Result.circularArrayRotation(a, 2, q));

	}

}
