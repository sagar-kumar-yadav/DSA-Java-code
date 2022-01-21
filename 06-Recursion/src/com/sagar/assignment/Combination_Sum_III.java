package com.sagar.assignment;

// https://leetcode.com/problems/combination-sum-iii/

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_III {
    public static void main(String[] args) {
        int k = 3;
        int n = 7;
        System.out.println(combinationSum3(k, n));
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        findCombinationIII(1, k, n, ans, list);
        return ans;
    }

    private static void findCombinationIII(int start, int k, int target, List<List<Integer>> ans, ArrayList<Integer> list) {
        if (target < 0) {
            return;
        }
        if (target == 0 && list.size() == k){
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i <= 9; i++) {
            list.add(i);
            findCombinationIII(i+1, k, target - i, ans, list);
            list.remove(list.size() - 1);
        }
    }
}
