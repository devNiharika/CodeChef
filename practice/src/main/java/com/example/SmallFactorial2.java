package com.example;
/**
 * Created by Niharika Rastogi on 03-04-2017.
 */

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;


class SmallFactorial2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < n; i++) {
            System.out.println(fact(arr[i]));
        }

    }

    private static BigInteger fact(int n) {

        BigInteger fact=BigInteger.ONE;
        for(int i=n;i>0;i--){
            fact=fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

}
