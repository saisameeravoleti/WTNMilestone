package com.wipro.Loops;

public class E
{
    public static void main(String args[])
    {
        String s=args[0];
        char temp=s.charAt(0);
        if(temp>=48&&temp<=57)
            System.out.println(temp+" is a number");
        else if(temp>='a'&&temp<='z'||temp>='A'&&temp<='Z')
            System.out.println(temp+" is an alphabet");
        else
            System.out.println(temp+" is a special character");
    }
}