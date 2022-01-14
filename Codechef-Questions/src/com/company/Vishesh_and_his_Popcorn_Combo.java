package com.company;/* package codechef; // don't place package name! */

// https://www.codechef.com/EXUN21C/problems/POPCORN

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Vishesh_and_his_Popcorn_Combo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		while (tc-- > 0) {
		    int a1 = sc.nextInt();
		    int a2 = sc.nextInt();
		    int b1 = sc.nextInt();
		    int b2 = sc.nextInt();
		    int c1 = sc.nextInt();
		    int c2 = sc.nextInt();

		    int a = a1 + a2;
		    int b = b1 + b2;
		    int c = c1 + c2;

		    if (a <= b && b >= c){
		        System.out.println(b);
		    }
		    else if (a <= c){
		        System.out.println(c);
		    }
		    else{
		        System.out.println(a);
		    }
		}
	}
}
