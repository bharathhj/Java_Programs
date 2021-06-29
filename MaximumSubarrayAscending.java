package com.company;

public class MaximumSubarrayAscending {
    public static int maxAscendingSum(int[] nums) {
        int max = 0;
        int curr = 0;
        for(int i = 0 ;i<nums.length;i++){
            //Start with an element in array and if has numbers greater than itself going forward add them to current
            curr=nums[i];
            while(i<nums.length-1 && nums[i] < nums[i+1]){
                i++;
                curr= curr+nums[i];
            }
            //Compare max with curr and update max with maximum value
            max = Math.max(curr, max);
        }

        //Return result
        return max;
    }
    public static void main(String args[]){
        int[] nums = {10,20,30,5,10,50};
        int res = maxAscendingSum(nums);
        System.out.println(res);
    }
}
