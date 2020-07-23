package com.wipro.Arrays;

import java.util.*;
public class E
{
    public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
              a[i]=sc.nextInt();
         }
         int l1=a[0],l2=a[1],temp,i,s1=a[0],s2=a[1];
         if(l1<l2)
         {
               temp=l1;
               l1=l2;
               l2=temp;
         }
         if(s1>s2)
         {
               temp=s1;
               s1=s2;
               s2=temp;
          }
          for(i=2;i<a.length;i++)
          {
               if(a[i]>l1)
               {
            	   l2=l1;
            	   l1=a[i];
               }
               else if(a[i]>l2&&a[i]!=l1)
               {
            	   l2=a[i];
               }
               if(a[i]<s1)
               {
            	   s2=s1;
            	   s1=a[i];
               }
               else if(a[i]<s2&&a[i]!=s1)
               {
            	   s2=a[i];
               }
         }
         System.out.println("First largest="+l1+" and second largest="+l2);
         System.out.println("First smallest="+s1+" and second smallest="+s2);
         sc.close();
    }
}