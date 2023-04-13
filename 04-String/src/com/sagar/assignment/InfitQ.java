package com.sagar.assignment;

import java.util.Arrays;

public class InfitQ {
    public static void main(String[] args) {
        String str = "temperature";
        calculate(str);
    }

    private static void calculate(String str) {
        char[] ch = str.toCharArray();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                s1.append(ch[i]);
            }
            else {
                s2.append(ch[i]);
            }
        }
        char[] ch1 = s1.toString().toCharArray();
        char[] ch2 = s2.toString().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(ch1);
        System.out.println(ch2);

        int vNo = 0;
        int cNo = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch1[0] == str.charAt(i)) {
                vNo = i;
            }
            if (ch2[ch2.length-1] == str.charAt(i)) {
                cNo = i;
            }
        }
        System.out.println(vNo);
        System.out.println(cNo);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch1.length; i++) {
            sb.append(ch1[i]);
        }
        sb.append(vNo);
        for (int i = 0; i < ch2.length; i++) {
            sb.append(ch2[i]);
        }
        sb.append(cNo);
        System.out.println(sb.toString());
    }
}
