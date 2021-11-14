package com.sagar;

// https://leetcode.com/problems/count-items-matching-a-rule/
// 1773. Count Items Matching a Rule

import java.util.List;
import java.util.Scanner;

public class Count_Items_Matching_A_Rule {
    public static void main(String[] args) {
        String[][] items = {{"Phone", "Pixle", "blue"},{"Computer", "Silver", "Lenovo"},{"Phone", "Gold", "Iphone"}};
        String ruleKey = "color";
        String ruleValue = "silver";
//        System.out.println(countMatch(items, ruleKey, ruleValue));
    }
    static int countMatch(List<List<String>> items, String ruleKey, String ruleValue) {

        int ans = 0;
        if (ruleKey.equals("type")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(0).equals(ruleValue)){
                    ans++;
                }
            }
        }
        else if (ruleKey.equals("color")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(1).equals(ruleValue)){
                    ans++;
                }
            }
        }
        else {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(2).equals(ruleValue)){
                    ans++;
                }
            }
        }
        return ans;
    }

}
