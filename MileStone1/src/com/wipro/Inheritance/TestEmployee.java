package com.wipro.Inheritance;

import java.util.*;

class Employee extends Person
{
	String name;
	double annual_salary;
	int year,insurance_number;
	Employee(String name,double annual_salary,int year,int insurance_number)
	{
		super(name);
		this.annual_salary=annual_salary;
		this.year=year;
		this.insurance_number=insurance_number;
	}
	double salary1()
	{
		return annual_salary;
	}
	int year1()
	{
		return year;
	}
	int insurance()
	{
		return insurance_number;
	}
}

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		double annual_salary=sc.nextDouble();
		int year=sc.nextInt();
		int insurance_number=sc.nextInt();
		Employee e=new Employee(name,annual_salary,year,insurance_number);
		System.out.println(e.name1()+" "+e.salary1()+" "+e.year1()+" "+e.insurance());
		sc.close();
	}

}
