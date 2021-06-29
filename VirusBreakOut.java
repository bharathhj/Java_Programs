package com.company;
/*
 * Enter your code here. Read input from STDIN. Print your output to STDOUT.
 * Your class should be named CandidateCode.
 */

import java.io.*;
import java.util.*;
public class VirusBreakOut{

    public static boolean issubsequence(String str1,String str2,int m,int n){
        int j=0;
        for (int i=0;i<n && j<m;i++){
            if (str1.charAt(j)==str2.charAt(i)){
                j++;
            }
        }
        return j==m;
    }

    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String originalString=br.readLine();
        int n=Integer.parseInt(br.readLine());

        for (int i=0;i<n;i++){
            String buy=br.readLine();
            boolean sol=issubsequence(buy,originalString,buy.length(),originalString.length());
            if (sol){
                System.out.println("POSITIVE");
            }else {
                System.out.println("NEGATIVE");
            }
        }
        
    }
}
