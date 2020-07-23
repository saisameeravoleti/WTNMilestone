package com.wipro.Loops;

public class R
{
   public static void main(String args[])
   {
      int x=Integer.parseInt(args[0]);
      int temp=x,rem,i=0;
      while(x!=0)
      {
          rem=x%10;
          i=i*10+rem;
          x=x/10;    
      }
      if(temp==i)
    	  System.out.println(temp+" is a palindrome");
      else
    	  System.out.println(temp+" is not a palindrome");
   }
}