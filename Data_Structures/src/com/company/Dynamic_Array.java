package com.company;

import javax.xml.transform.Result;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Dynamic_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<List<Integer>> queries = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            queries.add(new ArrayList<>(sc.nextInt()));
        }
        System.out.println(queries);

//        System.out.println(dynamicArray(n, queries));
        dynamicArray(n, queries);
    }

    private static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        int lastAns = 0;

        List<Integer> seq = new ArrayList<>();
        List<List<Integer>> seqList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            seq = new ArrayList<>();
            seqList.add(seq);
        }

        List<Integer> correct = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            List<Integer> q = queries.get(i);
            int queryType = q.get(0);
            int x = q.get(1);
            int y = q.get(2);

            if (queryType == 1) {
                int index = (x ^ lastAns) % n;
                seqList.get(index).add(y);
            }

            if (queryType == 2) {
                int index = (x ^ lastAns) % n;
                int size = seqList.get(index).size();
                lastAns = seqList.get(index).get(y% size);
                correct.add(lastAns);
            }
        }
        return correct;
    }
}
