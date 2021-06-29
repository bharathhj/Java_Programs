package com.company;

import static java.lang.Character.*;

public class DetectionCapitals {
    public static boolean detectCapitalUse(String word) {
        for (int i=0; i<word.length(); i++)
        {
            if (!Character.isUpperCase(word.charAt(i)))
            {
                return false;
            }
        }
        return true;


    }
    public static void main (String args[]){
        String word = "g";
        boolean b1 = detectCapitalUse(word);
        System.out.println(b1);
    }
}
