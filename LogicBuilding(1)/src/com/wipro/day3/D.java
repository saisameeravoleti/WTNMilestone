package com.wipro.day3;

import java.util.*;
public class D {
	public static int IsSecondLast(int n)
	{
		int temp=-1;
		if(n<10&&n>-10)
			temp=-1;
		else
		{
			int x=Math.abs(n);
			int rem=x%100;
			temp=rem/10;
		}
		return temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(IsSecondLast(n));
		sc.close();

	}

}
