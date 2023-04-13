package com.sagar;

public class q4 {
    public static void main(String[] args) {
        for (int loop = 0; loop < 5; loop++) {
            if (loop > 2) {
                continue;
            }
            if (loop > 4) {
                break;
            }
            System.out.println(loop);
        }
    }
}
