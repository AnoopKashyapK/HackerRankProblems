package p_21_countingValleys;

/*
An avid hiker keeps meticulous records of their hikes.
*  During the last hike that took exactly  steps steps, 
 * for every step it was noted if it was an uphill,U , or a downhill D,  step. 
 * Hikes always start and end at sea level,
 *  and each step up or down represents a 1 unit change in altitude. We define the following terms:

A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
 * */
class Result {

	public static int countingValleys(int steps, String path) {
		int valleys = 0;
		int seaLevel = 0;
		System.out.print("-");
		for (int i = 0; i < path.length(); i++) {
			if (path.charAt(i) == 'U') {
				seaLevel++;
			}
			if (path.charAt(i) == 'D') {
				seaLevel--;
			}
			if (i != 0 && seaLevel == 0 && path.charAt(i) == 'U')
				valleys++;
		}

		return valleys;
		// Write your code here

	}

}

public class Solution {
	public static void main(String[] args) {
		String path = "UDDDUDUU";
		int valleys = Result.countingValleys(path.length(), path);
		System.out.println(valleys);
	}
}
