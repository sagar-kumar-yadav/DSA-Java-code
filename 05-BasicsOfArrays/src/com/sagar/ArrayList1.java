package com.sagar;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public ArrayList1() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList();

        int i;
        for(i = 0; i < 3; ++i) {
            list.add(new ArrayList());
        }

        for(i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                ((ArrayList)list.get(i)).add(sc.nextInt());
            }
        }

        System.out.println(list);
    }
}
