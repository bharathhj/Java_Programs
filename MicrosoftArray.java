package com.company;

public class MicrosoftArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1};
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                int temp = arr[i];
                arr[i] = arr[n];
                arr[n] = temp;
                n++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
