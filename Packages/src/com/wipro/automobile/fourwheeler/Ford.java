package com.wipro.automobile.fourwheeler;
import com.wipro.automobile.*;

public class Ford extends Vehicle {
	String modelname;
	String reg_no;
	String ownername;
	int speed;
	int temp_control;
	public Ford(String modelname,String reg_no,String ownername,int speed,int temp_control)
	{
		this.modelname=modelname;
		this.reg_no=reg_no;
		this.ownername=ownername;
		this.speed=speed;
		this.temp_control=temp_control;
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
	public int temp_control() 
	{
		return temp_control;
	}

}
