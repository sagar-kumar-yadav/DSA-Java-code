package sagar;

public class Butterfly {

    public static void main(String[] args) {
        int n = 4;
/*

        *      *
        **    **
        ***  ***
        ********
        ********
        ***  ***
        **    **
        *      *

*/


        // outer
        for (int i = 1; i <= n; i++) {
            // inner
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 1st half space
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            // inner
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 2nd half space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
