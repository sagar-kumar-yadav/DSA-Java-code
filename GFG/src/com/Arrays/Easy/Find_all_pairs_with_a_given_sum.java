package com.Arrays.Easy;

import java.util.*;

public class Find_all_pairs_with_a_given_sum {

    public class pair {
        long first, second;
        public pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }
    public static void main(String[] args) {
        long[] A = {1, 2, 4, 5, 7};
        long[] B = {5, 6, 3, 4, 8};
        long X = 9;
        Find_all_pairs_with_a_given_sum obj = new Find_all_pairs_with_a_given_sum();
        pair[] ans  = obj.allPairs(A, B, 5, 5, X);
        System.out.println(Arrays.toString(ans));
    }
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        Arrays.sort(A) ;
        Set <Long> set = new LinkedHashSet<>  ();
        ArrayList <pair> list = new ArrayList <>();

        for (int i = 0; i < B.length; i++) {
            Long x = B[i];
            set.add(x);
        }

        for (int i = 0; i < A.length; i++) {
            Long x = A[i];
            if (set.contains(X - x)) {
                pair p = new pair(x, X - x);
                list.add(p);
            }
        }

        pair []  ans  = new pair [list.size()] ;

        int k = 0 ;

        for (int i = 0; i < list.size(); i++) {
            pair x = list.get(i);
            ans[k++] = x;
        }

        return ans ;

    }
}
