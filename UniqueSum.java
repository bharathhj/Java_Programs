package com.company;
import java.util.*;
public class UniqueSum {
    public static int sumOfUnique(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum=0;
        Set<Integer> dup = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            if(set.add(nums[i])) {
                sum+=nums[i];
            }else {
                dup.add(nums[i]);
            }
        }

        for(int n: dup) {
            sum-=n;
        }

        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        int result = sumOfUnique(arr);
        System.out.println(result);
    }
}
