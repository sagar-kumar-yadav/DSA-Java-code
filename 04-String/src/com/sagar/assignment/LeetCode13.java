package com.sagar.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class LeetCode13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(romanToInt(s));
        System.out.println(romanToInt1(s));
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 1);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = map.get(s.charAt(s.length()-1));
        for (int i = s.length()-2; i >= 0; i--) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                res -= map.get(s.charAt(i));
            }
            else {
                res += map.get(s.charAt(i));
            }
        }
        return res;
    }
    public static int romanToInt1(String s){
        int num = 0;
        int l = s.length();
        int last = 1000;
        for (int i = 0; i < l; i++){
            int v = getValue(s.charAt(i));
            if (v > last) num = num - last * 2;
            num = num + v;
            last = v;
        }
        return num;
    }
    private static int getValue(char c){
        switch(c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}