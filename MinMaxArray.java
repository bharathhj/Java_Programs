package com.company;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] a1 = {9,16,12,5,15};
        int[] a2 = {14,7,22,5,32,77};
        int k = 9;
        int count1 = 0;
        int count2 = 0;
        for(int i : a1){
            if(i>k){
                count1++;
            }
        }
        for(int i : a2){
            if(i<k){
                count2++;
            }
        }

        if(count1>count2){
            System.out.println(count1);
        }else {
            System.out.println(count2);
        }
    }
}
