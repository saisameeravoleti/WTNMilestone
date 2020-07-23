package com.wipro.Inheritance;

class Student extends Person
{
	int id;
	Student(String name,int id)
	{
		super(name);
		this.id=id;
	}
	int getId()
	{
		return id;
	}
}

class Teacher extends Person
{
	String subject;
	int salary;
	Teacher(String name,int salary,String subject)
	{
		super(name);
		this.salary=salary;
		this.subject=subject;
	}
	int getSalary()
	{
		return salary;
	}
	String getSubject()
	{
		return subject;
	}
}

class CollegeStudent extends Student
{
	int year;
	String major,name;
	CollegeStudent(String name,int id,int year,String major)
	{
		super(name,id);
		this.year=year;
		this.major=major;
	}
	int getYear()
	{
		return year;
	}
	String getMajor()
	{
		return major;
	}
}

public class C {
	public static void main(String args[])
	{
		Teacher t=new Teacher("Snape",150,"Potions");
		CollegeStudent c=new CollegeStudent("Sameera",31145,3,"CSE");
		System.out.println("Teacher details:"+"\n"+t.name1()+"\n"+t.getSalary()+"\n"+t.getSubject()+"\n");
		System.out.println("Student details:"+"\n"+c.name1()+"\n"+c.getId()+"\n"+c.getYear()+"\n"+c.getMajor());
		
	}


}
