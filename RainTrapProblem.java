package com.company.Accolite;

public class RainTrapProblem {
    public static int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int max1 = 0;
        int max2 = 0;
        for(int i=0;i<height.length;i++){
            max1 = Math.max(max1,height[i]);
            left[i] = max1;
        }

        for(int i=height.length-1;i>=0;i--){
            max2 = Math.max(max2,height[i]);
            right[i] = max2;
        }

        int[] water = new int[height.length];

        for(int i=0;i<height.length;i++){
            water[i] = Math.min(left[i],right[i])-height[i];
        }

        int result = 0;
        for(int i : water){
            result = result + i;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int res = trap(arr);
        System.out.println(res);

    }
}
