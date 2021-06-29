package com.company;

public class TwoArray {


    public static void main(String args[]){
        int k=1;
        int n=3;
        int m=3;
        int count =0;
        int[] A = {1, 2 , 3};
        int[] B = {1, 2 , 3};
        int sum1=0;
        int sum2=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                if(A[i]+B[j]>=k){
                  count++;
                }
            }
            sum1+=A[i];
            sum1+=B[i];
        }

        if(sum1>k){
            count++;
        }
        if(sum2>k){
            count++;
        }

        System.out.println(count);

    }
}
