package com.company;

public class AddingNextASCIvalue {
    public static void main(String args[]){
        String s = "Code Bashers";
        int key = 1;
        char[] res = new char[s.length()];
        for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' ') continue;
                res[i] = (char) (s.charAt(i) + 1);
        }

        for(int i=0;i<s.length();i++){
            System.out.println(res[i]);
        }

    }
}
