package com.wipro.Strings;

import java.util.*;
public class String_5 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		String str=s.substring(1,n-1);
		System.out.println(str);
		sc.close();
	}

}
