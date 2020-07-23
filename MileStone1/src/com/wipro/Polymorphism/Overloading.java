package com.wipro.Polymorphism;

public class Overloading {
	
	public static void Overload(int[] input)
	{
		int n=input.length;
		System.out.print("Integer numbers:");
		for(int i=0;i<n;i++)
		{
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}
	public static void Overload(double[] input)
	{
		int n=input.length;
		System.out.print("Double numbers:");
		for(int i=0;i<n;i++)
		{
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}
	public static void Overload(char[] input)
	{
		int n=input.length;
		System.out.print("Character:");
		for(int i=0;i<n;i++)
		{
			System.out.print(input[i]+" ");
		}
	}
	public static void main(String args[])
	{
		int[] integer= {1,2,3,4,5};
		double[] doublenum= {1.0,2.1,3.2,4.3,5.4};
		char[] character= {'a','b','c','d','e'};
		Overload(integer);
		Overload(doublenum);
		Overload(character);
	}

}
