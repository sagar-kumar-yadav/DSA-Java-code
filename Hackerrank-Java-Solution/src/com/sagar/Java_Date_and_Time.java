package com.sagar;

import java.time.LocalDate;
import java.util.Scanner;

public class Java_Date_and_Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        findDay(month, day, year);

    }
    public static void findDay(int month, int day, int year){
        LocalDate dt = LocalDate.of(year, month, day);
        System.out.println(dt.getDayOfWeek());
    }
}
