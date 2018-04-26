package day1_16_04;

import java.util.Arrays;


public class Pallindrom {

	public static void main(final String[] args) {
		
		
		final Pallindrom sample  = new Pallindrom();
		
		sample .checkIntPallindrom(121);
		
		sample .checkIntPallindrom(123);
		
		sample .checkStringPallindrom("-121");
		
	}
	
	@SuppressWarnings({ "PMD.LawOfDemeter", "PMD.SystemPrintln", "PMD.SystemPrintln",
			"PMD.SystemPrintln", "PMD.DataflowAnomalyAnalysis", "PMD.LawOfDemeter", "PMD.SystemPrintln",
			"PMD.SystemPrintln", "PMD.SystemPrintln", "PMD.LawOfDemeter" })
	public String checkStringPallindrom(final String string) {
		// TODO Auto-generated method stub
		
	
		
		
		final char str[]=string.toCharArray();	
													//converting to array
		
		@SuppressWarnings("PMD.ShortVariable")
		int j=str.length;
		final int x=j;
		char strrev[] = string.toCharArray();
		@SuppressWarnings("PMD.ShortVariable")
		int k=0;
		while(j!=0)
		{
			j--;									//reversing string for match
			strrev[k]=str[j];
			k++;
		}

		final String reversestring = Arrays.toString(strrev);

		
		@SuppressWarnings("PMD.ShortVariable")
		int t=0;
		for(t=0;t<x;t++)
		{
			System.out.print(strrev[t]);
		}
		return reversestring;
		
		
	}

	
	/**********************************************************/
	public int checkIntPallindrom(final int mynum)
	{
		 int num=mynum;
		 @SuppressWarnings({ "PMD.OneDeclarationPerLine" })
		int rev=0;
			
			while(num!=0)
			{
				@SuppressWarnings("PMD.ShortVariable")
				final int i=num%10;							//checking for pallindrom
				 rev=rev*10+i;
				 num=num/10;
			}
			
		
		return rev;
		

	}


}
