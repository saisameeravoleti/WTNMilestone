package com.wipro.Arrays;

import java.util.*;
public class H
{
    public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i,x=0,y=0,sum=0;
        for(i=0;i<n;i++)
        {
              a[i]=sc.nextInt();
              if(a[i]==6)
            	  x=i;
              else if(a[i]==7)
            	  y=i;
        }
        if(x<y)
        {
        	for(i=0;i<n;i++)
        	{
        		if(i<x||i>y)
        			sum=sum+a[i];
            }
        }
        else
        {
        	for(i=0;i<n;i++)
        	{
	          sum=sum+a[i];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}