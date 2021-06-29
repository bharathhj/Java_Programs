package com.company;

import java.util.HashSet;
public class Distinct {
    public static int countDistinct(int arr[], int n){
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }

        return hs.size();

    }

    public static void main(String args[]){
        int arr[] = {1, 2, 2, 3, 5, 6, 5, 4};

        System.out.println(countDistinct(arr,arr.length));
    }
}
