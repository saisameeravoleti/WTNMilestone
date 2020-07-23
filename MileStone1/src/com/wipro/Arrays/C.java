package com.wipro.Arrays;

import java.util.*;
public class C
{
    public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int k=-1,i;
        for(i=0;i<n;i++)
        {
              a[i]=sc.nextInt();
        }
        int temp=sc.nextInt();
        for(i=0;i<n;i++)
        {
              if(a[i]==temp)
                   k=i;
         }
         if(k==-1)
             System.out.println("-1");
         else
             System.out.println(k);
         sc.close();
    }
}