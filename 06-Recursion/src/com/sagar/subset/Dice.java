package com.sagar.subset;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
//        dice("", 4);
        System.out.println(diceRet("", 4));
    }

    private static void dice(String p, int up) {
        if (up == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= up; i++) {
            dice(p + i, up - i);
        }
    }

    private static ArrayList<String> diceRet(String p, int up) {
        ArrayList<String> list = new ArrayList<>();
        if (up == 0) {
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= up; i++) {
            ans.addAll(diceRet(p + i, up - i));
        }
        return ans;
    }
}
