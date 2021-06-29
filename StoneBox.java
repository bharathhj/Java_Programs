package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class StoneBox{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int m;
        m = sc.nextInt();
        int[] A = new int[n];
        for(int x = 0; x<n; x++){
            A[x]=sc.nextInt();
        }
        int[] B = new int[m];
        for(int y = 0; y<n; y++){
            B[y]=sc.nextInt();
        }
        int i=0,j=0;
        int count = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(A[i]*2>=B[j]){
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}


