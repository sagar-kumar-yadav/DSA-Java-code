package com.functions;

// https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html
// Q. How to Find the Largest and Smallest of Three Numbers in Java?

import java.util.Scanner;

public class Find_Largest_And_Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);

        System.out.println(largest(first, second, third));
        System.out.println(smallest(first, second, third));
    }
    static int largest(int first, int second, int third){
        int max = first;
        if (second > max){
            max = second;
        }

        if (third > max){
            max = third;
        }
        return max;
    }
    static int smallest(int first, int second, int third){
        int min = first;
        if (second < min){
            min = second;
        }

        if (third < min){
            min = third;
        }
        return min;
    }

}