package com.sagar.constructors;


class Geek {

    String name;
    int id;

    Geek(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Class 2
class Parameterized_Constructor {
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor.
        Geek geek1 = new Geek("sagar", 1);
        System.out.println(geek1.name +" "+ geek1.id);
    }
}