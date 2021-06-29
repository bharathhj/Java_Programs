package com.company;
import java.util.Arrays;
public class HeightChecker {
    public static void main(String args[]){
        int[] heights = {1,1,4,2,1,3};
        int[] res= new int[heights.length];
        for(int j = 0;j<res.length;j++){
            res[j]=heights[j];
        }

        Arrays.sort(res);

        int count = 0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=res[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
