package com.company;

import java.util.*;
class TestClass {
        public static void main(String args[]){
            int t;
            Scanner sc = new Scanner(System.in);
            t = sc.nextInt();
            while(t>0) {
                int n;
                n = sc.nextInt();
                int[] arr = new int[n];
                for(int i=0;i<arr.length;i++){
                    arr[i] = sc.nextInt();
                }
                int evenSize = 0;
                int oddSize = 0;

                for (int i = 0; i < n; i++) {
                    if (arr[i] % 2 == 0) {
                        evenSize++;
                    } else {
                        oddSize++;
                    }
                }

                int[] even = new int[evenSize];
                int[] odd = new int[oddSize];

                int j = 0;
                int k = 0;

                for (int i = 0; i < n; i++) {
                    if (arr[i] % 2 == 0) {
                        even[j++] = arr[i];
                    } else {
                        odd[k++] = arr[i];
                    }
                }


                int divFive = 0;
                int nondivFive = 0;

                for (k = 0; k < evenSize; k++) {
                    if (even[k] % 5 == 0) {
                        divFive++;
                    } else {
                        nondivFive++;
                    }
                }

                int[] fives = new int[divFive];
                int[] nonFives = new int[nondivFive];
                int x = 0;
                int y = 0;
                for (int i = 0; i < evenSize; i++) {
                    if (even[i] % 5 == 0) {
                        fives[x++] = even[i];
                    } else {
                        nonFives[y++] = even[i];
                    }
                }


                Arrays.sort(fives);

                int q = divFive;
                int[] desFive = new int[fives.length];
                for (int m = 0; m <= q; m++) {
                    desFive[m] = fives[q - 1];
                    q = q - 1;
                }

                int w = nondivFive;
                int[] desnonFive = new int[nonFives.length];
                for (int e = 0; e <= w; e++) {
                    desnonFive[w - 1] = nonFives[e];
                    w = w - 1;
                }

                int[] result = new int[n];

                for (int i = 0; i < desFive.length; i++) {
                    System.out.print(desFive[i] + " ");
                }
                for (int i = 0; i < desnonFive.length; i++) {
                    System.out.print(desnonFive[i] + " ");
                }
                for (int i = 0; i < odd.length; i++) {
                    System.out.print(odd[i] + " ");
                }
                System.out.println();
                t--;

            }
        }
    }
