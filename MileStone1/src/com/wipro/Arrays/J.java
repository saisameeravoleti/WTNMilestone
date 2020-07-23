package com.wipro.Arrays;

public class J
{
    public static void main(String args[])
    {
        int n=args.length;
        int[][] a=new int[3][3];
        if(n<9)
            System.out.println("Please enter 9 integer numbers");
        else if(n==9)
        {
             int k=0,i,j;
             for(i=0;i<3;i++)
             {
            	 for(j=0;j<3;j++)
            	 {
            		 a[i][j]=Integer.parseInt(args[k]);
                          k++;
                  }
             }
             System.out.println("The given array is:");
             for(i=0;i<3;i++)
             {
            	 for(j=0;j<3;j++)
            	 {
            		 System.out.print(a[i][j]+" ");
                 }
                 System.out.println();
             }
             int max=a[0][0];
             for(i=0;i<3;i++)
             {
            	 for(j=0;j<3;j++)
            	 {
            		 if(a[i][j]>max)
                              max=a[i][j];
                 }
             }
             System.out.println("The biggest number in the given array:"+max);
        }
    }
}