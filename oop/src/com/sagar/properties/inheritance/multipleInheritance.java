package com.sagar.properties.inheritance;

interface i1 {
    void show();
}

interface i2 {
    void display();
}

class test implements i1,i2 {
    public void show() {
        System.out.println("1");
    }
    public void display() {
        System.out.println("2");
    }
}
public class multipleInheritance {
    public static void main(String[] args) {
        test t = new test();
        t.show();
        t.display();
    }
}
