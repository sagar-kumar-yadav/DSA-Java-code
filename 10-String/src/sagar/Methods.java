package sagar;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Sagar Kumar Yadav";
        System.out.println(Arrays.toString(name.toCharArray()));  // [S, a, g, a, r,  , k, u, m, a, r,  , y, a, d, a, v]

        System.out.println(name.toLowerCase());  // [S, a, g, a, r,  , k, u, m, a, r,  , y, a, d, a, v]

        System.out.println(name);  // Sagar Kumar Yadav

        System.out.println(name.indexOf('a')); // 1

        System.out.println("    Sagar     ".strip());  // Sagar

        System.out.println(Arrays.toString(name.split(" "))); // [Sagar, Kumar, Yadav]
    }
}
