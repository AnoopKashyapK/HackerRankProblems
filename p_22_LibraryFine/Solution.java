package p_22_LibraryFine;
/*
 * Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:

If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine=0).
If the book is returned after the expected return day but still within the same 
calendar month and year as the expected return date, fine=15 x(number of days late).
If the book is returned after the expected return month but still within the same calendar year 
as the expected return date, the  fine=500 x(number of months late).
If the book is returned after the calendar year in which it was expected,
 there is a fixed fine of 10000.
Charges are based only on the least precise measure of lateness. 
For example, whether a book is due January 1, 2017 or December 31, 2017, if it is returned January 1, 2018,
 that is a year late and the fine would be 10000.
 */
class Result {
	public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
		int fine=0;
		if(d1<=d2 && m1==m2  & y1==y2) return 0;
		else if(d1>d2 && m1==m2 && y1==y2) return 15*(d1-d2);
		else if(m1>m2 && y1==y2) return 500*(m1-m2);
		else if(y1>y2) return 10000;
		return fine;
	}

}
//Example case
public class Solution {
	public static void main(String[] args) {
		int[] arr = {9,6,2015,6,6,2015};
		int d1=arr[0];
		int m1=arr[1];
		int y1=arr[2];
		int d2=arr[3];
		int m2=arr[4];
		int y3=arr[5];
		int fine=Result.libraryFine(d1, m1, y1, d2, m2, y3);
		System.out.println(fine);
	}
}
