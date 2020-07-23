package com.wipro.classesandobjects;

import java.util.*;
class RandomHelper
{
	static int randint(int m,int n)
	{
		int ran = (int)(Math.random()*(m - n))+n;
		return ran;
	}
	static double randdouble(double a,double b)
	{
		double ran=(Math.random()*(b-a))+a;
		return ran;
	}
}

public class Random 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int m,n;
		double a,b;
		m=sc.nextInt();
		n=sc.nextInt();
		a=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println(RandomHelper.randint(m, n));
		System.out.println(RandomHelper.randdouble(a, b));
		sc.close();
	}
}
