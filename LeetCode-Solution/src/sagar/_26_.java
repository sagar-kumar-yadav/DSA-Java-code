package sagar;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _26_ {
    public static void main(String[] args) {
//        int[] nums = {1,1,2};
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicates1(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }


    public static int removeDuplicates1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int n = set.size();
        int j = 0;
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int x = iterator.next();
            nums[j++] = x;
        }
        return n;
    }
}
