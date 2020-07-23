package com.wipro.Loops;

class H
{
    public static void main(String args[])
    {
         String s=args[0];
         char ch=s.charAt(0);
         switch(ch)
         {
         case 'R':
        	 System.out.println("R->Red");
        	 break;
         case 'B':
        	 System.out.println("B->Blue");
        	 break;
         case 'G':
        	 System.out.println("G->Green");
        	 break;
         case 'O':
        	 System.out.println("O->Orange");
	    	break;
         case 'Y':
        	 System.out.println("Y->Yellow");
        	 break;
         case 'W':
        	 System.out.println("W->White");
        	 break;
         default:
        	 System.out.println("Invalid Code");
       }
    }
}