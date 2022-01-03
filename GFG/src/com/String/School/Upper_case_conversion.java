package com.String.School;

class Upper_case_conversion
{
    public static void main(String[] args) {
        String str = "i love programming";
        System.out.println(transform(str));
    }
    public static String transform(String s)
    {
        // code - 1
        String[] arr = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)));
            sb.append(arr[i].substring(1)).append(" ");
        }
        return sb.toString().trim();


    }
}