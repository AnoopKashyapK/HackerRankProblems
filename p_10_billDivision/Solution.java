package p_10_billDivision;
/*		Problem 10 bill Division
	*Two friends Anna and Brian, are deciding how to split the bill at a dinner.
	* Each will only pay for the items they consume.
	*  Brian gets the check and calculates Anna's portion.
	*  You must determine if his calculation is correct
	*  Function Description

Complete the bonAppetit function in the editor below. It should print Bon Appetit if the bill is fairly split. Otherwise, it should print the integer amount of money that Brian owes Anna.

bonAppetit has the following parameter(s):

bill: an array of integers representing the cost of each item ordered
k: an integer representing the zero-based index of the item Anna doesn't eat
b: the amount of money that Anna contributed to the bill
 */

import java.util.ArrayList;
import java.util.List;

class Result {

	public static void bonAppetit(List<Integer> bill, int k, int b) {

		// Write your code here
		int sum = 0;
		for (int i = 0; i < bill.size(); i++) {
			if (i != k) {
				sum = sum + bill.get(i);
			}
		}
		if(b==sum/2) System.out.println("Bon Appetit");
		else {
			System.out.println(b-sum/2);
		}
	}

}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 10, 2, 9 };
		List<Integer> bill = new ArrayList();

		for (int x : a)
			bill.add(x);
		Result.bonAppetit(bill, 1, 12);

	}

}
