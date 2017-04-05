package com.example;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Niharika Rastogi on 05-04-2017.
 */

class TurboSort {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        sc.close();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);

    }
}
