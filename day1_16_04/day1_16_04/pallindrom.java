package day1_16_04;

import java.util.Scanner;

public class pallindrom {

	public static void main(String[] args) {
		
		System.out.println("Insert Numebr ");
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		System.out.print("Numebr: ");
		String mystring = Integer.toString(num);	//converting to string
		
		char str[]=mystring.toCharArray();			//converting to array
		for(int i=0;i<mystring.length();i++)
		{
			System.out.print(" "+str[i]);
		}
		
		System.out.println("");
		System.out.print("reverse string:");
		int j=str.length;
		char strrev[] = mystring.toCharArray();
		int k=0;
		while(j!=0)
		{
			j--;									//reversing string for match
			System.out.print(" "+str[j]);
			strrev[k]=str[j];
			k++;
		}
		System.out.println("");
		
		int onum,rev=0;
		onum=num;
		while(num!=0)
		{
			int i=num%10;							//checking for pallindrom
			 rev=rev*10+i;
			 num=num/10;
		}
		boolean flag=false;
		for(int i=0;i<strrev.length;i++)
		{
			if(str[i]==strrev[i])					//matching strings
			{
				flag=true;
			}
		}
		
		if(rev==onum && flag==true )
		{
			System.out.println("True");
		}else
		{
			System.out.println("False");
		}

	}


}
