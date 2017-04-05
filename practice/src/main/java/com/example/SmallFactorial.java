package com.example;
/**
 * Created by Niharika Rastogi on 03-04-2017.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class SmallFactorial {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(fact(arr[i]));
        }

    }

    private static String fact(int n) {
        int output = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int num = n;
        while (n != 0) {
            arrayList.add(n % 10);
            n /= 10;
        }
        for (int i = num - 1; i > 1; i--) {
            int mult = 0;
            for (int j = 0; j < arrayList.size(); j++) {
                mult = arrayList.get(j) * i + mult;
                arrayList.set(j, mult % 10);
                mult /= 10;
            }
            while (mult != 0) {
                arrayList.add(mult % 10);
                mult /= 10;
            }
        }
        Collections.reverse(arrayList);
        String res = "";
        for (int a : arrayList) {
            res += a;
        }
        return res;
    }

}
