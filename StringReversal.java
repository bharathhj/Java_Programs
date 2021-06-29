package com.company;

import java.util.Scanner;

public class StringReversal {


    public static void main(String args[]){
        String buffer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        buffer = sc.nextLine();

        StringBuffer actual = new StringBuffer();
        actual.append(buffer);

        actual.reverse();
        System.out.println(actual);
        String data = actual.toString();
        if(data.equals(buffer)){
            System.out.println("Given String is palindrome");
        }else{
            System.out.println("Given String is not palindrome");
        }



    }
}
