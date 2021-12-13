package com.Assignment;

import java.util.Scanner;

public class armstrong_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(isArmstrong(n));

        for (int i = 1; i < 1000; i++){
            if (isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n){
        int orignal = n;
        int sum = 0;

        while (n>0){
            int rem = n % 10;
            n = n / 10;
            int cube = rem*rem*rem;
            sum = sum + cube;

        }
        return sum == orignal;
    }
}
