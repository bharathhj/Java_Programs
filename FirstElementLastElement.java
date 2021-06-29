package com.company;

public class FirstElementLastElement {
    public static int[] searchRange(int[] nums, int target) {
        int x = bsearchFirst(nums, target);
        int y = bsearchLast(nums, target);
        int res[] = {x, y};
        return res;
    }

    private static int bsearchFirst(int[] nums, int target) {

        int start = 0, end = nums.length - 1, ans = -1;

        if (nums.length == 0)
            return ans;

        if (nums[start] == target)
            return start;

        while (start <= end) {

            if (nums[start] == target)
                return start;

            if (nums[end] < target)
                return ans;

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return ans;
    }

    private static int bsearchLast(int[] nums, int target) {

        int start = 0, end = nums.length - 1, ans = -1;

        if (nums.length == 0)
            return ans;

        if (nums[end] == target)
            return end;

        while (start <= end) {

            if (nums[end] == target)
                return end;

            if (nums[start] > target)
                return ans;

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return ans;

    }


    public static void main(String args[]){
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] res = new int[nums.length];
        res = searchRange(nums,target);
        for(int i = 0;i< nums.length;i++){
        System.out.println(res[i]);
        }
    }
}
