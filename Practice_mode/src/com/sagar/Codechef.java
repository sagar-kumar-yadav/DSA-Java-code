package com.sagar;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		while(tc-- > 0) {
		    int rent = sc.nextInt();
		    int cost = sc.nextInt();
		    
		    calculate(rent, cost);
		}
	}
	private static void calculate(int rent, int cost) {

	    if (cost % rent!=0) {
	        System.out.println(cost/rent);
	    }else{System.out.println((cost/rent)-1);
	    }
	}
}
