package com.sagar.tendays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'weightedMean' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY X
     *  2. INTEGER_ARRAY W
     */

    public static void weightedMean(List<Integer> X, List<Integer> W) {
        // Write your code here
        int xsum = 0;
        int wSum = 0;
        for (int i = 1; i <= X.size(); i++) {
            for (int j = 1; j <= W.size(); j++) {
                xsum += X.indexOf(i) * W.indexOf(j);
                wSum += W.indexOf(j);
            }
        }
        int ans = xsum/wSum;
        System.out.println(ans);
    }
}

public class day0_Weighted_Mean {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> vals = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> weights = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.weightedMean(vals, weights);

        bufferedReader.close();
    }
}
