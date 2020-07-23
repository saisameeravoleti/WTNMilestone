package com.wipro.Strings;

import java.util.*;
public class String_10 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		int len=s.length();
		String s1=s.substring(len-n,len);
		String str="";
		for(int i=0;i<n;i++)
		{
			str=str+s1;
		}
		System.out.println(str);
		sc.close();
	}

}
