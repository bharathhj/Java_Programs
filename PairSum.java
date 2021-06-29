package com.company;

import java.util.HashMap;

public class PairSum { static void printpairs(int arr[], int sum)
{
    HashMap<Integer,Integer> s = new HashMap<>();
    for (int i=0;i<arr.length;i++){
        s.put(arr[i],i);
    }
    for (int i = 0; i < arr.length; ++i)
    {
        int temp = sum - arr[i];

        // checking for condition
        if (s.containsKey(temp)) {
            System.out.println(s.get(arr[i])
                    + " " + s.get(temp) );
            break;
        }
    }
}

    // Driver Code
    public static void main(String[] args)
    {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int n = 16;
        printpairs(A, n);
    }
}
