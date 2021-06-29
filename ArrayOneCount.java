package com.company.Accolite;

public class ArrayOneCount {
    public static void main(String args[]){
        int[] arr = {0, 1, 1, 0};
        if(arr.length<3){
            System.out.println("Invalid Input");
        }
        int prevar;
        int nextvar;
        int curr;
        int count = 0;
        for(int i = 1;i<arr.length-1;i++){
            prevar = arr[i-1];
            curr = arr[i];
            nextvar = arr[i+1];

            if(prevar==0 && curr==1 && nextvar==0){
                count++;
            }
        }
        System.out.println(count);

    }
}
