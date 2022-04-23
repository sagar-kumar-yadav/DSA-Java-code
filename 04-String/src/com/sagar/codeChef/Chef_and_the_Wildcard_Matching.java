package com.sagar.codeChef;/* package codechef; // don't place package name! */

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
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    calculate(s1, s2);
		}
	}
	private static void calculate(String s1, String s2) {
	    boolean ans = true;
	    int i =0; int j=0;
	    while (i < s1.length() && j < s2.length()) {
	        if (s1.charAt(i) == s2.charAt(i) || s1.charAt(i) == '?' || s2.charAt(i) == '?') {
	            ans = true;
	        }
	    }
	    if (ans) {
	        System.out.println("Yes");
	    }
	    else {
	        System.out.println("No");
	    }
	}
}
