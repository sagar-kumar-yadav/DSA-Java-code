package com.Assignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Q.Take name as input and print a greeting message for that name.

        Scanner in = new Scanner(System.in);
        System.out.print("enter your name here: ");
        String name = in.next();

        System.out.println("good evening " + name);
    }
}
