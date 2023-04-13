package com.company.oneweekprepration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lonely_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> a = new ArrayList<>(7);
        for (int i = 0; i < 7; i++) {
            a.add(sc.nextInt());
        }
        System.out.println(lonelyinteger(a));
    }

    public static int lonelyinteger(List<Integer> a) {
        int ans = 0;
        for (int i = 0; i < a.size(); i++) {
            ans ^= a.get(i);
        }
        return ans;
    }
}
