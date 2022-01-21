package com.company;

import java.util.Scanner;

class Equal_Card_Game
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		 
		while (tc-- > 0) {
		    int k = sc.nextInt();
		    
		    int totalCard = 52;
		    int count = 0;
		    while (totalCard != k) {
		        if (totalCard % k == 0) {
		            break;
		        }
		        count++;
		        totalCard--;
		    }
		    System.out.println(count);
		    
		}
	}
}
