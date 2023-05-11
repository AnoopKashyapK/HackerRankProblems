package p_25_TowerBreakers;
/*
 * Two players are playing a game of Tower Breakers!
 *  Player 1 always moves first, and both players always play optimally.
 *  The rules of the game are as follows:

Initially there are n towers.
Each tower is of height m.
The players move in alternating turns.
In each turn, a player can choose a tower of height x and reduce its height to y, where 1<=y<x
 and y evenly divides x .
If the current player is unable to make a move, they lose the game.
Given the values n of m and , determine which player will win. 
If the first player wins, return 1. Otherwise, return 2.
 * */
class Result {
	public static int towerBreakers(int n, int m) {
		if(m==1 || n%2==0) return 2;
		else return 1;
		
	}
}

public class Solution {
	public static void main(String[] args) {
		int n=1;
		int m=4;
		System.out.println(Result.towerBreakers(n, m));
	}
}
