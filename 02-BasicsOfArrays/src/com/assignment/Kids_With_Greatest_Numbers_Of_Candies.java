package com.assignment;

// https://leetcode.com/problems/shuffle-the-array/
// 1431. Kids With the Greatest Number of Candies
import java.util.ArrayList;
import java.util.List;

public class Kids_With_Greatest_Numbers_Of_Candies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        ArrayList<Boolean> ans = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (ans.add((candies[i]+extraCandies)>=max)){
                i++;
            }
        }
        return ans;
    }
}
