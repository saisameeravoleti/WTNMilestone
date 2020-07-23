package com.wipro.Interfaces.live;
import com.wipro.Interfaces.music.Playable;
import com.wipro.Interfaces.music.string.*;
import com.wipro.Interfaces.music.wind.*;

public class Test {
	public static void main(String args[])
	{
		Playable veena=new Veena();
		Playable saxophone=new Saxophone();
		veena.play();
		saxophone.play();
	}

}
