package com.wipro.Loops;

public class Q
{
   public static void main(String args[])
   {
       int x=Integer.parseInt(args[0]);
       int rem,count=0;
       while(x!=0)
       {
    	   rem=x%10;
    	   count=count*10+rem;
    	   x=x/10;
        }
        System.out.println(count);
   }
}