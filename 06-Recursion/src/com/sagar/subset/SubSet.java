package com.sagar.subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        List<List<Integer>> ans = subSet(arr);
        for (int i = 0; i < ans.size(); i++) {
            List<Integer> list = ans.get(i);
            System.out.println(list);
        }
//[]
//[1]
//[2]
//[1, 2]
//[3]
//[1, 3]
//[2, 3]
//[1, 2, 3]

//        int[] arr = {1, 2, 2};
//        List<List<Integer>> ans1 = subSetDuplicate(arr);
//        for (int i = 0; i < ans1.size(); i++) {
//            List<Integer> list = ans1.get(i);
//            System.out.println(list);
//        }

//  []
//  [1]
//  [2]
//  [1, 2]
//  [2, 2]
//  [1, 2, 2]

    }

    public static List<List<Integer>> subSet(int[] arr) {

        // crate outer list
        List<List<Integer>> outer = new ArrayList<>();

        // add new empty list
        outer.add(new ArrayList<>());

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int n = outer.size();       // size of outer list

            for (int j = 0; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(num);
                outer.add(internal);
            }

        }

        return outer;
    }

    public static List<List<Integer>> subSetDuplicate(int[] arr) {

        // sort the array
        Arrays.sort(arr);

        // create outer list
        List<List<Integer>> outer = new ArrayList<>();

        // add new empty list
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if current and previous element is same start = end + 1;
            if (i > 0 && arr[i] == arr[i-1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();

            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);;
            }
        }
        return outer;
    }
}
