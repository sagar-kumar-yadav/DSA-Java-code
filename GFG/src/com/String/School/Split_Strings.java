package com.String.School;

import java.util.ArrayList;
import java.util.List;

class Split_Strings
{
    public static void main(String[] args) {
        String S = "geeks01for02geeks03!!!";
        System.out.println(splitString(S));
    }
    static List<String> splitString(String S)
    { 
        // code here
        String s1 = "";
        String s2 = "";
        String s3 = "";


        char[] ch = S.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z') {
                s1 += ch[i];
            }
            else if (ch[i] >= '0' && ch[i] <= '9'){
                s2 += ch[i];
            }
            else {
                s3 += ch[i];
            }
        }

        ArrayList<String> ans = new ArrayList<>();
        ans.add(s1);
        ans.add(s2);
        ans.add(s3);
        return ans;
    }
} 
