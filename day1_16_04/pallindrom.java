package day1_16_04;

import java.util.Scanner;

public class pallindrom {

	public static void main(String[] args) {
		
		System.out.println("Numebr ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("My Numebr: ");
		String mystring = Integer.toString(num);
		
		char str[]=mystring.toCharArray();
		for(int i=0;i<mystring.length();i++)
		{
			System.out.println(str[i]);
		}
		
		System.out.println("reverse string:");
		char str2[] = null;
		int j=0;
		for(int i=mystring.length();i<=0;i--)
		{
			System.out.println(str[i]);
			str2[j]=str[i];
			j++;
		}
		/*
		System.out.println("reverse string:");
		for(int i=0;i<str2.length-1;i++)
		{
			System.out.println(str2[i]);
		}
		*/
		int onum,rev=0;
		onum=num;
		while(num!=0)
		{
			int i=num%10;
			//System.out.println("i= "+i);
			 rev=rev*10+i;
			 num=num/10;
		}
		if(rev==onum)
		{
			System.out.println("True");
		}else
		{
			System.out.println("False");
		}

	}


}
