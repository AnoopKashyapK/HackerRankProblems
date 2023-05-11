package p_37_CatsAndMouse;

/*
	Two cats and a mouse are at various positions on a line.
	 You will be given their starting positions. 
	 Your task is to determine which cat will reach the mouse first, 
	 assuming the mouse does not move and the cats travel at equal speed. 
	 If the cats arrive at the same time, 
	 the mouse will be allowed to move and it will escape while they fight.
	 
	 You are given q queries in the form of x, y, and z representing
	  the respective positions for cats A and B, and for mouse C. 
	  Complete the function catAndMouse to return the appropriate answer to each query,
	   which will be printed on a new line.
	   
	    - If cat A catches the mouse first, print Cat A.
		- If cat B catches the mouse first, print Cat B.
		- If both cats reach the mouse at the same time,
		   print Mouse C as the two cats fight and mouse escapes.
		   
		   Returns
      string: Either 'Cat A', 'Cat B', or 'Mouse C'
*/


public class Solution {
	
	static String catAndMouse(int x, int y, int z) {
		if(Math.abs(x-z)<Math.abs(y-z)) return "Cat A";
		else if(Math.abs(x-z)>Math.abs(y-z)) return "Cat B";
		return "Mouse C";


    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.catAndMouse(2, 5, 4));

	}

}
