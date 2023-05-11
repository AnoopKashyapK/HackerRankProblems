package p_31_ElectronicsShop;

/*
 *  A person wants to determine the most expensive computer keyboard and USB drive 
 *  that can be purchased with a give budget. 
 *  Given price lists for keyboards and USB drives and a budget, find the cost to buy them. 
 *  If it is not possible to buy both items, return -1.
 */

public class Solution {

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int max = 0;
		for (int i = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++) {
				int add = keyboards[i] + drives[j];
				if (add > max && add <= b)
					max = add;
			}
		}
		return max > 0 ? max : -1;
	}

	public static void main(String[] args) {

		int[] keyboards = { 40, 50, 60 };
		int[] drives = { 5, 8, 12 };
		int b = 60;
		int max = getMoneySpent(keyboards, drives, b);
		System.out.println(max);

	}
}
