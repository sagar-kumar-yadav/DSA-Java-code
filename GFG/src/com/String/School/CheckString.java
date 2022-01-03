package com.String.School;

class CheckString
{
    public static void main(String[] args) {
        String s = "ggg";
        System.out.println(check(s));
    }
    static Boolean check (String s)
    {
        // your code here

        char[] ch = s.toCharArray();
        for (int i=1; i<ch.length; i++) {
            if (ch[0] != ch[i]) {
                return false;
            }
        }
        return true;
    }
}