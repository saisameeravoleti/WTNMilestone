package com.wipro.Arrays;

import java.util.*;
public class A
{
    public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        float average;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
              a[i]=sc.nextInt();
              sum=sum+a[i];
        }
        average=(float)sum/n;
        System.out.println("Sum="+sum+","+"Average="+average);
        sc.close();
    }
}