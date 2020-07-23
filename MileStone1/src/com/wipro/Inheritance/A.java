package com.wipro.Inheritance;

class Parent
{
	String a="This is Parent class";
}

class Child extends Parent
{
	String p=super.a;
	String a="This is Child Class";
	void ch()
	{
		System.out.println(p);
		System.out.println(a);
	}
}

public class A {
	public static void main(String args[])
	{
		Child c=new Child();
		c.ch();
	}

}
