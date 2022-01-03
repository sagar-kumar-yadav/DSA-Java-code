package com.String.School;

class Program_to_print_reciprocal_of_letters_copy {
    public static void main(String[] args) {
        String S = "ab C";
        System.out.println(reciprocalString(S));

    }
    static String reciprocalString(String S){
        // code here
        String str= "";
        char[] ch = S.toCharArray();
        for( int i = 0; i < ch.length; i++)
        { if(ch[i]==' ') {
            str+=' ';
        }
        else if(ch[i]>=65 && ch[i]<=90)
            str+=(char)(90-(ch[i]-65));
        else if(ch[i]>=97 && ch[i]<=122)
            str+=(char)(122-(ch[i]-97));
        }
        return str;


        // using StringBuilder
/*
        StringBuilder sb = new StringBuilder();
        for( int i = 0; i < S.length(); i++)
        { if(S.charAt(i)==' ') {
            sb.append(' ');
        }
        else if(S.charAt(i)>=65 && S.charAt(i)<=90)
            sb.append((char) (90-(S.charAt(i)-65)));
        else if(S.charAt(i)>=97 && S.charAt(i)<=122)
            sb.append((char) (122-(S.charAt(i)-97)));
        }
        return sb.toString();
*/
    }
}