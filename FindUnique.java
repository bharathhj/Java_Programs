package com.company;

public class FindUnique {
    public static void main(String[] args){
        int[] arr = {100 , 101, 102, 100, 102};
        int n = arr.length;
        if (n == 2){
            System.out.println(arr[0]);
        }

        for(int i =0; i<n ;i++){
            int temp = arr[i];
            int count = 0;
            for(int j=i+1;j<n;j++){
                if(temp==arr[j]){
                    count++;
                }
            }
            if(count==0){
                System.out.println(arr[i]);
                break;
            }
        }


    }
}
