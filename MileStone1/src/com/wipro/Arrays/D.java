package com.wipro.Arrays;

import java.util.*;
public class D
{
    public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
              a[i]=sc.nextInt();
              char c=(char)a[i]; 
              System.out.println(a[i]+"="+c);
        }
        sc.close();
    }
}