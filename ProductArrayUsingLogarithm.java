package com.company.Accolite;

public class ProductArrayUsingLogarithm {
    static final double EPS = 1e-9;

    static void productPuzzle(int a[], int n)
    {
        double sum = 0;
        for (int i = 0; i < n; i++)
            sum += Math.log10(a[i]);

        for (int i = 0; i < n; i++)
            System.out.print((int)(EPS + Math.pow(10.00, sum - Math.log10(a[i]))) + " ");
    }
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        int n = arr.length;
        System.out.println("The product array is: ");
        productPuzzle(arr, n);
        System.out.println();
        System.out.println(EPS);

    }
}
