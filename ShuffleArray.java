package com.company;

import java.util.Arrays;

public class ShuffleArray {
    public static int[] shuffleArray(int[] nums){
        int[] subArr1 = new int[nums.length];
        subArr1 = Arrays.copyOfRange(nums, 0 ,nums.length/2);
        int[] subArr2 = new int[nums.length];
        subArr2 = Arrays.copyOfRange(nums,  nums.length/2, nums.length);
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length/2;i++){
                result[2*i] = subArr1[i];
                result[2*i+1] = subArr2[i];
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums = {2, 5, 1, 3, 4, 7};
        int[] res = shuffleArray(nums);
        for(int i =0;i < res.length;i++){
        System.out.println(res[i]);
        }
    }
}
