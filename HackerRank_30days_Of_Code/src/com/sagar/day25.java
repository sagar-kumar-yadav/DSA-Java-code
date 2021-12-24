package com.sagar;

import java.io.*;
import java.util.*;

public class day25 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        
        while (tc-- > 0) {
            int n = sc.nextInt();
            
            isPrime(n);
            if (isPrime(n)){
                System.out.println("Prime");
            }
            else {
                System.out.println("Not prime");
            }
        }
    }
    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int i = 2;
        while (i*i <= n){
            if (n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}