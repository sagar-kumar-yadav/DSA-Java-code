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
		int r = sc.nextInt();
		
		while (r-- > 0) {
		    int len = sc.nextInt();
		    String str = sc.nextLine();
		    calculate(len, str);
		}
	}
	private static void calculate(int len, String str) {
	    
	    String s = "";
	    for (int i=0; i<len; i++) {
	        if (str.charAt(i) == '.'){
	            s += str.charAt(i);
	        } 
	    } 
	    str = s;
	    len = str.length();
	    
	    if (len == 0) {
	        System.out.println("Valid");
	    }
	    
	    int isHead =1, isValid = 1;
	    for (int i=0; i<len; i++) {
	        if (isHead == 1 && str.charAt(i) == 'T') {
	            isValid = 0;
	            break;
	        }
	        if (isHead == 0 && str.charAt(i)== 'H') {
	            isValid = 0;
	            break;
	        }
			boolean b = isHead != isHead;
		} 
	    if (isHead == 0) {
	        isValid == 0;
	    }
	    if (isValid){
	        System.out.println("Valid");
	    }
	    else{
	        System.out.println("Invalid");
	    }
	}
}
