package com.company;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    res[0] = i + 1;
                    res[1] = j + 1;
                }
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int[] numbers={2, 7, 11, 15};
        int target= 9;
        int[] ret =new int[2] ;
        ret = twoSum(numbers,target);
        System.out.println(ret[0] + " " + ret[1]);

    }
}


