package com.company.Accolite;
import java.math.BigInteger;
public class SumOfTwoLarge {
    public static void main(String[] args) {
        String str1 = "3333311111111111";
        String str2 =   "44422222221111";

        BigInteger a= new BigInteger(str1);
        BigInteger b= new BigInteger(str2);
        System.out.println(a.add(b));



    }
}
