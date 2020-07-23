package com.wipro.Arrays;

import java.util.*;
public class PBL_10
{
    public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
              a[i]=sc.nextInt();
         }
         for(int i=0;i<n;i++)
         {
              if(a[i]%2==0)
              {
            	  b[k]=a[i];
                    k++;
              }
         }
         for(int i=0;i<n;i++)
         {
              if(a[i]%2!=0)
              {
            	  b[k]=a[i];
                    k++;
              }
         }
         for(int i=0;i<n;i++)
         {
              System.out.print(b[i]+" ");
         }
         sc.close();
    }
}