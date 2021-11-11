package sagar;

public class Number_Pyramid {
    public static void main(String[] args) {
        int n = 4;
/*
           1
          2 2
         3 3 3
        4 4 4 4
*/

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
