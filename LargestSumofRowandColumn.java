package com.company;

import java.util.Scanner;

public class LargestSumofRowandColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        r = sc.nextInt();
        int c;
        c = sc.nextInt();

        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        int rMax=0;
        int cMax=0;
        for(int i=0;i<r;i++){
            int rSum=0;
            int cSum=0;
            for(int j=0;j<c;j++){
                rSum=rSum+arr[i][j];
                rMax=Math.max(rMax,rSum);

                cSum=cSum+arr[j][i];
                cMax=Math.max(cMax,cSum);
            }
        }

        int result = rMax+cMax;
        System.out.println(result);

    }
}
