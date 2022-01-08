package com.sagar.subset;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
//        phonePad("", "12");

//        ad
//                ae
//        af
//                bd
//        be
//                bf
//        cd
//                ce
//        cf

//        System.out.println(phonePadRet("", "12"));  // [ad, ae, af, bd, be, bf, cd, ce, cf]

        System.out.println(phonePadCount("", "12")); // 9
    }

    public static void phonePad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; // this will convert '2' into 2

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            phonePad(p + ch, up.substring(1));
        }
    }

    // return list
    public static ArrayList<String> phonePadRet(String p, String up) {
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(phonePadRet(p + ch, up.substring(1)));
        }
        return ans;
    }

    // return count
    public static int phonePadCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        int count = 0;
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + phonePadCount(p + ch, up.substring(1));
        }
        return count;
    }
}