package com.company;

import java.util.Scanner;

public class Sum_of_Digit_is_Pallindrome_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isDigitSumPalindrome(n));
    }
    private static int isDigitSumPalindrome(int N) {
        int sum = 0;
        while (N != 0) {
            int rem = N % 10;
            sum += rem;
            N = N/10;
        }
        checkPalindrome(sum);

        if (checkPalindrome(sum)) {
            return 1;
        }
        return 0;
    }
    private static boolean checkPalindrome(int sum) {
        int k = sum;
        int rev = 0;
        while (sum != 0) {
            int rem = sum % 10;
            rev = rem + rev * 10;
            sum /= 10;
        }
        if (rev == k) {
            return true;
        }
        return false;
    }
}
