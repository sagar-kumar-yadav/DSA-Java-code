package com.sagar.codeChef;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Chef_and_digits_of_a_number
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		while (tc-- > 0) {
		    String s1 = sc.next();
		    calculate(s1);
		}
	}
	private static void calculate(String s1) {
	    int zeros = 0;
	    int ones = 0;
	    
	    for (int i=0; i<s1.length(); i++) {
	        if (s1.charAt(i) == '0'){
	            zeros++;
	        } 
	        else {
	            ones++;
	        }
	    } 
	    if (s1.length()==1){
	        System.out.println("Yes");
	    }
	    else {
	        if (Math.min(ones, zeros) == 1) {
	            System.out.println("Yes");
	        }
	        else{
	            System.out.println("No");
	        }
	    }
	}
}
