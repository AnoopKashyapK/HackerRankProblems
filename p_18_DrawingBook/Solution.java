package p_18_DrawingBook;

/*
 * A teacher asks the class to open their books to a page number.
A student can either start turning pages from the front of the book 
or from the back of the book. They always turn pages one at a time. 
When they open the book, page  is always on the right side:



When they flip page , they see pages  and . 
Each page except the last page will always be printed on both sides.
 The last page may only be printed on the front, given the length of the book.
  If the book is  pages long, and a student wants to turn to page ,
   what is the minimum number of pages to turn? 
   They can start at the beginning or the end of the book.

Given  and , find and print the minimum number of pages that must be turned in order to arrive at page .
 * */

class Result {
	public static int pageCount(int n, int p) {
	int count1=p/2;
	int count2=(n/2)-(p/2);
	if(count1>count2) return count2;
	else
	return count1;
	}
}

public class Solution {
	public static void main(String[] args) {
		int n = 5, p = 4;
		int count = Result.pageCount(n, p);
		System.out.println(count);

	}
}
