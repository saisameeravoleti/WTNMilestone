package com.wipro.pack_11;
import com.wipro.pack_1.*;

public class Foundation_1 {
	public static void main(String args[])
	{
		Foundation f=new Foundation();
		//System.out.println(f.var1);->Private variable is not visible
		//System.out.println(f.var2);->Default variable is not visible
		//System.out.println(f.var3);->Protected variable is not visible
		System.out.println(f.var4); //Public modifier variable is visible
	}

}
