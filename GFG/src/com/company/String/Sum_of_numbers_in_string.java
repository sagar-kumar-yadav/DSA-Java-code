package com.company.String;

// https://practice.geeksforgeeks.org/problems/sum-of-numbers-in-string-1587115621/1
// Sum of numbers in string

public class Sum_of_numbers_in_string {
    public static void main(String[] args) {
        String str = "1abc23d";
        System.out.println(findSum(str));
    }

    private static long findSum(String str) {
      /*

        // approach -1
        int sum = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                num = num * 10 + (str.charAt(i) - '0');
            }
            else {
                sum += num;
                num = 0;
            }
        }
        return sum + num;
*/

        // approach -2
        long total = 0;
        int sum = 0;
        String s = "0";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                s += str.charAt(i);
            }
            else {
                sum += Integer.parseInt(s);
                s = "0";
            }

        }

        sum += Integer.parseInt(s);

        return sum;
    }
}
