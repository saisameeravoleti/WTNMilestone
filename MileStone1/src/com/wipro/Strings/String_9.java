package com.wipro.Strings;

import java.util.*;
public class String_9 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String[] s=str1.split(",",1000);
		String m=s[0];
		String n=s[1];
		int len=m.length();
		int len1=n.length();
		String str="";
		int x=0,y=0;
		if(len<len1)
		{
		    for(int i=0;i<(len+len1);i++)
		    {
		        if(x>len-1)
		        {
		            str=str+String.valueOf(s[1].charAt(y));
		            y++;
		        }
		        else if(i%2==0)
		        {
		            str=str+String.valueOf(s[0].charAt(x));
		            x++;
		        }
		        else
		        {
		            str=str+String.valueOf(s[1].charAt(y));
		            y++;
		        }
		        
		    }
		   
		}
		else if(len>len1||len==len1)
		{
		    for(int i=0;i<(len+len1);i++)
		    {
		        if(y>len1-1)
		        {
		            str=str+String.valueOf(s[0].charAt(x));
		            x++;
		        }
		        else if(i%2==0)
		        {
		            str=str+String.valueOf(s[0].charAt(x));
		            x++;
		        }
		        else
		        {
		            str=str+String.valueOf(s[1].charAt(y));
		            y++;
		        }
		        
		    }
		}
		System.out.println(str);
		sc.close();
	}
}
