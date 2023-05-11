package p_14_MigratoryBirds;

import java.util.ArrayList;
import java.util.List;

/*
 * Problem 14 Migratiory birds
 *Given an array of bird sightings where every element represents a bird type id,
 * determine the id of the most frequently sighted type.
 *  If more than 1 type has been spotted that maximum amount, 
 *  return the smallest of their ids. 
  */
class Result {

  

    public static int migratoryBirds(List<Integer> arr) {
		int count1=0,count2=0,count3=0,count4=0,count5=0,largest=0;
		for(int i=0;i<arr.size();i++) {
			switch(arr.get(i)) {
			case 1: count1++;break;
			case 2: count2++;break;
			case 3: count3++;break;
			case 4: count4++;break;
			case 5: count5++;break;
			}
		}
		List<Integer> counts=new ArrayList<Integer>();
		counts.add(count1);
		counts.add(count2);
		counts.add(count3);
		counts.add(count4);
		counts.add(count5);
		largest=counts.get(0);
		int largestIndex=0;
		for(int j=1;j<counts.size();j++) {
			if(counts.get(j)>largest) {
				largest=counts.get(j);
				largestIndex=j;
			}
		}
		return largestIndex+1;
    
    }

}
public class Solution {
	public static void main(String[] args) {
		int[] array= {1 ,4, 4, 4, 5, 3};
		
		List<Integer> arr=new ArrayList<Integer>();
		for(int a:array) arr.add(a);
		int index=Result.migratoryBirds(arr);
		System.out.println(index);
	}

}
