package com.company;

import java.util.Scanner;

public class Goodbye {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String i1; //goby
        String i2; //ode
        int i; //index value
        i1 = sc.nextLine();
        i2 = sc.nextLine();
        i = sc.nextInt();

        String result;
        result = i1.substring(0,i)+i2.substring(0,i)+i1.substring(i,i1.length())+i2.substring(i,i2.length());
        System.out.println(result);
    }
}
