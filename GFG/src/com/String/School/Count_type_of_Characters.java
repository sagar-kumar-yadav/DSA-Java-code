package com.String.School;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

class Count_type_of_Characters
{
    public static void main(String[] args) {
        String S = "#GeeKs01fOr@gEEks07";
        System.out.println(Arrays.toString(count(S)));
    }
    static int[] count(String s)
    {
        // your code here
        int[] ans = new int[4];
//        ArrayList<Integer> ans = new ArrayList<>();

        int upperCase = 0;
        int lowercase = 0;
        int numeric = 0;
        int special = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                upperCase++;
            }

            else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                lowercase++;
            }

            else if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                numeric++;
            }

            else {
                special++;
            }
        }
//        ans.add(upperCase);
//        ans.add(lowercase);
//        ans.add(numeric);
//        ans.add(special);
        ans[0] = upperCase;
        ans[1] = lowercase;
        ans[2] = numeric;
        ans[3] = special;

        return ans;
    }
}