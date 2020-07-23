package com.wipro.Loops;

import java.util.*;
class L
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
       if(x==0||x==1)
    	   System.out.println(x+" is neither prime nor composite number");
       else
       {
    	   int i,count=0;
    	   for(i=1;i<=x;i++)
    	   {
    		   if(x%i==0)
    			   count++;
    	   }
    	   if(count==2)
    		   System.out.println(x+ " is a prime number");
    	   else
    		   System.out.println(x+" is a composite number");
       }
       sc.close();
   }
}