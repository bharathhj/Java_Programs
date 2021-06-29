package com.company;

import java.util.Scanner;

public class JarCandy {
    public static void main (String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Jar Size");
        n = sc.nextInt();
        if(n==0){
            System.out.println("INVALID INPUT");
        }
        int k;
        System.out.println("Enter the minimum constraint");
        k = sc.nextInt();
        int s;
        System.out.println("Enter the number of candies to be sold");
        s = sc.nextInt();

        int res = 0;
        res = n-s;
        if(res<k){
            n=10-res;
            System.out.println("Total Candies in JAR"+" "+n);
        }else{
            System.out.println("Candies Left"+" " +res);
        }
    }
}
