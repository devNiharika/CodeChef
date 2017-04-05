package com.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

class EnormousInputTest {
    public static void main(String[] args) throws IOException
    {
        ArrayList<Long> arr= new ArrayList<>();
        int temp=0;
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();

        for(int i=0;i<n;i++)
            arr.add(sc.nextLong());

        for(long num: arr)
        {
            if(num%k==0)
                temp++;
        }
        System.out.println(temp);
    }
}
