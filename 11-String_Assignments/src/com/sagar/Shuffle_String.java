package com.sagar;

import java.util.Arrays;

public class Shuffle_String {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }

    private static String restoreString(String s, int[] indices) {
      /*
        // using char
        char[] ch = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ch[indices[i]] = s.charAt(i);
        }
        return String.valueOf(ch);

        */


        // using StringBuilder
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            sb.setCharAt(indices[i], s.charAt(i));
        }
        return sb.toString();
    }
}
