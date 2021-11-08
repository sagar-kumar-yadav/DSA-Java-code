package sagar;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter base here: ");
        int b = in.nextInt();

        System.out.print("enter hight here: ");
        int h = in.nextInt();

        float area = (b * h)/2;
        System.out.println("area of triangle: "+ area);
    }
}
