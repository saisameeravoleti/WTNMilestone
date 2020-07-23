package com.wipro.Strings;

import java.util.*;
public class StringConcat_2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] str=s.split(",",1000);
		String s1="";
		for(int i=0;i<str.length;i++)
		{
			if(i!=str.length-1)
				s1=s1+str[i]+" ";
			else
				s1=s1+str[i];
		}
		System.out.println(s1.toLowerCase());
		sc.close();
	}

}
