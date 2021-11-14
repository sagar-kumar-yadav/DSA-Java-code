package com.sagar;

// https://leetcode.com/problems/find-the-highest-altitude/
// 1732. Find the Highest Altitude

class Highest_Altitude {
    public static void main(String[] args){
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int sum = 0;
        int currSum = 0;
        for (int i = 0; i < gain.length; i++) {
            currSum += gain[i];
            if (currSum > sum){
                sum = currSum;
            }
        }
        return sum;
    }
}