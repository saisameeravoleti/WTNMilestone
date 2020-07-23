package com.wipro.Polymorphism;

class Shape
{
	void draw()
	{
		System.out.println("Drawing");
	}
	void erase()
	{
		System.out.println("Erasing");
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
	void erase()
	{
		System.out.println("Erasing Circle");
		System.out.println();
	}
}


class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Triangle");
	}
	void erase()
	{
		System.out.println("Erasing Triangle");
		System.out.println();
	}
}

class Square extends Shape
{
	void draw()
	{
		System.out.println("Drawing Square");
	}
	void erase()
	{
		System.out.println("Erasing Square");
	}
}
public class Polymorphism {
	public static void main(String args[])
	{
		Shape c=new Circle();
		c.draw();
		c.erase();
		Shape t=new Triangle();
		t.draw();
		t.erase();
		Shape s=new Square();
		s.draw();
		s.erase();
	}

}
