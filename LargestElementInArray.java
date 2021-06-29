package com.company;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {23, 45, 82, 27, 66, 12, 78, 13, 71, 86};
        int maxi = 0;
        int index = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>maxi){
                maxi = arr[i];
                index = i;
            }
        }
        System.out.println(maxi + " " + index);
    }
}
