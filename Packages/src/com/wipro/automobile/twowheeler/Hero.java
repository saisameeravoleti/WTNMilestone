package com.wipro.automobile.twowheeler;
import com.wipro.automobile.*;

public class Hero extends Vehicle{
	String modelname;
	String reg_no;
	String ownername;
	int speed;
	public Hero(String modelname,String reg_no,String ownername,int speed)
	{
		this.modelname=modelname;
		this.reg_no=reg_no;
		this.ownername=ownername;
		this.speed=speed;
	}
	public String getModelName()
	{
		return modelname;
	}
	public String getRegistrationNumber() 
	{
		return reg_no;
	}
	public String getOwnerName() 
	{
		return ownername;
	}
	public int getSpeed()
	{
		return speed;
	}
	public void radio()
	{
		System.out.println("Accessing Radio");
	}

}
