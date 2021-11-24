package com.sagar;

import java.util.Scanner;

public class Java_Datatypes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();                  // test cases

        for (int i = 0; i < t; i++){
            try {
                long x = in.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127){
                    System.out.println("* byte");
                }
                if (x >= -(Math.pow(2, 16 - 1)) && x <= (Math.pow(2, 16 -1) -1)){
                    System.out.println("* short");
                }
                if (x >= -(Math.pow(2, 32 -1)) && x <= (Math.pow(2, 32 -1) -1)){
                    System.out.println("* int");
                }
                if (x >= -(Math.pow(2, 64 - 1)) && x <= (Math.pow(2, 64 -1) -1)){
                    System.out.println("* long");
                }
            }
            catch (Exception e){
                System.out.println(in.next() + " can't be fitted anywhere.");
            }
        }
    }
}
