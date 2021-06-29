package com.company.Accolite;

import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] num = {1, 9, 7, 3, 5, 3 ,19 ,3, 5, 4, 95, 384, 54, 100};
        Arrays.sort(num);
        System.out.println(num[num.length-2]);
    }
}
