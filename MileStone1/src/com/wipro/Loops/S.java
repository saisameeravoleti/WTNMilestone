package com.wipro.Loops;

public class S
{
    public static void main(String args[])
    {
        int c=0,i=1;
        String s="";
        while(c<5)
        {
        	if(i%2==0&&i%3==0&&i%5==0)
        	{
        		c++;
        		s=s+i+" ";
        	}
            i++;
        }
        System.out.println(s);
     }
}