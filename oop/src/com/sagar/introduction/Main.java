package com.sagar.introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // data of 5 students: {roll no, name, marks}
        int[] rNo = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // create an object
        Student[] students = new Student[5];            // students, sagar these are  reference variable

        // new :- dynamically allocates memory and returns a reference to it

        // just declaring
//        Student sagar;                   // it's not an object

        Student sagar = new Student();

        System.out.println(sagar.name);         // null
        System.out.println(sagar.rNo);          // 0
        System.out.println(sagar.marks);        // 0.0

        Student kety = new Student();           // Student() is a default constructor
        kety.rNo = 1;
        kety.name = "sagar yadav";
//        kety.marks = 78.6f;

        System.out.println(kety.rNo);           // 1
        System.out.println(kety.name);          // sagar yadav
//        System.out.println(kety.marks);         // 78.6
        System.out.println(kety.marks);         // 80.0


        // constructor is a special function, that runs when you create an object, and it allocates some variables

        Student yadav = new Student();
        System.out.println(yadav.rNo);      // 10
        System.out.println(yadav.name);     // sagar kumar yadav
        System.out.println(yadav.marks);    // 54.76

        yadav.greetings();

        yadav.changeName("Kety");


        Student s1 = new Student(5, "sagar kumar yadav", 40);
        System.out.println(s1.rNo);             // 5
        System.out.println(s1.name);            // sagar kumar yadav
        System.out.println(s1.marks);           // 40.0

        Student random = new Student(kety);
        System.out.println(random.name);

        Student one = new Student();
        Student two = one;

        one.name = "tushar k";
        System.out.println(two.name);           // tushar k


    }
}

// create a class
class Student {
    int rNo;             // rNo, name, marks these are Instance variable
    String name;
    float marks = 80;

    // we need a way to add the values of the above properties object by object

    // we need one word to access every object

    void greetings() {
        System.out.println("Hello my name is "+ name);          // Hello my name is sagar kumar yadav
        System.out.println("Hello my name is "+ this.name);     // Hello my name is sagar kumar yadav
    }

    void changeName(String newName) {
        System.out.println("Hello my name is " + newName);      // Hello my name is Kety
    }

    // create constructor
    Student() {
        this.rNo = 10;
        this.name = "sagar kumar yadav";
        this.marks = 54.76f;
    }

    Student(int roll, String name, float marks) {
        this.rNo = roll;
        this.name = name;
        this.marks = marks;
    }

    Student (Student other) {
        this.name = other.name;
        this.rNo = other.rNo;
        this.marks = other.marks;
    }
}
