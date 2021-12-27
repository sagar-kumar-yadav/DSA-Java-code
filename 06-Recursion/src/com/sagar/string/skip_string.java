package com.sagar.string;

public class skip_string {
    public static void main(String[] args) {
//        String str = "sagarappleyadavapple";
        String str = "sagar app eat apple";
        System.out.println(skipString(str));

        System.out.println(skipAppNotApple(str));
    }

    // remove apple
    private static String skipString(String str) {
        if (str.isEmpty()){
            return "";
        }

        if (str.startsWith("apple")){
            return skipString(str.substring(5));
        }
        else {
            return str.charAt(0) + skipString(str.substring(1));
        }
    }

    // remove app not apple
    private static String skipAppNotApple(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skipAppNotApple(str.substring(3));
        }
        else {
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }
    }
}
