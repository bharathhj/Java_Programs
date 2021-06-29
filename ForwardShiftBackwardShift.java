package com.company;

public class ForwardShiftBackwardShift {

    public static void main(String args[]){
        String s = "mama";

        String s1 = s.substring(1, s.length()) + s.charAt(0);

        String s2 = s.charAt(s.length()-1) + s.substring(0,s.length()-1);

        System.out.println(s1);
        System.out.println(s2);
        if(s1.equals(s2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
}
