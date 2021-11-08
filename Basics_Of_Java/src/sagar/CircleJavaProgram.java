package sagar;
import java.util.*;

public class CircleJavaProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter your radius here: ");
        int r = in.nextInt();

        double pi = 3.14;
        double area = pi * r * r;
        System.out.println("Area of circle "+ area);

    }
}
