package com.sagar.stringandstringbuilder;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());  // abcdefghijklmnopqrstuvwxyz

        builder.reverse();

        System.out.println(builder);  // zyxwvutsrqponmlkjihgfedcba
    }
}
