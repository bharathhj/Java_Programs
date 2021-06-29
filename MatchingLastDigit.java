package com.company;

public class MatchingLastDigit {
    public static void main(String args[]){
        int n =25;
        int k = n%10;
        int m = (n*n)%10;
        if(k==m){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
