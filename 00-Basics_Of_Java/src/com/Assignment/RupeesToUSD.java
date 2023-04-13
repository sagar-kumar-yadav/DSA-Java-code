package com.Assignment;

import java.util.Scanner;

public class RupeesToUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter ruppes: ");
        float rupees = in.nextLong();

        float dollars = (float) (rupees/82.59);

        System.out.println(dollars + " Dollars");
    }
}
