package com.sagar;

// https://leetcode.com/problems/sqrtx/
// 69. Sqrt(x)

public class Sqrt {

    public static void main(String[] args) {
	    int x = 8;
        System.out.println(mySqrt(x));
    }

    private static int mySqrt(int x) {

  /*
        // bruteforce
        long i = 0;
        while (i * i <= x){
            i++;
        }
        return (int) (i-1);
*/


        // binary search
        long low = 1;
        long high = x;
        long ans = 0;

        while (low <= high){
            long mid = low + (high - low) / 2;

            long sqr = mid*mid;

            if (sqr == x){
                return (int) mid;
            }
            if (sqr < x){
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return (int) ans;
    }
}
