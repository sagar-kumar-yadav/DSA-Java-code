package sagar;

public class Solid_Rectangle {
    public static void main(String[] args) {
        int n = 4;
    /*
        ****
        ****
        ****
        ****
    */
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
