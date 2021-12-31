package com.String.medium;

class Reverse_each_word_in_a_given_string {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        System.out.println(reverseWords(s));

    }
   
    static String reverseWords(String S) {

        // convert to array
        char[] ch = S.toCharArray();
        int i = 0;
        for (int j = 0; j < ch.length; j++) {
            if (ch[j] == '.'){
                reverse(ch, i, j-1);
                i = j + 1;
            }
        }
        reverse(ch, i, ch.length-1);        // this statement for last statement
        return new String(ch);


    }

    private static void reverse(char[] ch, int i, int j) {
        while (i <= j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;
        }
    }
}