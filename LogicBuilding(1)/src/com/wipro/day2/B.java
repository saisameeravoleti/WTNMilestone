package com.wipro.day2;

import java.util.*;
public class B
{
	public static int IsGreater(int m,int n)
	{
		if(m>n)
			return m;
		else if(m<n)
			return n;
		else
			return 0;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a=IsGreater(m,n);
		if(a==0)
			System.out.println("Both numbers are equal");
		else
			System.out.println(a+" is the greater");
		sc.close();
		
	}

}

