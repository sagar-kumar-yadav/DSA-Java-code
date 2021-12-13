package com.sagar.stringandstringbuilder;

import java.sql.Array;
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args){
        System.out.println('a' + 'b');   // 195

        System.out.println("a" + "b");   // ab

        System.out.println('a' + 3);  // 100

        System.out.println("a" + 1);  // a1

        System.out.println((char) ('a' + 3));  // d

        System.out.println("Sagar"+ new ArrayList<>()); // Sagar[]

        System.out.println("Sagar"+ new Integer(56)); // Sagar56

        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);        // 56

        System.out.println("a" + "b"); // ab
    }
}
