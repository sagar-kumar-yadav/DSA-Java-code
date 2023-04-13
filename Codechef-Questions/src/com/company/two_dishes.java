package com.company;

import java.util.Scanner;

public class two_dishes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while(tc-- > 0) {
            int noOfDish = sc.nextInt();
            int fruit = sc.nextInt();
            int vej = sc.nextInt();
            int fish = sc.nextInt();

            int creDish = 0;
            while (fruit != 0  && vej != 0 && fish != 0){
                if (fruit >= 0 && vej >= 0)  {
                    creDish++;
                    fruit--;
                    vej--;
                }
                if (vej >= 0 && fish >= 0) {
                    creDish++;
                    vej--;
                    fish--;
                }
            }
            if (creDish == noOfDish) {
                System.out.println("YES");
            }else {
                System.out.println("No");
            }
        }
    }
}
