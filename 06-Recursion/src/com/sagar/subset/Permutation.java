package com.sagar.subset;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
//        permutation("", "abc");

//        cba
//        bca
//        bac
//        cab
//        acb
//        abc


//        ArrayList<String> ans = permutationsList("", "abc");
//        System.out.println(ans);    // [cba, bca, bac, cab, acb, abc]

        System.out.println(permutationCount("", "abcd")); // 24
    }

    public static void permutation(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutation(first + ch + second, up.substring(1));
        }
    }

    public static ArrayList<String> permutationsList(String p, String up) {

        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(permutationsList(first + ch + second, up.substring(1)));
        }
        return ans;
    }

    public static int permutationCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count = count + permutationCount(first + ch + second, up.substring(1));
        }
        return count;
    }
}
