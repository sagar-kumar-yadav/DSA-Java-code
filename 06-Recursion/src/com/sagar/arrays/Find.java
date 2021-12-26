package com.sagar.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Find {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 1, 4, 5};
//        System.out.println(find(arr, 5, 0));
//        System.out.println(findIndex(arr,5,0));
//        System.out.println(findIndexLast(arr,5,arr.length-1));

        int[] arr = {2, 3, 4, 5, 4, 4};
        findAllIndex(arr, 4, 0);
        System.out.println(list);

        ArrayList<Integer> ans = findAllIndex1(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);

        ArrayList<Integer> ans1 = findAllIndex2(arr, 4, 0);
        System.out.println(ans1);
    }
    public static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    public static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target){
            return index;
        }
        else {
            return findIndex(arr, target, index+1);
        }
    }

    public static int findIndexLast(int[] arr, int target, int index){
        if (index == -1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }
        else {
            return findIndexLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    public static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }

        if (arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

    public static ArrayList<Integer> findAllIndex1(int[] arr, int target, int index, ArrayList<Integer> list1) {
        if (index == arr.length) {
            return list1;
        }

        if (arr[index] == target){
            list1.add(index);
        }

        return findAllIndex1(arr, target, index+1, list1);
    }

    public static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list2 = new ArrayList<>();
        if (index == arr.length) {
            return list2;
        }
        if (arr[index] == target) {
            list2.add(index);
        }

        ArrayList<Integer> ansFromBelowCells = findAllIndex2(arr, target,index+1);

        list2.addAll(ansFromBelowCells);

        return list2;
    }
}
