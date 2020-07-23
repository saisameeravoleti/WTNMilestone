package com.wipro.Interfaces;

interface LibraryUser
{
	void registerAccount();
	void requestBook();
}

class KidUsers implements LibraryUser
{
	int age;
	String bookType;
	KidUsers(int age,String bookType)
	{
		this.age=age;
		this.bookType=bookType;
	}
	public void registerAccount()
	{
		if(age<12)
			System.out.println("You have successfully registered under a Kids Account");
		else
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
	}
	public void requestBook()
	{
		if(bookType.equals("Kids")&&age<12)
			System.out.println("Book Issued successfully, please return the book within 10 days");
		else
			System.out.println("Oops, you are allowed to take only kids books");
	}
	
}

class AdultUsers implements LibraryUser
{
	int age;
	String bookType;
	AdultUsers(int age,String bookType)
	{
		this.age=age;
		this.bookType=bookType;
	}
	public void registerAccount()
	{
		if(age>12)
			System.out.println("You have successfully registered under an Adult Account");
		else
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
	}
	public void requestBook()
	{
		if(bookType.equals("Fiction")&&age>12)
			System.out.println("Book Issued successfully, please return the book within 7 days");
		else
			System.out.println("Oops, you are allowed to take only adult Fiction books");
	}
	
}

public class Interface_1 {
	public static void main(String args[])
	{
		System.out.println("---Testing Kid User---");
		LibraryUser KidUser=new KidUsers(12,"Kids");
		System.out.println("Test Case-1: age=12 and bookType=Kids");
		KidUser.registerAccount();
		KidUser.requestBook();
		LibraryUser KidUser1=new KidUsers(11,"Kids");
		System.out.println("Test Case-2: age=11 and bookType=Kids");
		KidUser1.registerAccount();
		KidUser1.requestBook();
		
		System.out.println();
		
		System.out.println("---Testing Adult User---");
		LibraryUser AdultUser=new AdultUsers(10,"Fiction");
		System.out.println("Test Case-1: age=10 and bookType=Fiction");
		AdultUser.registerAccount();
		AdultUser.requestBook();
		LibraryUser AdultUser1=new AdultUsers(56,"Fiction");
		System.out.println("Test Case-2: age=56 and bookType=Fiction");
		AdultUser1.registerAccount();
		AdultUser.requestBook();
		
	}

}
