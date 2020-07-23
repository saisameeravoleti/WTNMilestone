package com.wipro.day3;

import java.util.Scanner;
public class B {
	
	public static int IsOdd(int n)
	{
		if(n%2!=0)
			return 2;
		else
			return 1;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(IsOdd(n)==2)
			System.out.println(n+" is a odd number");
		else if(IsOdd(n)==1)
			System.out.println(n+" is not an odd number");
		sc.close();
	}

}