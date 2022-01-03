package com.String.School;

import java.util.ArrayList;

class Extract_the_integers
{
    public static void main(String[] args) {
        String s = "1: Prakhar Agrawal, 2: Manish Kumar Rai, 3: Rishabh Gupta56";
//        String s = "sagar";
        System.out.println(extractIntegerWords(s));
    }
    static ArrayList<String> extractIntegerWords(String s)
    { 
        // code here
        ArrayList<String> arraylist = new ArrayList<>();
        String num = s.replaceAll("\\D+", " ");
        num = num.trim();

        if(num.length()==0) {
            arraylist.add("No Integers");
        }
        else {
            arraylist.add(num);
        }

        return arraylist;

    }
} 