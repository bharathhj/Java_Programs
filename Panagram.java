package com.company;

public class Panagram {
    public static void main(String args[]){
        String s = "The quick brown fox jumps over the lazy dog";
        boolean[] list = new boolean[26];

        int index = 0;
        int flag = 1;
        for (int i = 0; i < s.length(); i++) {
            if ( s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                index = s.charAt(i) - 'A';
            }else if( s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                index = s.charAt(i) - 'a';
            }
            list[index] = true;
        }

        for (int i = 0; i <= 25; i++) {
            if (list[i] == false)
                flag = 0;
        }

        if(flag==1){
            System.out.println("Panagram");
        }else{
            System.out.println("Not a Panagram");
        }


    }
}
