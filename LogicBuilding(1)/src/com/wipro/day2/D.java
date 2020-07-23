package com.wipro.day2;

import java.util.Scanner;

public class D {
	public static int NumIsEvenOdd(int m,int n)
	{
		int sum=m+n;
		if(sum%2==0)
			return 2;
		else
			return 1;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a=NumIsEvenOdd(m,n);
		if(a==2)
			System.out.println("Addition of "+m+" and "+n+" is even");
		else
			System.out.println("Addition of "+m+" and "+n+" is odd");
		sc.close();
	}

}
