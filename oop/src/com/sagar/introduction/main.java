package com.sagar.introduction;

public class main {
    public static void main(String[] args) {

        Student st1 = new Student();

        st1.rollNo = 13;
        st1.name = "sagar kumar";
        st1.marks = 80.5f;

        Student st2 = new Student();
        st2.name = "Salman khan";
        st2.rollNo = 45;
        st2.marks = 56;

        System.out.println(st1.rollNo);
        System.out.println(st1.name);
        System.out.println(st1.marks);

        System.out.println(st2.name + " "+ st2.rollNo+" "+ st2.marks);

        st1.eat();
        st2.walk();
    }
}
// create a class
// for every single student
class Student{
    int rollNo;
    String name;
    float marks;

    void eat(){
        System.out.println(name+" is eating");
    }
    void walk(){
        System.out.println(name+ " is walking");
    }

}
