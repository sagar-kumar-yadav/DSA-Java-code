package com.sagar.assignment;

// https://www.geeksforgeeks.org/product-2-numbers-using-recursion/

public class Product_of_two_Numbers_using_Recursion {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        System.out.println(product(x, y));
    }

    private static int product(int x, int y) {
        if (x < y) {
            return product(y, x);
        }
        else if (y != 0) {
            return (x + product(x, y - 1));
        }
        else {
            return 0;
        }
    }
}
