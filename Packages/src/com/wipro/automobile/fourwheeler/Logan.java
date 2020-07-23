package com.wipro.automobile.fourwheeler;
import com.wipro.automobile.*;

public class Logan extends Vehicle{
	String modelname;
	String reg_no;
	String ownername;
	int speed;
	int gps;
	public Logan(String modelname,String reg_no,String ownername,int speed,int gps)
	{
		this.modelname=modelname;
		this.reg_no=reg_no;
		this.ownername=ownername;
		this.speed=speed;
		this.gps=gps;
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
	public int speed()
	{
		return speed;
	}
	public int gps() 
	{
		return gps;
	}

}
