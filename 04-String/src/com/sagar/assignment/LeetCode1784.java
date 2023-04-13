package com.sagar.assignment;

import java.util.Scanner;

class LeetCode1784 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkOnesSegment(s));
    }
    public static boolean checkOnesSegment(String s) {
        boolean flag = true;
        for (int i=0; i<s.length()-1; i++) {
            if (s.charAt(i) == '0' && s.charAt(i+1) == '1'){
                flag = false;
                break;
            }
            else {
                flag = true;
            }

        }
        return flag;
    }
}