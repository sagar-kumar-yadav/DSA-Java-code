package com.sagar.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();     // -1.0 -1.0 -1.0
//        Box box = new Box(4);  // 4.0 4.0 4.0
//        Box box = new Box(4.6, 7.9, 9.9);  // 4.6 9.9 7.9
//
//        System.out.println(box.l + " " + box.w + " " + box.h);


        BoxWeight box2 = new BoxWeight();
        System.out.println(box2.h +" "+ box2.weight);  // -1.0 -1.0

        BoxWeight box3 = new BoxWeight(2, 3, 4, 8);
        System.out.println(box3.l+" "+box3.h+" "+box3.w+" "+box3.weight);  // 2.0 3.0 4.0 8.0

        Box box4 = new BoxWeight(2, 3, 4, 8);
        System.out.println(box4.h); // 3.0

//        BoxWeight box5 = new Box(2, 3, 4);
//        System.out.println(box5); // error
    }
}
