package com.sagar.kkp;

import java.util.ArrayList;
import java.util.Scanner;

public class kkkkk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> v1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            v1.add(sc.nextInt());
        }

        int m = sc.nextInt();
        ArrayList<Integer> v2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            v2.add(sc.nextInt());
        }
        System.out.println(common_element(v1, v2));
    }

    public static ArrayList<Integer> common_element(ArrayList<Integer>v1, ArrayList<Integer>v2)
    {
        //Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i=0; i<v1.size(); i++) {
            for (int j=0; j<v2.size(); j++){
                if (v1.contains(v2.get(j))) {
                    ans.add(v2.get(i));
                }
            }
        }
        return ans;
    }
}
