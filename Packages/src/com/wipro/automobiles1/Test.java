package com.wipro.automobiles1;
import com.wipro.automobile.twowheeler.*;
import com.wipro.automobile.fourwheeler.*;

public class Test {
	public static void main(String args[])
	{
		//Honda
		Honda honda=new Honda("Honda1","1234XYZ","Sameera",100);
		System.out.println("Honda Details");
		System.out.println(honda.getModelName());
		System.out.println(honda.getRegistrationNumber());
		System.out.println(honda.getOwnerName());
		System.out.println(honda.getSpeed());
		honda.cdplayer();
		System.out.println();
		
		//Hero
		Hero hero=new Hero("Hero1","ABC123","Sam",50);
		System.out.println("Hero Details");
		System.out.println(hero.getModelName());
		System.out.println(hero.getRegistrationNumber());
		System.out.println(hero.getOwnerName());
		System.out.println(hero.getSpeed());
		hero.radio();
		System.out.println();
		
		//Logan
		Logan logan=new Logan("Logan1","CAR1145","SSV",180,5);
		System.out.println("Logan Details");
		System.out.println(logan.getModelName());
		System.out.println(logan.getRegistrationNumber());
		System.out.println(logan.getOwnerName());
		System.out.println(logan.speed());
		System.out.println(logan.gps());
		System.out.println();
		
		//Ford
		Ford ford=new Ford("Ford1","CAR1232","SLK",230,36);
		System.out.println("Ford Details");
		System.out.println(ford.getModelName());
		System.out.println(ford.getRegistrationNumber());
		System.out.println(ford.getOwnerName());
		System.out.println(ford.speed());
		System.out.println(ford.temp_control());
		System.out.println();
		
		
	}

}
