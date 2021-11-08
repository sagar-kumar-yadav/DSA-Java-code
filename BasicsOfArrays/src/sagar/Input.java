package sagar;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public Input() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        String[] str = new String[4];

        for(int i = 0; i < str.length; ++i) {
            str[i] = sc.next();
        }

        str[1] = "sagar";
        System.out.println(Arrays.toString(str));
    }
}
