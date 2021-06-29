package com.company;

import sun.awt.image.ImageWatched;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

public class CrownNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        int temp;
        n = sc.nextInt();
        LinkedList<Integer> clist = new LinkedList<>();
        for(int i=0;i<n;i++){
            temp=sc.nextInt();
            clist.add(temp);
        }

        if(clist.get(1)>clist.get(2)) {
            System.out.println(clist.get(1));
        }else{
            for (int i = 1; i < n - 1; i++) {
                int cur = clist.get(i);
                int pre = clist.get(i - 1);
                int next = clist.get(i + 1);
                if (cur > pre && cur > next) {
                    System.out.println(cur);
                    break;
                }
            }

        }

    }
}
