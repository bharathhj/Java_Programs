package com.company;
import java.util.*;
public class PeakIndex {
    public static int peakIndexInMountainArray(int[] arr) {

        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max = arr[i];
            }
        }

        int low = 0;
        int high = arr.length-1;
        Arrays.sort(arr);
        while (low <= high){
            int mid = low + high / 2;
            if(max==arr[mid]){
                return mid;
            }else if(max < arr[mid]){
                high = mid-1;
            }else if(max > arr[mid]){
                low = mid +1;
            }
        }
        return -1;
    }


    public static void main(String args[]) {

        int[] arr = {3, 4, 5, 1};
        int res = peakIndexInMountainArray(arr);
        System.out.println(res);

    }
}
