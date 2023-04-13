package com.company;

public class calculate_pow {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
//        System.out.println(power1(x, y));
//        System.out.println(power2(x, y));
        System.out.println(power3(x, y));
    }
    // solution - 1;
    private static int power1(int x, int y) {
        if (y == 0) {
            return 1;
        }else {
            return x * power1(x, y-1);
        }
    }

    // solution - 2;
    private static int power2(int x, int y) {
        if (y == 0) {
            return 1;
        }
        if (y % 2 == 0) {
            return power2(x, y/2) * power2(x, y/2);
        }else {
            return x * power2(x, y/2) * power2(x, y/2);
        }
    }

    // solution - 3;
    private static int power3(int x, int y) {
        if (y == 0) {
            return 1;
        }
        int temp = power3(x, y/2);
        if (y % 2 == 0) {
            return temp * temp;
        }else {
            return x*temp*temp;
        }
    }
}
