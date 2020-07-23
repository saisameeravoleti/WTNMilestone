package com.wipro.automobile.twowheeler;
import com.wipro.automobile.*;

public class Honda extends Vehicle {
	String modelname;
	String reg_no;
	String ownername;
	int speed;
	public Honda(String modelname,String reg_no,String ownername,int speed)
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
	public void cdplayer() 
	{
		System.out.println("Accessing CD PLayer");
	}
}
