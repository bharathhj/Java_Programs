package com.company;

public class TreeRecurrsion {
    public void square (int n){
        if(n>0){
            square(n-1);
            int k = n*n;
            System.out.println(k);
            square(n-1);
        }
    }

    public static void main(String[] args){
        TreeRecurrsion s = new TreeRecurrsion();

        s.square(4);
    }
}
