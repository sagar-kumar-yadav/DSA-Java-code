package com.sagar;

import java.util.Scanner;

public class check_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while(tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            calculate(s, k);
        }
    }

    private static void calculate(String s, int k) {
        int count = checkPalindrome(s);
        if (count <= k) {
            if (s.length() % 2 == 1) {
                System.out.println("YES");
            }else {
                if ((k-checkPalindrome(s)) % 2 == 0) {
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
        }else {
            System.out.println("NO");
        }
    }
    private static int checkPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        int count = 0;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                count++;
            }
            start++;
            end--;
        }
        return count;
    }
}
