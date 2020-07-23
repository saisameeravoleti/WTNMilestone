package com.wipro.Strings;

import java.util.*;
public class String_6 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int m=a.length();
		int n=b.length();
		String s="";
		if(m>n)
			s=s+b+a+b;
		else
			s=s+a+b+a;
		System.out.println(s);
		sc.close();
	}

}
