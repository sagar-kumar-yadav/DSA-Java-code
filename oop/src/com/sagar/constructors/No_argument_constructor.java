package com.sagar.constructors;

// Default constructor provides the default values to the object like 0, null, etc. depending on the type.

class geek {
    int num;
    String name;

    geek (){
        System.out.println("Constructor called");
    }

}
public class No_argument_constructor {
    public static void main(String[] args) {
        geek g1 = new geek();

        System.out.println(g1.name);
        System.out.println(g1.num);
    }
}
