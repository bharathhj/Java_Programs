package com.company;
import java.util.*;

public class UniquAlphabets {
    public static void main(String args[]){
        String s = "man";

        //Creating HashSet and adding elements
        HashSet<Integer> set=new HashSet();

        for(int i=0;i<s.length();i++){
            int var = s.charAt(i);
            set.add(var);
        }

        System.out.println(set.size());
    }

}
