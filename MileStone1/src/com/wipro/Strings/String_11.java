package com.wipro.Strings;

import java.util.*;
public class String_11 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		String y=sc.next();
		int m=x.length();
		int n=y.length();
		String s="";
		String s1="";
		for(int i=0;i<m-n;i++)
		{
			String str=x.substring(i,i+n);
			if(str.equals(y)&&i==0)
			{
				s=s+String.valueOf(x.charAt(i+n));
			}
			else if(i!=0&&str.equals(y))
			{
				s=s+String.valueOf(x.charAt(i-1))+String.valueOf(x.charAt(i+n));
			}
			if(i==m-n-1)
			{
				i=i+1;
				s1=x.substring(i,i+n);
				if(s1.equals(y))
					s=s+x.charAt(i-1);
			}
			
		}
		System.out.println(s);
		sc.close();
	}

}
