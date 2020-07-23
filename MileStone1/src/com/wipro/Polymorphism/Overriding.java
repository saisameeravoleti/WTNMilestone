package com.wipro.Polymorphism;

class Fruit
{
	String name="Fruit",taste="salty";
	int size;
	void eat()
	{
		System.out.println("Name:"+name+" and Taste:"+taste);
	}
}

class Apple extends Fruit
{
	String name,taste;
	int size;
	Apple(String name,String taste,int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat()
	{
		System.out.println("Name:"+name+" and Taste:"+taste);
	}
}

class Orange extends Fruit
{
	String name,taste;
	int size;
	Orange(String name,String taste,int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat()
	{
		System.out.println("Name:"+name+" and Taste:"+taste);
	}
}
public class Overriding {
	public static void main(String args[])
	{
		Apple a=new Apple("newton_apple","sour",50);
		Orange o=new Orange("shimla_orange","sweet",25);
		a.eat();
		o.eat();
		
	}

}
