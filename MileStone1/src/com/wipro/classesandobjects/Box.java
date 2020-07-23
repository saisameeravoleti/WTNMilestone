package com.wipro.classesandobjects;

import java.util.*;
public class Box
{
	double length,breadth,height;
	void meth(double l,double b,double h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	double volume;
	double display()
	{
		volume=length*breadth*height;
		return volume;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double l,b,h;
		l=sc.nextDouble();
		b=sc.nextDouble();
		h=sc.nextDouble();
		Box obj=new Box();
		obj.meth(l, b, h);
		System.out.println("The volume of the box is:"+(int)obj.display());
		sc.close();
		
	}
}
