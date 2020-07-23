package com.wipro.day2;

import java.util.Scanner;

public class C {
	public static int IsEvenOdd(int n)
	{
		if(n%2==0)
			return 2;
		else
			return 1;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=IsEvenOdd(n);
		if(a==2)
			System.out.println(n+" is an even number");
		else
			System.out.println(n+" is a odd number");
		sc.close();
		
	}

}
