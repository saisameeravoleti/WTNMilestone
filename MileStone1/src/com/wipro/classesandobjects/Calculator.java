package com.wipro.classesandobjects;

import java.util.*;
public class Calculator {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		System.out.println("Math_int="+Calci.powerInt(a, b));
		System.out.println("Math_int="+Calci.powerDouble(c,d));
		sc.close();
	}
}

class Calci
{
	static int powerInt(int num1,int num2)
	{
		return (int)Math.pow(num1, num2);
	}
	static double powerDouble(double num1,double num2)
	{
		return Math.pow(num1, num2);
	}	
}
