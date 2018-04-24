package day2_17_04;

interface checkodd {
	public boolean isOdd(int num);
}

interface checkprime{
	public boolean isPrime(int numb);
}

interface checkpallindrom{
	public boolean isPallindrom(int nump);
}
public class checknum{
	public static void main(String args[])
	{
		 	
	checkodd ch= (num)->
	
	{
		
		if(num%2==0)
		{
			System.out.print(" number "+num+" is even : ");
			return true;
			
		}
		else
		{
			System.out.print(" number "+num+" is odd : ");
			return false;
		}
		
	};
	
	System.out.println(ch.isOdd(10));
	
//***********************************************
	checkprime cp=(numb)->
	{
		int c=0;
		for(int i=2;i<=numb;i++)
		{
			if(numb%i==0)
			{
				c++;
			}
		}
		
		if(c==1)
		{
			System.out.print(" number "+numb+" is prime :");
			return true;
		}
		else
		{
			System.out.print(" number "+numb+" is not  prime :");
			return false;
		}
		
		
	};
	System.out.println(cp.isPrime(151));
	
	//**************************************************
	
	checkpallindrom chp= (nump)->
	
	{
		int onum,rev=0;
		onum=nump;
		while(nump!=0)
		{
			int i=nump%10;							//checking for pallindrom
			 rev=rev*10+i;
			 nump=nump/10;
		}
		
		if(onum==rev)
		{
			System.out.print(" number "+onum+" is pallindrom : ");
			return true;
			
		}
		else
		{
			System.out.print(" number "+onum+" is not pallindrom : ");
			return false;
		}
		
	};
	
	System.out.println(chp.isPallindrom(101));
	}
}