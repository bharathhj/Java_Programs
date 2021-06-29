package com.company;

public class SquareNumbersUsingRecurrsion {

    public void square (int n){
        if(n>0){
            int k = n*n;
            System.out.println(k);
            square(n-1);
        }
    }

    public static void main(String[] args){
        SquareNumbersUsingRecurrsion s = new SquareNumbersUsingRecurrsion();

        s.square(4);
    }
}
