package com.wipro.day3;

import java.util.Scanner;
public class E {
	public static int IsAddLast(int m,int n)
	{
		int temp=Math.abs((m%10))+Math.abs((n%10));
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println("The sum of last two digits is "+IsAddLast(m,n));
		sc.close();

	}

}
