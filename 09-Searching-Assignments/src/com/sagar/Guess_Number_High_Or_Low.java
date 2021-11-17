package com.sagar;

// https://leetcode.com/problems/guess-number-higher-or-lower/
// 374. Guess Number Higher or Lower

public class Guess_Number_High_Or_Low {
        /**
         * Forward declaration of guess API.
         * @param  num   your guess
         * @return 	     -1 if num is lower than the guess number
         *			      1 if num is higher than the guess number
         *               otherwise return 0
         *int guess(int num);
         */

 /*   private static int guessNumber(int n) {

        // bruteforce
        int i = 0;
        while (i <= n){
            if (guess(i) == 0){
                return i;
            }
            i++;
        }


        // binary search
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high-low) / 2;

            if (guess(mid) == 0){
                return mid;
            }
            else if (guess(mid) == -1){
                high = mid- 1;
            }
            else if (guess(mid) == 1){
                low = mid + 1;
            }
        }
        return -1;
    }

  */
}
