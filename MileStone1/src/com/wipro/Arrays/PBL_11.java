package com.wipro.Arrays;

import java.util.*;
public class PBL_11
{
    public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
              a[i]=sc.nextInt();
         }
         for(int i=0;i<n;i++)
        {
              if(a[i]!=4&&a[i]!=1)
            	  k++;
         }
         if(k==0)
        	 System.out.println("True");
         else
        	 System.out.println("False");
         sc.close();
    }
}