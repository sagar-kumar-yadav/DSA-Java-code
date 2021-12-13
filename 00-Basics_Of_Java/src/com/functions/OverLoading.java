package com.functions;

public class OverLoading {
    public static void main(String[] args) {
        fun("sagar");           // function overloading happen when two or more function have same name
        fun(67);
        int ans = sum(3, 4, 78);
//        System.out.println(ans);
    }
//    static int sum(int a, int b){
//        return a + b;
//    }
    static int sum(int a, int b, int c){
        return a + b +c;
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}
