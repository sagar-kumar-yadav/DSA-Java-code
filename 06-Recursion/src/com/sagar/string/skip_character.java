package com.sagar.string;

public class skip_character {
    public static void main(String[] args) {
        String str = "baccad";       // output :- bccd
        System.out.println(skip(str));
    }

    // bruteforce
    public static String skip(String str){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a'){
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    // using recursion

}
