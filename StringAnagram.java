package com.company;

import java.util.*;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        String s2;
        s1 = sc.nextLine();
        s2 = sc.nextLine();

        if(s1.equals(s2)){
            System.out.println(true);
        }else if(s1.length()!=s2.length()){
            System.out.println(false);
        }

        char[] s = new char[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            s[i] = s1.charAt(i);
        }

        char[] ss = new char[s2.length()];
        for (int i = 0; i < s2.length(); i++) {
            ss[i] = s2.charAt(i);
        }

        Arrays.sort(s);
        Arrays.sort(ss);

        for(int i=0;i<s.length;i++){
            if(s[i]==ss[i]){
                System.out.println(true);
                break;
            }else{
                System.out.println(false);
                break;
            }
        }

    }
}
