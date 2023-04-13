package com.sagar.pattern;

import java.util.ArrayList;

public class inverted_half_pyramid_with_numbers {
    public void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void patternset1(int n) {
        for (int i=n; i>=1; i--) {
            for (int j=n; j>=1; j--) {
                for (int k = 1; k <= i; k++) {
                    System.out.print(j+" ");
                }
            }
            System.out.print("$");
        }
    }

    public ArrayList<Integer> getTable(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int mul = (n * i);
            list.add(mul);
        }
        return list;
    }

    public int closestNumber(int N, int M) {
        
    }
}
