package com.Must_Do_Coding_Questions;

// https://practice.geeksforgeeks.org/problems/a-simple-fraction0921/1
// A Simple Fraction

import java.util.HashMap;

public class A_Simple_Fraction {
    public static void main(String[] args) {
        int numerator = 47;
        int denominator = 18;
        System.out.println(fractionalToDecimal(numerator, denominator));
    }

    private static String fractionalToDecimal(int numerator, int denominator) {
        StringBuilder ans = new StringBuilder();

        // find quotient
        int q = numerator / denominator;

        // find remainder
        int r = numerator % denominator;

        // quotient add in ans
        ans.append(q);

        // if remainder is zero return ans;
        if (r == 0){
            return ans.toString();
        }
        // if remainder is not zero
        else {
            // add "." in ans;
            ans.append(".");

            // create a hashmap
            HashMap<Integer, Integer> hm = new HashMap<>();

            // check if remainder is not zero
            while (r != 0){

                // check if remainder was in hashmap or not
                if (hm.containsKey(r)){

                    // find length of remainder and insert "(" and append ")"
                    int len = hm.get(r);
                    ans.insert(len, "(");
                    ans.append(")");
                    break;
                }
                else {

                    // remainder add in hashmap
                    hm.put(r, ans.length());

                    // remainder multiply by 10
                    r *= 10;

                    // find quotient
                    q = r / denominator;

                    // find remainder
                    r = r % denominator;

                    // add quotient in remainder
                    ans.append(q);
                }
            }
        }
        return ans.toString();
    }
}
