package sagar;

import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Q. take 2 number as input and print the largest number

        System.out.print("enter first number here: ");
        int num1 = in.nextInt();
        System.out.print("enter your second number here: ");
        int num2 = in.nextInt();

        if (num1>num2){
            System.out.println(num1+ " is largest number");
        }else{
            System.out.println(num2+ " is largest number");
        }
    }
}
