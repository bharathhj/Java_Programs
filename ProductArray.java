package com.company.Accolite;

public class ProductArray {
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int prod = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    prod = prod * arr[j];
                }
            }
            result[i] = prod;
        }
        for (int i : result) {
            System.out.println(i);
        }
    }
}
