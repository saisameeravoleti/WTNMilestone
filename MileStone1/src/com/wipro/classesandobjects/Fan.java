package com.wipro.classesandobjects;

import java.util.*;
class Sample
{
	public static int SLOW=1,MEDIUM=2,FAST=3;
	private int speed=SLOW;
	private boolean on=false;
	private double radius=5;
	private String color="red";
	Sample(){}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setRadius(int radius)
	{
		this.radius=radius;
	}
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public void turnOn()
	{
		on=true;
	}
	public void turnOff()
	{
		on=false;
	}
	boolean isOn()
	{
		return on;
	}
	int getSpeed()
	{
		return speed;
	}
	double getRadius()
	{
		return radius;
	}
	String getColor()
	{
		return color;
	}
	public String toString()
	{
		String str="speed:"+speed+"\n"+"color:"+color+"\n"+"radius:"+radius;
		if(isOn())
			str=str+"\n"+"fan is on";
		else
			str=str+"\n"+"fan is off";
		return str;
	}
}

public class Fan 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Sample obj=new Sample();
		System.out.println(obj.toString());
		System.out.println();

		Sample obj1=new Sample();
		obj1.setColor("Blue");
		obj1.setRadius(10);
		obj1.setSpeed(150);
		obj1.turnOn();
		System.out.println(obj1.toString());
		
		sc.close();
	}
	
}