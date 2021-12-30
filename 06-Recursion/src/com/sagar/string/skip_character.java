package com.sagar.string;

public class skip_character {
    public static void main(String[] args) {
        String str = "baccad";       // output :- bccd
//        System.out.println(skip(str));

//        skip1("", "baccad");

        System.out.println(skip2(str));
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

    // using recursion - 1
    public static void skip1(String p, String up) {             // p - process , up - unprocessed
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skip1(p, up.substring(1));
        }
        else {
            skip1(p + ch, up.substring(1));
        }
    }

    // using recursion - 2
    public static String skip2(String up){
        if (up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip2(up.substring(1));
        }
        else {
            return ch + skip2(up.substring(1));
        }
    }
}
