package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LCM_And_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long A = sc.nextLong();
        Long B = sc.nextLong();
        System.out.println(Arrays.toString(lcmAndGcd(A, B)));
    }
    static Long[] lcmAndGcd(Long A , Long B) {
        Long[] ans = new Long[2];
        ans[0] = lcm(A, B);
        ans[1] = gcd(A, B);
        return ans;
    }
    private static long lcm(Long a, Long b) {
        return (a * b)/gcd(a, b);
    }

    private static long gcd(Long a, Long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
}
