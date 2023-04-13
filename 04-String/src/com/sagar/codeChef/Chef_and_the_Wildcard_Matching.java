package com.sagar.codeChef;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Chef_and_the_Wildcard_Matching
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		while (tc-- > 0) {
		    String s1 = sc.next();
		    String s2 = sc.next();
		    calculate(s1, s2);
		}
	}
	private static void calculate(String s1, String s2) {
	   int count = 0;

		for (int i = 0; i < s1.length(); i++) {
			if ((s1.charAt(i) == s2.charAt(i)) || (s1.charAt(i) == '?') || (s2.charAt(i) == '?')) {
				count++;
			}
	    }
	    if (count == s1.length()) {
	        System.out.println("Yes");
	    }
	    else {
	        System.out.println("No");
	    }
	}
}
