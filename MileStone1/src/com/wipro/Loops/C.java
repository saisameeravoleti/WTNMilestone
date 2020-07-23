package com.wipro.Loops;

public class C
{
    public static void main(String args[])
    {
        if(args.length==0)
            System.out.println("No Values");
        else
        {
            int x=args.length;
            for(int i=0;i<x-1;i++)
            {
                System.out.print(args[i]+",");
            }
            System.out.println(args[x-1]);
        }
    }
}