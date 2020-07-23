package com.wipro.Strings;

import java.util.*;
public class StringReverse_1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder(s);
		sb=sb.reverse();
		System.out.println(String.valueOf(sb));
		sc.close();
	
	}

}
