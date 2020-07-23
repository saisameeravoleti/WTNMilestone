package com.wipro.Loops;

class G
{
    public static void main(String args[])
    {
        String s=args[0];
        char ch=s.charAt(0);
        char temp;
        if(ch>=97&&ch<=122)
        {
        	temp=Character.toUpperCase(ch);
        	System.out.println(ch+"->"+temp);
         }
        else if(ch>=65&&ch<=90)
        {
        	temp=Character.toLowerCase(ch);
        	System.out.println(ch+"->"+temp);
         }
        else
        	System.out.println("Enter a valid Alphabet");
    }
}
