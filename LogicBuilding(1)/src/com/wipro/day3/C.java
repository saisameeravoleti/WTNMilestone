package com.wipro.day3;

import java.util.*;
public class C {
	
	public static int IsLast(int n)
	{
		int x=Math.abs(n);
		int rem=x%10;
		return rem;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("The last digit in the given number "+n+" is "+IsLast(n));
		sc.close();

	}

}
