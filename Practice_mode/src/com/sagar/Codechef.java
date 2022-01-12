package com.sagar;

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		while (tc-- > 0){
			String x = sc.next();
			String y = sc.next();

			char[] ch1 = x.toCharArray();
			char[] ch2 = y.toCharArray();
			char[] ans = new char[ch1.length];
			for (int i=0; i<ch1.length; i++) {
				for (int j=0; j<ch2.length; j++) {
					if (ch1[i] == 'B' && ch2[i] == 'W') {
						ans[i] = 'B';
					}
					else if(ch1[i] == 'W' && ch2[i] == 'B') {
						ans[i] = 'B';
					}
					else if(ch1[i] == 'B' && ch2[i] == 'B') {
						ans[i] = 'W';
					}
					else if(ch1[i] == 'W' && ch2[i] == 'W'){
						ans[i] = 'B';
					}
				}
			}
			System.out.println(ans);
		}
	}
}