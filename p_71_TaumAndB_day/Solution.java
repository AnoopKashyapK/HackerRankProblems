package p_71_TaumAndB_day;

import java.util.*;

/*
	Taum is planning to celebrate the birthday of his friend, Diksha. 
	There are two types of gifts that Diksha wants from Taum: 
	one is black and the other is white. 
	To make her happy, Taum has to buy b black gifts and w white gifts.
	
	The cost of each black gift is bc units.
	The cost of every white gift is wc units.
	The cost to convert a black gift into white gift or vice versa is z units.
	
	Determine the minimum cost of Diksha's gifts.
	
	Example
	b=3
	w=5
	bc=3
	wc=4
	z=1

	He can buy a black gift for 3 and convert it to a white gift for 1,
	making the total cost of each white gift 1.
	That matches the cost of a white gift, 
	so he can do that or just buy black gifts and white gifts.
	Either way, the overall cost is 3*3+5*4=29.
*/

	/*
	 * Complete the 'taumBday' function below.
	 *
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * following parameters: 1. INTEGER b 2. INTEGER w 3. INTEGER bc 4. INTEGER wc
	 * 5. INTEGER z
	 */
	import java.util.*;

	public class Solution
	{
	    public static long min(long x,long y)
	    {
	        if(x<y)
	            return x;
	        else 
	            return y;
	    } 
	    public static void main(String args[])
	    {
	        Scanner scn=new Scanner(System.in);

	        int T,B,W,X,Y,Z;
	        long s=0;

	        T=scn.nextInt();

	        for(int i=0;i<T;i++)
	        {
	                B=scn.nextInt();
	                W=scn.nextInt();
	                X=scn.nextInt();
	                Y=scn.nextInt();
	                Z=scn.nextInt();
	                
	                s=B*min(X,Y+Z)+W*min(Y,X+Z);
	                System.out.println(s);            
	            
	                    
	        }
	    }
	}