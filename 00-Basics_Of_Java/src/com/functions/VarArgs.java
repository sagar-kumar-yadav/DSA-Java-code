package com.functions;

import java.util.Arrays;

// variable length arguments means when we do not know how many inputs we are giving
public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 56, 87, 32, 45, 65);
        demo("sagar", "kumar", "yadav");
        demo1();
        multiple(2, 3, "sagar", "kumar");

    }
    static void multiple(int a, int b, String ...v){
        System.out.println();
    }

    static void demo1(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }


    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
