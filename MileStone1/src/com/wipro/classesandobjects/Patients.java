package com.wipro.classesandobjects;

import java.util.*;
class Patient
{
	String name;
	double weight,height;
	Patient(double w,double h)
	{
		weight=w;
		height=h;
	}
	double BMI;
	double BMI()
	{
		BMI=(weight/(height*height))*703;
		return BMI;
	}
}

public class Patients 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String[] s= {"Sam","Sameera","Bunny","Sammy","Sai","Meera","Buddy","Uma","Krishna","Joodi"};
		String ans="";
		for(int i=0;i<10;i++)
		{
			double weight=sc.nextDouble();
			double height=sc.nextDouble();
			Patient p=new Patient(weight,height);
			double a=p.BMI();
			if(p.BMI>25.0)
				ans=ans+s[i]+" "+String.valueOf(a)+"\n";
		}
		System.out.println(ans);
		sc.close();
	}
}
