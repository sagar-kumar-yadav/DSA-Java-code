package com.sagar.assignment;

// https://leetcode.com/problems/combination-sum/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        findCombination(0, candidates, target, ans, list);
        return ans;
    }

    private static void findCombination(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> list) {
        if (index == arr.length){
            if (target == 0) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        if (arr[index] <= target) {
            list.add(arr[index]);
            findCombination(index, arr, target - arr[index], ans, list);

            // if target is not zero reduce size
            list.remove(list.size() - 1);
        }
        findCombination(index + 1, arr, target, ans, list);
    }
}
