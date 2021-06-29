package com.company;

import java.util.Arrays;

public class RunningSum {
    public static int[] runningsum(int[] nums){
        int runningSum = 0;
        int[] runningSums = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            runningSum = runningSum + nums[i];
            runningSums[i] = runningSum;
        }
        return  runningSums;
    }

    public static void main(String[] args){
        int[] nums= {1 , 2, 3, 4};
        System.out.println(Arrays.toString(RunningSum.runningsum(nums)));
    }
}
