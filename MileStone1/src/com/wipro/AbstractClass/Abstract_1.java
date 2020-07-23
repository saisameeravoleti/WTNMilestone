package com.wipro.AbstractClass;

abstract class GeneralBank
{
	abstract double getSavingsInterestRate();
	abstract double getFixedDepositInterestRate();
}

class ICICIBank extends GeneralBank
{
	double getSavingsInterestRate()
	{
		return 4;
	}
	double getFixedDepositInterestRate()
	{
		return 8.5;
	}
}

class KotMBank extends GeneralBank
{
	double getSavingsInterestRate()
	{
		return 6;
	}
	double getFixedDepositInterestRate()
	{
		return 9;
	}
}

public class Abstract_1 
{
	public static void main(String args[])
	{
		ICICIBank i=new ICICIBank();
		System.out.println("ICICI: Saving:"+i.getSavingsInterestRate()+"%"+" Fixed:"+i.getFixedDepositInterestRate()+"%");
		
		KotMBank k=new KotMBank();
		System.out.println("KotMBank: Saving:"+k.getSavingsInterestRate()+"%"+" Fixed:"+k.getFixedDepositInterestRate()+"%");

		GeneralBank g=new ICICIBank();
		System.out.println("ICICI: Saving:"+g.getSavingsInterestRate()+"%"+" Fixed:"+g.getFixedDepositInterestRate()+"%");

		GeneralBank g1=new KotMBank();
		System.out.println("KotMBank: Saving:"+g1.getSavingsInterestRate()+"%"+" Fixed:"+g1.getFixedDepositInterestRate()+"%");
	}

}
