package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sparse_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        ArrayList<String > strings = new ArrayList<String>();
        for (int i = 0; i < x; i++) {
            strings.add(sc.next());
        }

        int y = sc.nextInt();
        ArrayList<String> queries = new ArrayList<>(strings);
        for (int i = 0; i < y; i++) {
            queries.add(sc.next());
        }
    }
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        int count = 0;
        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < queries.size(); j++) {
                if (strings.indexOf(i) == queries.indexOf(i)) {
                    count++;
                }
            }
        }
        List<Integer> ans = Collections.singletonList(count);
        return ans;
    }
}
