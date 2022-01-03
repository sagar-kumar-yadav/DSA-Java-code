package com.String.Basic;

class Implement_strstr
{
    public static void main(String[] args) {
        String s = "GeeksFrGeeks";
        String x = "Fr";
        System.out.println(strstr(s, x));
    }
    //Function to locate the occurrence of the string x in the string s.
    static int strstr(String s, String x)
    {
       // Your code here

        int flag;
        for (int i = 0; i <= (s.length()-x.length()); i++) {
            if (s.charAt(i) == x.charAt(0)){
                flag = 0;
                for (int j = 0; j < x.length(); j++) {
                    if (s.charAt(i+j) != x.charAt(j)){
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0){
                    return i;
                }
            }
        }
        return -1;
    }
}
