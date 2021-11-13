package com.sagar;

public class CountZeros {
    public static void main(String[] args) {
        int n = 30210104;
        System.out.println(count(n));
    }
    static int count(int n){
        return helper(n, 0);
    }

    private static int helper(int n, int count) {
        // base case
        if (n == 0){
            return count;
        }
        int rem = n % 10;
        if (rem == 1){
            return helper(n/10, count+1);
        }
        return helper(n/10, count);
    }
}
