package com.wipro.Strings;

import java.util.*;
public class String_7 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=str.length();
		String s="";
		if(n<2)
		{
			if(n==1&&str.equals("x"))
				s="";
		    else
		      s="";
		}
		else
		{
		    if(str.charAt(0)=='x'&&str.charAt(n-1)=='x')
		      s=str.substring(1,n-1);
		    else if(str.charAt(0)=='x')
		      s=str.substring(1,n);
		    else if(str.charAt(n-1)=='x')
		      s=str.substring(0,n-1);
		    else
		      s=str;
		}
		System.out.println(s);
		sc.close();
	}
}
