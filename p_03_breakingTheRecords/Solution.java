package p_03_breakingTheRecords;
/*
 * Maria plays college basketball and wants to go pro.
 *  Each season she maintains a record of her play. 
 *  She tabulates the number of times she breaks her season record for most points
 *   and least points in a game.
 *    Points scored in the first game establish her record for the season, 
 *    and she begins counting from there.*/
import java.util.ArrayList;
import java.util.List;

class Result {

	public static List<Integer> breakingRecords(List<Integer> scores) {
		int minimum=scores.get(0),maximum=scores.get(0);
		int mincount=0,maxcount=0;
		for(int i=0;i<scores.size();i++) {
			if(scores.get(i)>maximum) {
				maxcount++;
				maximum=scores.get(i);
			}
			else if(scores.get(i)<minimum) {
				mincount++;
				minimum=scores.get(i);
			}	
		}
		List<Integer> record= new ArrayList<Integer>();
		record.add(maxcount);
		record.add(mincount);
		return record;
	}
}

public class Solution {
	public static void main(String[] args) {
		int arr[] = { 3,4,21,36,10,28,35,5,24,24,42};
		List<Integer> scores = new ArrayList<Integer>();
		for (int i : arr) {
			scores.add(i);
		}
		System.out.println(scores);
		List<Integer> result = Result.breakingRecords(scores);
		result.forEach( a ->System.out.print(a+" "));

	}
}
