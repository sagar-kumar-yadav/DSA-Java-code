package com.Arrays.company;

// https://practice.geeksforgeeks.org/problems/replace-all-0s-with-5/1/?category[]=Arrays&category[]=Arrays&problemStatus=unsolved&difficulty[]=-1&page=1&query=category[]ArraysproblemStatusunsolveddifficulty[]-1page1category[]Arrays#
// Replace all 0's with 5

class replace_all_zeros_with_five {
    public static void main(String[] args) {
        int num = 1001;
        System.out.println(convertfive(num));
    }
    static int convertfive(int num) {

        // method - 2
        int c = 5;              // template
        int temp = num;         // number add in temp variable

        while (num > 0) {
            int rem = num % 10;     // find remainder

            // if remainder is zero add in temp
            if (rem == 0) {
                temp += c;
            }
            c = c*10;
            num /= 10;
        }
        return temp;
    }

}