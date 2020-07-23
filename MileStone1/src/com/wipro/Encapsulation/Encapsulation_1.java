package com.wipro.Encapsulation;

class Author
{
	private String name,email;
	private char gender;
	Author(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public char getGender()
	{
		return gender;
	}
}

class Book
{
	private String name;
	private Author author; //creating a variable which refers to the Author class
	private double price;
	private int qtyInStock;
	Book(String name,Author author,double price,int qtyInStock)
	{
		this.name=name;
		this.author=author; 
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public String getName()
	{
		return name;
	}
	public Author author()
	{
		return author;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice()
	{
		price=1250;
	}
	public int getQtyInStock()
	{
		return qtyInStock;
	}
	public void setQtyInStock()
	{
		qtyInStock=125;
	}
	public Author getAuthor()
	{
		return author;
	}
}

public class Encapsulation_1 {
	public static void main(String args[])
	{
		Author a=new Author("J.K.Rowling","jkrownlinghp@gmail.com",'F');
		Book b=new Book("Harry Potter and the Goblet of Fire",a,750,100);
		System.out.println("Book name:"+b.getName()+" Price:"+b.getPrice());
		System.out.println();
		
		b.setPrice();
		b.setQtyInStock();
		System.out.println("Book Details");
		System.out.println("Book name:"+b.getName()+"\t"+"Book Price:"+b.getPrice()+"\t"+"Book Quantity:"+b.getQtyInStock());
		System.out.println();
		
		System.out.println("Author Details");
		System.out.println("Author name:"+b.getAuthor().getName()); //we are calling Author class method using the object of class Book
		System.out.println("Author email:"+b.getAuthor().getEmail());
		if(b.getAuthor().getGender()=='M')
			System.out.println("Author Gender:Male"); //accessing class Author methods using class Book object
		else
			System.out.println("Author Gender:Female");
		
		
	}

}
