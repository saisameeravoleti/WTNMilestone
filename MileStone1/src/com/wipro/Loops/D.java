package com.wipro.Loops;

public class D
{
    public static void main(String args[])
    {
        String s=args[0];
        String s1=args[1];
        char a=s.charAt(0);
        char b=s1.charAt(0);
        if(a<b)
            System.out.println(a+","+b);
        else
            System.out.println(b+","+a);
    }
}