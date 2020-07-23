package com.wipro.bank.acc;

public abstract class Account {
	int tenure;
	float principal,rateOfInterest;
	
	public void setInterest(int age, String gender)
	{
		if(gender.equalsIgnoreCase("Male")&&age<60)
			rateOfInterest=(float)9.8;
		else if(gender.equalsIgnoreCase("Male")&&age>=60)
			rateOfInterest=(float)10.5;
		if(gender.equalsIgnoreCase("Female")&&age<58)
			rateOfInterest=10.2f;
		else if(gender.equalsIgnoreCase("Female")&&age>=58)
			rateOfInterest=10.8f;
		System.out.println(rateOfInterest);
	}
	public float calculateMaturityAmount(float totalPrincipleDeposited,float maturityInterest)
	{
		return (totalPrincipleDeposited+maturityInterest);
	}
	public abstract float calculateAmountDeposited();
	public abstract float calculateInterest();
	

}