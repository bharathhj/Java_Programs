package com.company;

import java.util.Scanner;

public class CountPrimes {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n==0||n==1){
            System.out.println(0);
        }

        int primes=0;
        int count=0;
        for(int i=2;i<n;i++){
            primes=0;
            for(int j=2;j<n;j++) {
                if (i%j==0) {
                    primes++;
                }
            }
            if(primes==1){
                count++;
            }
        }
        System.out.println(count);
    }

}
