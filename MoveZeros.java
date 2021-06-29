package com.company;

public class MoveZeros {
    public static int[] moveZeroes(int[] nums) {

        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            //Check Fornonzero element in array greater than length 1
            if (nums[i] != 0 && nums.length > 1) {
                //If nonzeroIndex and i are no need for the operation
                if (nonZeroIndex != i) {
                    nums[nonZeroIndex] = nums[i];
                    nums[i] = 0;
                }
                //Increment nonZeroIndex
                nonZeroIndex++;
            }
        }
        return nums;

    }
    public static void main(String args[]){
        int[] nums = {0,1,0,3,12};
        int[] res = moveZeroes(nums);
        for(int i = 0;i<nums.length;i++) {
            System.out.print(res[i]);
        }
    }
}
