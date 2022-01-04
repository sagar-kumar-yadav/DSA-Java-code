package com.String.Basic;

class longest_substring_containing_1 {
    public static void main(String[] args) {
        String s = "11101110";
        System.out.println(count(s));
    }
    public static int count(String s)
    {
        //add code here.
        int Count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1'){
                Count++;
            }
            else {
                break;
            }
        }
        return Count;
        
    }
}