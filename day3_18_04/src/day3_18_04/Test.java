package day3_18_04;
import java.util.*;

 class MyCalc extends Exception {

	   private int ex;
	    MyCalc(String x)
	   {
	    	
	   System.out.println(x);
	    	
	   }
	  
}

	  class Test
	  {
		  static void power(int p, int n) throws MyCalc
		  {
			   if(p<0 && n<0 )
			  {
				  throw new MyCalc("n and p should not be 0"); 
				  
			  }
			   else if(p<0 || n<0)
			  {
				  throw new MyCalc("n or p should not be  0"); 
			  }
			 
			  else
			  {
				  if(p<10 && n<10)
				  {
				  System.out.println((long)Math.pow(p,n));
				  }
				  else
				  {
					  System.out.println("Enter valid range(0-10) of  numbers");
				  }
			  }
			  
		  }

	   public static void main(String[] args)
	   {
		   try
		   {
			   int a, b;
			   Scanner sc = new Scanner(System.in);
			   System.out.println("input n number");
			   a=sc.nextInt();
			   System.out.println("input p number");
			   b=sc.nextInt();
			   power(a,b);
		   }
		   catch(MyCalc me)
		   {
			  
		   }
	   }
	
}

