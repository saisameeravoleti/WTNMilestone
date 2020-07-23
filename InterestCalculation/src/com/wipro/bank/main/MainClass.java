package com.wipro.bank.main;

import com.wipro.bank.service.BankService;

public class MainClass {
	public static void main(String args[])
	{
	      int tenure = 10;
	      float principal = 556;
	      int age = 45;
	      String gender = "Male";
	      BankService b=new BankService();
	      b.calculate(principal, tenure, age, gender);
	}
}
