package com.company;

import java.util.Scanner;

public class PowerOfTwo {


    public static boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n % 2 == 0) {
            n = n / 2;
            if (n == 1) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        boolean b = isPowerOfTwo(n);

        System.out.println(b);
    }
}

