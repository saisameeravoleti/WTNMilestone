package com.wipro.Loops;

public class A1
{
    public static void main(String args[])
   {
         int a=Integer.parseInt(args[0]);
         int b=Integer.parseInt(args[1]);
         int x=0,y=0;
         x=a%10;
         y=b%10;
         if(x==y)
        	 System.out.println("True");
         else
        	 System.out.println("False");
    }
}