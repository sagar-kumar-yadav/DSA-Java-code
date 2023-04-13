package com.sagar.codeChef;

import java.util.*;
import java.lang.*;
import java.io.*;


class Snake_Procession
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		while (r-- > 0) {
		    int len = sc.nextInt();
			sc.nextLine();
		    String str = sc.nextLine();
		    calculate(len, str);
		}
	}
	private static void calculate(int len, String str) {
	    
	    String s = "";
	    for (int i=0; i<len; i++) {
	        if (str.charAt(i) != '.'){
	            s += str.charAt(i);
	        } 
	    } 
	    str = s;
	    len = str.length();

		boolean ans = true;
		if (len % 2 != 0) {
			ans = false;
		}
		else {
			for (int i = 0; i < len; i++) {
				if (i % 2 == 0) {
					if (str.charAt(i) == 'T') {
						ans = false;
					}
				}
				else {
					if (str.charAt(i) == 'H') {
						ans = false;
					}
				}
			}
		}

		if (ans) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}
}
