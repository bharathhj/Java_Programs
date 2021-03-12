package com.company;

import java.io.*;

public class Crc {
    static int[] divide(int div[], int divisor[], int rem[]){
        int cur=0;
        while (true){
            for(int i=0;i<divisor.length;i++)
                rem[cur+i]=(rem[cur+i]^divisor[i]);

            while(rem[cur]==0 && cur!= rem.length-1)
                cur++;

            if ((rem.length-cur)<divisor.length)
                break;
        }
        return rem;
    }


    public static void main(String[] args)throws IOException{

        int [] data;
        int [] div;
        int [] crc;
        int [] rem;
        int [] divisor;

        int data_bits,divisor_bits,tot_length;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of data_bits");
        data_bits = Integer.parseInt(br.readLine());
        data = new int[data_bits];
        System.out.println("Enter the Data:");
        for(int i=0;i<data_bits;i++)
            data[i]= Integer.parseInt(br.readLine());

        System.out.println("Enter the number of divisor_bits");
        divisor_bits = Integer.parseInt(br.readLine());
        divisor = new int[divisor_bits];
        System.out.println("Enter the Divisor:");
        for(int i = 0; i<divisor_bits; i++)
            divisor[i]= Integer.parseInt(br.readLine());

        tot_length = divisor_bits+data_bits-1;
        div = new int[tot_length];
        rem = new int[tot_length];
        crc = new int[tot_length];

        for(int i=0;i<data.length;i++)
            div[i]=data[i];

        System.out.println("Dividend after appending 0's:");
        for(int i=0;i<div.length;i++)
            System.out.println(div[i]);

        for(int j=0;j<div.length;j++)
            rem[j]=div[j];

        rem=divide(div,divisor,rem);

        for(int i=0;i<div.length;i++)
        {
            crc[i]=(div[i]^rem[i]);
        }

        System.out.println("The Crc code is : ");
        for(int i=0;i<crc.length;i++)
            System.out.println(crc[i]);

        System.out.println("Enter the crc "+tot_length+" code :");
        for(int i=0;i<crc.length;i++)
            crc[i]=Integer.parseInt(br.readLine());

        for(int j=0;j<crc.length;j++)
            rem[j]=crc[j];

        rem=divide(crc,divisor,rem);

        for(int i=0;i<rem.length;i++)
        {
            if(rem[i]!= 0)
            {
                System.out.println("Error");
                break;
            }
            if (i==(rem.length) - 1)
            {
                System.out.println("No Error");
            }
        }
    }
}
