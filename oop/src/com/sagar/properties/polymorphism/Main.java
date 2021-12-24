package com.sagar.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        shapes shape = new shapes();
        circle cir = new circle();
        square sq = new square();
        triangle t = new triangle();

        shape.area();
        cir.area();
        sq.area();
        t.area();
    }
}
