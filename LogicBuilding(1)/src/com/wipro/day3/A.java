package com.wipro.day3;

import java.util.*;
public class A {
	
	public static int IsEven(int n)
	{
		if(n%2==0)
			return 2;
		else
			return 1;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(IsEven(n)==2)
			System.out.println(n+" is a even number");
		else if(IsEven(n)==1)
			System.out.println(n+" is not an even number");
		sc.close();
	}

}
