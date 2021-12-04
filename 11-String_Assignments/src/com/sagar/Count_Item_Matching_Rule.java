package com.sagar;

import java.util.List;

public class Count_Item_Matching_Rule {
    public static void main(String[] args) {
        String[][] items = {
                {"Phone", "blue", "pixle"},
                {"computer", "silver", "lenovo"},
                {"phone" ,"gold" ,"iphone"}
        };

        String ruleKey = "color";
        String ruleValue = "silver";

    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        if (ruleKey.equals("type")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(0).equals(ruleValue)){
                    ans++;
                }
            }
        }
    }
}
