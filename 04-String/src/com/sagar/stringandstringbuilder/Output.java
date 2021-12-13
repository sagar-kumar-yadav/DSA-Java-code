package com.sagar.stringandstringbuilder;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(56);  // 56

        Integer num = new Integer(56);
        System.out.println(num.toString());   // 56

        System.out.println(num); // 56

        System.out.println("Sagar");  // Sagar

        System.out.println(Arrays.toString(new int[]{2, 3, 4, 5}));  // [2, 3, 4, 5]

        String name = null;
        System.out.println(name);  // null

    }
}
