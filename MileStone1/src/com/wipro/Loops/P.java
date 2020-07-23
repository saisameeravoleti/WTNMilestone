package com.wipro.Loops;

public class P
{
    public static void main(String args[])
    {
        int x=Integer.parseInt(args[0]);
        int i,j;
        for(i=0;i<x;i++)
        {
            for(j=0;j<=i;j++)
            {
            	System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}