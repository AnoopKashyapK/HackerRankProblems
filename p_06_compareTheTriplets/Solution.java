package p_06_compareTheTriplets;
/*
 * Problem 6
 * Alice and Bob each created one problem for HackerRank.
 * A reviewer rates the two challenges, 
 * awarding points on a scale from 1 to 100 for three categories:
 *  problem clarity, originality, and difficulty.

The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]),
 and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).

The task is to find their comparison points by comparing 
a[0] with b[0], a[1] with b[1], and a[2] with b[2].

If a[i] > b[i], then Alice is awarded 1 point.
If a[i] < b[i], then Bob is awarded 1 point.
If a[i] = b[i], then neither person receives a point.
Comparison points is the total points a person earned.

Given a and b, determine their respective comparison points.
 * */
import java.util.ArrayList;
import java.util.List;

class Result {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(0);
    	for(int i=0;i<a.size();i++) {
			if(a.get(i)>b.get(i)) list.set(0, list.get(0)+1);

			if(a.get(i)<b.get(i)) list.set(1, list.get(1)+1);	
		}
    	return list;
    }
}
public class Solution {
	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {0,3,1};
		List<Integer> A = new ArrayList<Integer>(),B=new ArrayList<Integer>();
		for(int i:a) A.add(i);
		for(int j:b) B.add(j);

        List<Integer> result = Result.compareTriplets(A, B);
        result.forEach(e->System.out.println(e));
		
	}
}
