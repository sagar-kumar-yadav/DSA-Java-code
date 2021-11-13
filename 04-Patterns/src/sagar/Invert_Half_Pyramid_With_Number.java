package sagar;

public class Invert_Half_Pyramid_With_Number {
    public static void main(String[] args){
        int n = 4;
    /*
        1 2 3 4
        1 2 3
        1 2
        1
    */
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
