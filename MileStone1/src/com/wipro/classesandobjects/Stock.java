package com.wipro.classesandobjects;

import java.util.*;
public class Stock 
{
	String stockname,stocksymbol;
	double prev_price,curr_price;
	Stock(String stockname,String stocksymbol,double prev_price,double curr_price)
	{
		this.stockname=stockname;
		this.stocksymbol=stocksymbol;
		this.prev_price=prev_price;
		this.curr_price=curr_price;
	}
	double percentage;
	double getChangePercentage()
	{
		double x=(curr_price-prev_price)/curr_price;
		percentage=x*100;
		return percentage;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String stockname=sc.next();
		String stocksymbol=sc.next();
		double prev_price=sc.nextDouble();
		double curr_price=sc.nextDouble();
		Stock obj=new Stock(stockname,stocksymbol,prev_price,curr_price);
		System.out.println("Stockname="+stockname+"\n"+"Stock symbol="+stocksymbol);
		System.out.println("Percentage change from previous price and current price is:"+obj.getChangePercentage()+"%");
		sc.close();
	}
}
