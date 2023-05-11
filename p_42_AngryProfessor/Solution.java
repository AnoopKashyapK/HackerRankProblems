package p_42_AngryProfessor;

import java.util.ArrayList;
import java.util.List;

/*
 	A Discrete Mathematics professor has a class of students.
 	 Frustrated with their lack of discipline, the professor decides to cancel class 
 	 if fewer than some number of students are present when class starts. 
 	 Arrival times go from on time (arrivalTime<=0) to arrived late (arrivalTime>0).
 	 
 	 Given the arrival time of each student and a threshhold numberof attendees, determine if the class
 	 is cancelled.
 	 
 	 example
 	 n=5
 	 k=3
 	 a=[-2,-1,0,1,2]
 	 The first 3 students arrived on. The last 2 were late.
 	 The threshold is 3 students, so class will go on. Return YES.
 	 Note: Non-positive arrival times (a[i]<=0) indicate the student arrived early or on time; 
 	 positive arrival times (a[i]>0) indicate the student arrived a[i] minutes late.
*/
class Result {

	public static String angryProfessor(int k, List<Integer> a) {
		int count = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) <= 0)
				count++;
		}
		if (count >= k)
			return "NO";
		return "YES";

	}

}

public class Solution {

	public static void main(String[] args) {
		int[] a = { -2, -1, 0, 1, 2 };
		List<Integer> arr = new ArrayList<Integer>();

		for (int x : a)
			arr.add(x);
		System.out.println(Result.angryProfessor(3, arr));

	}

}
