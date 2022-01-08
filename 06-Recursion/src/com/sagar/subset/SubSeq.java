package com.sagar.subset;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSeq {
    public static void main(String[] args) {
//        subSeq("", "abc");

//        abc
//                ab
//        ac
//                a
//        bc
//                b
//        c


//        ArrayList<String> ans = subSeqRet("", "abc");
//        System.out.println(ans);  // [abc, ab, ac, a, bc, b, c, ]

//        subsAscii("", "abc");

        ArrayList<String> ans = subsAsciiRet("", "abc");
        System.out.println(ans);
        // [abc, ab, ab99, ac, a, a99, a98c, a98, a9899, bc, b, b99, c, , 99, 98c, 98, 9899, 97bc, 97b, 97b99, 97c, 97, 9799, 9798c, 9798, 979899]

    }
    public static void subSeq(String p, String up) {        // p :- process, up:- unprocessed
        // base case
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    // return an arraylist of string
    public static ArrayList<String> subSeqRet(String p, String up) {
        ArrayList<String> list = new ArrayList<>();

        // base case
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subSeqRet(p + ch, up.substring(1));
        ArrayList<String> right = subSeqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    // subsequence with ascii value
    public static void subsAscii(String p, String up) {

        // base case
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsAscii(p + ch, up.substring(1));
        subsAscii(p, up.substring(1));
        subsAscii(p + (ch + 0), up.substring(1));
    }

    // subsequence return with ascii value
    public static ArrayList<String> subsAsciiRet(String p, String up) {

        ArrayList<String> list = new ArrayList<>();

        // base case
        if (up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subsAsciiRet(p + ch, up.substring(1));
        ArrayList<String> second = subsAsciiRet(p, up.substring(1));
        ArrayList<String> third = subsAsciiRet(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }
}
