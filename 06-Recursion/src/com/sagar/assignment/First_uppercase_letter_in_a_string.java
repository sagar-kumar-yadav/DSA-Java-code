package com.sagar.assignment;

// https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
// First uppercase letter in a string (Iterative and Recursive)

public class First_uppercase_letter_in_a_string {
    public static void main(String[] args) {
        String str = "geeksforgeeKs";
        System.out.println(searchUppercase(str));

        System.out.println(searchUppercase1(str));

        System.out.println(searchUppercase2(str));

    }

    // iterative approach
    private static String searchUppercase(String str) {

        // method - 1
        String ans = "";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z'){
                return Character.toString(ch[i]);
            }
        }
        return null;

    }

    private static char searchUppercase1(String str) {

        // method - 2
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))){
                return str.charAt(i);
            }
        }
        return 0;
    }

    // using recursion
    private static char searchUppercase2(String str) {

        // method - 2
        return search(str, 0);
    }

    private static char search(String str, int i) {
        if (str.charAt(i) == 0){
            return 0;
        }
        if (Character.isUpperCase(str.charAt(i))) {
            return str.charAt(i);
        }
        return search(str, i+1);
    }

}
