package com.sagar;

// https://leetcode.com/problems/first-bad-version/
// 278. First Bad Version

public class First_Bad_version {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    /*
    private static int firstBadVersion(int n){

        // bruteforce
        int i = 1;
        while (i <= n){
            if (isBadVersion(i)){
                return i;
            }
            i++;
        }
        return -1;
    }

       // binary search
       int start = 1;
       int end = n;
        while (start < end){
            int mid = start + (end - start)/2;

            if (isBadVersion(mid)){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    */
}
