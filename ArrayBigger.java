package com.company;
import java.util.*;
public class ArrayBigger {
    public static void main(String args[]){
        int[]  cakes = {44, 53, 31, 27, 77, 60, 66, 77, 26, 36};

        int n = cakes.length-1;
        int max = 0;
        int k = 0;

        for(int j=0;j<cakes.length;j++){
            if(cakes[j]>max){
                max = cakes[j];
                k = j;
            }
        }

        int count = 0;


        for(int i=0;i<cakes.length;i++){
            if(cakes[k]==cakes[i]){
                count++;
            }
        }

        System.out.println(count);
    }

}
