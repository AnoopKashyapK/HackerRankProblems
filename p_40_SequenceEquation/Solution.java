package p_40_SequenceEquation;

import java.util.*;

/*
  	Given a sequence of n integers, p(1),p(2),...p(n) where each element is distinct 
  	and satisfies 1<=p(x)<=n.
  	 For each x where 1<=x<=n, that is x increments from  1 to n, find any integer y such that 
  	 p(p(y))=x and keep a history of the values of y in a return array.
  	 p=[5,2,1,3,4]
  	 Each value of x between 1 and 5, the length of the sequence, is analyzed as follows:

		1) x=1, so p(p(4))=1 
		2) x=2, so p(p(2))=2 
		3) x=3, so p(p(5))=3  
		4) x=4, so p(p(1))=4 
		5) x=5, so p(p(3))=5 
		The values for  are [4,2,5,1,3].
  	 
 */

class Result {

    /*
     * Complete the 'permutationEquation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY p as parameter.
     */

    public static List<Integer> permutationEquation(List<Integer> p) {
		List<Integer> array=new ArrayList<Integer>();
		p.add(0,0);
		for(int i=1;i<=p.size();i++) {
			
			for(int j=1;j<p.size();j++) {
				if(i==p.get(p.get(j))) {
					array.add(j) ;
					break;
				}
			}
		}
		
		return array;
    }

}

public class Solution {
	public static void main(String[] args) {
		int arr[]= {5,2,1,3,4};
		List<Integer> p=new ArrayList<Integer>();
		for(int i:arr) p.add(i);
		System.out.println(Result.permutationEquation(p));
		
		
	}
}
