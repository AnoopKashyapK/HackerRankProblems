package p_70_ACM_ICPC_Team;

import java.util.*;

/*
	There are a number of people who will be attending ACM-ICPC World Finals. 
	Each of them may be well versed in a number of topics. 
	Given a list of topics known by each attendee, presented as binary strings, 
	determine the maximum number of topics a 2-person team can know. 
	Each subject has a column in the binary string, and a '1' means the subject is known 
	while '0' means it is not. 
	Also determine the number of teams that know the maximum number of topics. 
	Return an integer array with two elements. 
	The first is the maximum number of topics known, 
	and the second is the number of teams that know that number of topics.
	
	Example
	n=3
	topics=["10101","11110","00010"]

	The attendee data is aligned for clarity below:
	
	10101
	11110
	00010
	
	These are all possible teams that can be formed:
	
	Members Subjects
	(1,2)   [1,2,3,4,5]
	(1,3)   [1,3,4,5]
	(2,3)   [1,2,3,4]
	In this case, the first team will know all 5 subjects.
	They are the only team that can be created that knows that many subjects,
	 so [5,1] is returned.
*/

class Result {

	public static List<Integer> acmTeam(List<String> topic) {
		List<Integer> counts = new ArrayList<Integer>();
		int count = 0;
		for (int i = 0; i < topic.size() - 1; i++) {
			for (int j = i + 1; j < topic.size(); j++) {
				count = 0;
				for (int k = 0; k < topic.get(0).length(); k++) {
					if (topic.get(i).charAt(k) == '1' || topic.get(j).charAt(k) == '1') {
						count++;
					}
				}
				counts.add(count);
			}
		}
		return Arrays.asList(Collections.max(counts),
				Collections.frequency(counts, Collections.max(counts)));
	}

}

public class Solution {
	public static void main(String[] args) {
		System.out.println(Result.acmTeam(Arrays.asList("10101", "11110", "00010")));
	}
}
