package com.wipro.AbstractClass;

abstract class Instrument
{
	abstract void play();
}

class Piano extends Instrument
{
	void play()
	{
		System.out.println("Piano is playing  tan tan tan tan");
	}
}

class Flute extends Instrument
{
	void play()
	{
		System.out.println("Flute is playing  toot toot toot toot");
	}
}

class Guitar extends Instrument
{
	void play()
	{
		System.out.println("Guitar is playing  tin  tin  tin");
	}
}

public class Abstract_3 {
	public static void main(String args[])
	{
		Instrument[] ins=new Instrument[10];
		ins[0]=new Piano();
		ins[1]=new Flute();
		ins[2]=new Guitar();
		ins[3]=new Piano();
		ins[4]=new Flute();
		ins[5]=new Guitar();
		ins[6]=new Piano();
		ins[7]=new Flute();
		ins[8]=new Guitar();
		ins[9]=new Piano();
		for(int i=0;i<10;i++)
		{
			if(ins[i] instanceof Piano)
				ins[i].play();
			if(ins[i] instanceof Flute)
				ins[i].play();
			if(ins[i] instanceof Guitar)
				ins[i].play();
		}
	}

}
