package p_58_RepeatedString;

/*
 	There is a string,s , of lowercase English letters that is repeated infinitely many times.
 	 Given an integer,n , find and print the number of letter a's in 
 	 the first n letters of the infinite string.
 	 Example
	s="abcac"
	n=10
	
	The substring we consider is abcacabcac, the first 10 characters of the infinite string. 
	There are 4 occurrences of a in the substring.
 */
class Result {
	public static long repeatedString(String s, long n) {
//		long count = 0;
//		int size = 0;
//		String S = "";
//		while (size <= n) {
//			for (int i = 0; i < s.length(); i++) {
//				if (size >= n)
//					break;
//				S = S + "" + s.charAt(i);
//				size++;
//			}
//			if (size >= n)
//				break;
//		}
//		System.out.println(S);
//		for (int j = 0; j < S.length(); j++) {
//			if (S.charAt(j) == 'a')
//				count++;
//		}
//		return count;
		long count = 0;
		long Acount = 0;
		long size = n / s.length();
		long num = n % s.length();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				count++;
				if (i < num)
					Acount++;
			}

		}
		return count * size + Acount;
	}
}

public class Solution {
	public static void main(String[] args) {
		System.out.println(Result.repeatedString("aba", 10));
	}
}
