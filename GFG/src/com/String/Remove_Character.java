package com.String;

import java.util.HashMap;
import java.util.HashSet;

class Remove_Character {
    public static void main(String[] args) {
        String string1 = "computer";
        String string2 = "cat";
        System.out.println(removeChars(string1, string2));
    }
    static String removeChars(String string1, String string2){
        // create a hashmap
        HashMap<Character, Boolean> hm = new HashMap<>();

        // store char here
        String ans = "";

        // string2 to store on map
        for (int i = 0; i < string2.length(); i++) {
            hm.put(string2.charAt(i), true);
        }
        // string1 to store on map if not store add in ans
        for (int i = 0; i < string1.length(); i++) {
            if (hm.get(string1.charAt(i)) == null){
                ans += string1.charAt(i);
            }
        }
        return ans;
    }
    
}