package com.company;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class IMDB
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s= new Scanner(System.in);
		int tc=s.nextInt();
		
		while( tc-- > 0)
		{
		    int n=s.nextInt();
		    int weight = s.nextInt();
		    int ans= Integer.MIN_VALUE;
		    for(int i=0;i<n;i++)
		    {
		        int val1=s.nextInt();
		        int val2=s.nextInt();
		        if(val1<=weight)
		        {
		            ans= Math.max(ans,val2);
		        }
		    }
		    System.out.println(ans);
		}
	}
}