package com.sagar.assignment;

public class Sum_of_digit_of_a_number_using_recursion {
    public static void main(String[] args) {
        int num = 12345;
//        sumOfDigit(num);

        System.out.println(sumOfDigitRec(num));

    }

    private static void sumOfDigit(int num) {
        // bruteforce
        int sum = 0;

        while (num > 0){
            int rem = num % 10;
            sum += rem;
            num = num/10;
        }
        System.out.println(sum);
    }

    // recursive
    private static int sumOfDigitRec(int num) {
        // base case
        if (num == 0) {
            return 0;
        }
        return (num % 10 + sumOfDigitRec(num / 10));
    }
}
