package p_48_SeparateTheNumbers;

/*
A numeric string, s, is beautiful if it can be split into a sequence of two or more positive integers, 
	a[1],a[2],...a[n] satisfying the following conditions:
	
	1.a[i]-a[i-1]=1 for any 1<i<=n (i.e., each element in the sequence is 1 more than the previous element).
	2.No a[i] contains a leading zero. For example, we can split s=10203 into the sequence
	{1,02,03} , but it is not beautiful because 02 and 03 have leading zeroes.
	3.The contents of the sequence cannot be rearranged. For example, we can split s=312 into the sequence
	{3,1,2}, but it is not beautiful because it breaks our first constraint (i.e.,1-3!=1 ).
*/
class Result {

	public static void separateNumbers(String s) {
		// Write your code here
		String subString="";
		boolean isTrue=false;
		for(int i=1;i<=s.length()/2;i++) {
			subString=s.substring(0,i);
			Long num= Long.parseLong(subString);
			String valid=subString;
			while(valid.length()<s.length()) {
				valid=valid+Long.toString(++num);
			}
			if(s.equals(valid)) {
				isTrue=true;
				break;
			}
		}
		System.out.println(isTrue? "YES "+subString:"NO");
	}
}

public class Solution {
	public static void main(String[] args) {
		Result.separateNumbers("99910001001");
	}
}
