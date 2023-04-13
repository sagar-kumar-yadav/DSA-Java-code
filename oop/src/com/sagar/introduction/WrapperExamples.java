package com.sagar.introduction;

public class WrapperExamples {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        swap(a, b);

//        System.out.println(a + " " + b);        // not swap because these are primitives in java everything is passed by value
                                                    //not by reference

        Integer a = 10;
        Integer b = 20;

        swap(a, b);
        System.out.println(a +" "+b);              // not swap because Integer class in final

        // Final Keyword
        final int bonus = 10;
        // bonus = 12;                              // final value not be changed

        final A sagr = new A("Sagar k Yadav");
        sagr.name = "Other name";

        // when a non primitive is final, you cannot reassign it.
//        sagr = new A("new object");

        A obj;
        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Random name");
        }
    }

    static void swap(int a, int b) {
        Integer temp  = a;
        a = b;
        b = temp;
    }
}

class A {
//    final int num;  // Error : because final variable need to be initialized

    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}