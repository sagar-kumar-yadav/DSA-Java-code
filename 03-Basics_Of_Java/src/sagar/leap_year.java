package sagar;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {

        // Q input a year and find whether it is a leap year or not

        Scanner in = new Scanner(System.in);
        System.out.print("Enter year here: ");
        int year = in.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println( year + " is a leap year");
        }else{
            System.out.println( year + " is not a leap year");
        }

    }
}
