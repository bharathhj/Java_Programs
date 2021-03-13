package com.company;

import java.util.Scanner;

public class Prime {

    int temp=0;


    // Prime Function

    public Prime(int n){
        for (int i=2; i<n-1;i++){
            if((n%i)==0){
                temp=temp+1;
            }
        }

        if(temp==0){
            System.out.println(n + " is prime number.");
        }else
        {
            System.out.println(n + " is not prime number.");
        }
    }


    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    int n;

    System.out.println("Enter the valid number :");
    n = sc.nextInt();

    // Function Call
        
    Prime p = new Prime(n);

    }
}
