package com.company;

public class LeaderArray {
    public static void main(String args[]){
        int[] arr = {16, 17, 4, 3, 5, 2};
        int count = 0;
        int n=arr.length;
        int k = 0;
        int j =0;
        for(int i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                 break;
                }
            }
            if(j==n){
                count = count+arr[i];
            }
        }

        System.out.println(count);

    }
}
