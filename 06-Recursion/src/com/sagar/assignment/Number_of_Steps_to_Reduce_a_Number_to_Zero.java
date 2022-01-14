package com.sagar.assignment;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

import java.util.Scanner;

public class Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(numberOfSteps(n));
        System.out.println(numberOfStepsRec(n));
    }

    // iterative approach
    public static int numberOfSteps(int num) {
        int step = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num/2;
            }
            else {
                num = num - 1;
            }
            step++;
        }
        return step;
    }

    // recursive approach
    public static int numberOfStepsRec(int num) {
        return countStep(num, 0);
    }

    private static int countStep(int num, int step) {
        if (num == 0) {
            return step;
        }
        if (num % 2 == 0) {
            return countStep(num/2, step+1);
        }
        return countStep(num-1, step+1);
    }
}
