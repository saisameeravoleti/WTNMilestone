package com.wipro.Loops;

public class N
{
   public static void main(String args[])
   {
       int x=Integer.parseInt(args[0]);
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
   }
}