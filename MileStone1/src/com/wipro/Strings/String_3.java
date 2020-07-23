package com.wipro.Strings;

import java.util.*;
public class String_3 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=s.substring(0,2);
		String str="";
		for(int i=0;i<s.length();i++)
		{
			str=str+s1;
		}
		System.out.println(str);
		sc.close();
	}

}
