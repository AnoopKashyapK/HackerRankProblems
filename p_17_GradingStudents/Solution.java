package p_17_GradingStudents;

import java.util.ArrayList;
import java.util.List;

/*
 * HackerLand University has the following grading policy:

Every student receives a grade in the inclusive range from 0 to 100.
Any grade less than 40 is a failing grade.
Sam is a professor at the university and likes to round each student's
 grade according to these rules:

If the difference between the grade and the next multiple of 5 is less than 3, round grade 
up to the next multiple of 5.
If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
 * */
class Result {

	/*
	 * Complete the 'gradingStudents' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * INTEGER_ARRAY grades as parameter.
	 */

	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> gradesList = new ArrayList<Integer>();
		for (int i = 0; i < grades.size(); i++) {

			if (grades.get(i) < 38)
				gradesList.add(grades.get(i));

			else if (grades.get(i) % 5 == 0 || (grades.get(i) + 1) % 5 == 0 || (grades.get(i) + 2) % 5 == 0) {
				if (grades.get(i) % 5 == 3) {
					gradesList.add(grades.get(i) + 2);
				} else if (grades.get(i) % 5 == 4) {
					gradesList.add(grades.get(i) + 1);
				} else
					gradesList.add(grades.get(i));
			} 
			
			else
				gradesList.add(grades.get(i));
		}
		return gradesList;
		// Write your code here

	}

}

public class Solution {
	public static void main(String[] args) {
		List<Integer> grades = new ArrayList<Integer>();
		int[] arr = { 4, 73, 67, 38, 33 };
		for (int a : arr)
			grades.add(a);
		List<Integer> gradesList = Result.gradingStudents(grades);
		System.out.println("Received gradesList");
		gradesList.forEach(a -> System.out.println(a));
	}
}
