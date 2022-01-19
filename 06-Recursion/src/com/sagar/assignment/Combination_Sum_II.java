package com.sagar.assignment;

// https://leetcode.com/problems/combination-sum-ii/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II {
    public static void main(String[] args) {
        int[] candidates = {1, 1, 1, 2, 2};
        int target = 4;
        System.out.println(combinationSumII(candidates, target));
    }
    public static List<List<Integer>> combinationSumII(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        findCombinationII(0, candidates, target, ans, list);
        return ans;
    }

    private static void findCombinationII(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> list) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i-1]) {
                continue;
            }
            if (arr[i] > target) {
                break;
            }
            list.add(arr[i]);
            findCombinationII(i + 1, arr, target - arr[i], ans, list);

            // if target is not zero reduce size
            list.remove(list.size() - 1);
        }
    }
}
