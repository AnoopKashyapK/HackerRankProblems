package p_32_CamelCase;
/*
 *  There is a sequence of words in CamelCase as a string of letters, s,
 *   having the following properties:

It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given s , determine the number of words in s.
 */
class Result {

    /*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelcase(String s) {
    	if (s=="") return 0;
    	int count=1;
    	for(int i=0;i<s.length();i++) {
    		if(Character.isUpperCase(s.charAt(i)))  count++;
    	}
		return count;

    }

}
public class Solution {
	public static void main(String[] args) {
		String s="oneTwoThree";
		int n= Result.camelcase(s);
		System.out.println(n);
	}
}
