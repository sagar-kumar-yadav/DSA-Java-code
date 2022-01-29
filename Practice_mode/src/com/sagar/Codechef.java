package com.sagar;/* package codechef; // don't place package name! */

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
		
		while (tc-- > 0) {
		    int x = sc.nextInt();
			int n = sc.nextInt();
			int z = sc.nextInt();

			calculate(0, x, n, z, 0);
		}
	}

	private static void calculate(int ind, int x, int n, int z, int count) {
		if (z > n) {
			System.out.println("-1");
		}
//		else {
//			int c = 0;
//			for (int i = 0; i < x; i++) {
//				if (c == z) {
//					c=0;
//				}
//				System.out.print(c+" ");
//				c++;
//			}
//		}
	}
}
