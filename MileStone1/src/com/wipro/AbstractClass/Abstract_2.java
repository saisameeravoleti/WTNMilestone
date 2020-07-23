package com.wipro.AbstractClass;

import java.util.Random;

abstract class Compartment
{
	public abstract void notice();
}

class FirstClass extends Compartment
{
	public void notice()
	{
		System.out.println("This is First Class");
	}
}

class LadiesClass extends Compartment
{
	public void notice()
	{
		System.out.println("This is Ladies Class");
	}
}

class GeneralClass extends Compartment
{
	public void notice()
	{
		System.out.println("This is General Class");
	}
}

class LuggageClass extends Compartment
{
	public void notice()
	{
		System.out.println("This is Luggage Class");
	}
}

public class Abstract_2 {
	public static void main(String args[])
	{
		Compartment[] compartment=new Compartment[10];
		Random r=new Random();
		for(int i=0;i<10;i++)
		{
			int rand = r.nextInt((4 - 1) + 1) + 1;
			if(rand==1)
				compartment[i]=new FirstClass();
			else if(rand==2)
				compartment[i]=new LadiesClass();
			else if(rand==3)
				compartment[i]=new GeneralClass();
			else if(rand==4)
				compartment[i]=new LuggageClass();
			compartment[i].notice();
		}
	}

}
