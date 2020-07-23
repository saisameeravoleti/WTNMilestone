package com.wipro.Strings;

import java.util.*;
public class String_8 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=str.length();
		String s="";
	    for(int i=0;i<n;i++)
	    {
	        if(str.charAt(i)=='*')
	          s=s+"";
	       else if(i!=0&&str.charAt(i-1)=='*')
	         s=s+"";
	       else if(i!=n-1&&str.charAt(i+1)=='*')
	         s=s+"";
	       else
	          s=s+str.charAt(i);
	    }
	    System.out.println(s);
	    sc.close();
	}

}
