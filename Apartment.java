package com.company;

import java.io.*;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Apartment{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String st[] = br.readLine().split(" ");

        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        int k = Integer.parseInt(st[2]);

        st = br.readLine().split(" ");
        PriorityQueue<Integer> applicants = new PriorityQueue<>(n);
        for (int i = 0; i < n; i++) {
            applicants.add(Integer.parseInt(st[i]));
        }
        st = br.readLine().split(" ");
        PriorityQueue<Integer> apartments = new PriorityQueue<>(m);
        for (int i = 0; i < m; i++) {
            apartments.add(Integer.parseInt(st[i]));
         }
//        Arrays.sort(arr);
//        Arrays.sort(brr);

        int cnt = 0;
        while (!applicants.isEmpty() && !apartments.isEmpty()) {
            if ((apartments.peek() >= applicants.peek() - k) && (apartments.peek() <= applicants.peek() + k)) {
                applicants.poll();
                apartments.poll();
                cnt++;
            } else if (applicants.peek() + k < apartments.peek()) {
                applicants.poll();
            } else if (applicants.peek() - k > apartments.peek()) {
                apartments.poll();
            }
        }
        System.out.println(cnt);
    }
}



