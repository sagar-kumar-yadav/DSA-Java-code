package com.company;

import java.util.Scanner;

public class Motivation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a[][]=new int[n][2];
            int m=0;
            for(int i=0;i<n;i++)
            {
                a[i][0]=sc.nextInt();
                a[i][1]=sc.nextInt();
                if(a[i][0]<=x)
                {
                    if(m<a[i][1])
                        m=a[i][1];
                }

            }
            System.out.println(m);
        }
    }
}
