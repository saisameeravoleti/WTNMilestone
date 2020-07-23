package com.wipro.Strings;

import java.util.*;
public class String_4 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		String str="";
		if(n%2==0)
			str=s.substring(0,n/2);
		else
			str="null";
		System.out.println(str);
		sc.close();
	}

}
