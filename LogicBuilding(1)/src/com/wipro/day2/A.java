package com.wipro.day2;
import java.util.*;
public class A {
	public static String Isnum(int n)
	{
		String ans;
		if(n>0)
			ans="positive";
		else if(n<0)
			ans="negative";
		else
			ans="zero";
		return ans;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a=Isnum(n);
		System.out.println(n+" is "+a);
		sc.close();
		
	}

}

