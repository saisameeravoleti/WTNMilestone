package com.wipro.eb.entity;

public class Commercial extends Connection {
	public Commercial(int currentReading, int previousReading,float slabs[])
	{
		super(currentReading,previousReading,slabs);
	}
	public float computeBill()
	{
		int units=currentReading-previousReading;
		double billamt,elec,finalamt;
		if(units<=50)
			billamt=(float)(units*slabs[0]);
		else if(units>50&&units<=500)
			billamt=(float)((50*slabs[0])+((units-50)*slabs[1]));
		else
			billamt=(float)((50*slabs[0])+(50*slabs[1])+((units-100)*slabs[2]));
		if(billamt>=10000)
			elec=billamt*0.09;
		else if(billamt>=5000)
			elec=billamt*0.06;
		else
			elec=billamt*0.02;
		finalamt=billamt+elec;
		return (float)finalamt;
		
	}

}