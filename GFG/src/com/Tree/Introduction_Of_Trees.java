package com.Tree;

public class Introduction_Of_Trees {
    public static void main(String[] args) {
        int i = 5;
        System.out.println(countNodes(i));
    }
    static int countNodes(int i) {
        if (i == 1) {
            return 1;
        }
        return (int) Math.pow(2, i-1);
    }

}
