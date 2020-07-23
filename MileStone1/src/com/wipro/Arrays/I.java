package com.wipro.Arrays;

public class I
{
    public static void main(String args[])
    {
        int n=args.length;
        int[][] a=new int[2][2];
        if(n<4)
            System.out.println("Enter 4 Values");
        else if(n==4)
        {
             int k=0,i,j;
             for(i=0;i<2;i++)
             {
            	 for(j=0;j<2;j++)
            	 {
            		 a[i][j]=Integer.parseInt(args[k]);
                          k++;
                  }
             }
             System.out.println("The given array is:");
             for(i=0;i<2;i++)
             {
            	 for(j=0;j<2;j++)
            	 {
            		 System.out.print(a[i][j]+" ");
                 }
                 System.out.println();
             }
             System.out.println("Reverse Array is:");
             for(i=1;i>=0;i--)
             {
            	 for(j=1;j>=0;j--)
            	 {
            		 System.out.print(a[i][j]+" ");
                 }
                 System.out.println();
             }
        }
    }
}