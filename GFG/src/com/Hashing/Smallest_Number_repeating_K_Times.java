package com.Hashing;

import java.lang.reflect.Array;
import java.util.*;

public class Smallest_Number_repeating_K_Times {
    public static void main(String[] args){
        int N = 7;
        int K = 3;
        int[] arr = {2, 4, 3, 4, 1, 4, 3};
        System.out.println(findDuplicate(arr, N, K));
    }

    private static int findDuplicate(int[] arr, int N, int K) {
/*

        // brute force    tc = O(n*n), sc = O(1)

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = i+1; j < N; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }

                if (count == K){
                    ans = Math.min(ans, arr[i]);
                }
            }
        }
        return ans;
    }
*/

/*

        // using sorting   tc = O(NlogN), sc = O(1)

        Arrays.sort(arr);

        int ans = Integer.MAX_VALUE;
        int count = 1;
        for (int i = 0; i < N-1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            }
            if (count == K) {
                ans = Math.min(ans, arr[i]);
            }
        }
        return ans;
    }
*/

/*
        // store element in hashmap     tc = O(N), sc = O(N)

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < N; i ++) {

            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            else {
                hm.put(arr[i], 1);
            }
        }

        // Traverse the map and find minimum
        int minVal = Integer.MAX_VALUE;
        Set<Integer> s = hm.keySet();

        for (Iterator<Integer> iterator = s.iterator(); iterator.hasNext(); ) {
            int temp = iterator.next();
            if (hm.get(temp) == K)
                minVal = Math.min(minVal, temp);
        }

        if (minVal != Integer.MAX_VALUE) {
            return minVal;
        }
        return -1;
    }

*/
        // better approach
        int max = 10000;
        int[] count = new int[10000];

        for (int i = 0; i < N; i++) {
            if (arr[i] < 1 && arr[i] > max) {
                return -1;
            }
            count[arr[i]]++;
        }

        for (int i = 0; i < max; i++) {
            if (count[i] == K) {
                return i;
            }
        }
        return -1;
    }
}
