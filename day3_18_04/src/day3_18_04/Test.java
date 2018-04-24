package day3_18_04;
import java.util.*;

 class MyCalc extends Exception {

	   private int ex;
	    MyCalc()
	   {
	    	
	   }
	   public String toString()
	   {
		   return " Exception numbers p or n is less than zero";
	   }
}

	  class Test
	  {
		  static void power(int p, int n) throws MyCalc
		  {
			  if(p<0 || n<0)
			  {
				  throw new MyCalc(); 
			  }
			  else
			  {
				  System.out.println((long)Math.pow(p,n));
			  }
			  
		  }

	   public static void main(String[] args)
	   {
		   try
		   {
			   power(3,-3);
		   }
		   catch(MyCalc me)
		   {
			   System.out.println(me);
		   }
	   }
	
}

