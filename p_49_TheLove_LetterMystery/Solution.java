package p_49_TheLove_LetterMystery;
/*
	James found a love letter that his friend Harry has written to his girlfriend.
	James is a prankster, so he decides to meddle with the letter.
	 He changes all the words in the letter into palindromes.
	 To do this, he follows two rules:

	1.He can only reduce the value of a letter by 1, i.e. he can change d to c, 
		but he cannot change c to d or d to b.
	2.The letter a may not be reduced any further.
*/

class Result {
	public static int theLoveLetterMystery(String s) {
		int count=0;
		for(int i=0;i<s.length()/2;i++) {
			count=count+Math.abs(s.charAt(i)-s.charAt(s.length()-i-1));
		}
		return count;
	}


}

public class Solution {

	public static void main(String[] args) {
		System.out.println(Result.theLoveLetterMystery("bbc"));
	}

}
