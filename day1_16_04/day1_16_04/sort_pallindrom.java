package day1_16_04;

import java.util.Scanner;

public class sort_pallindrom {

	public static void main(String[] args) {
		
		
		int arr[]={132,121,34,54,67,11,23,111,62,78};
		//char string[]= {'mom',};
		int i,j;
		boolean flag=true;
		for(i=0;i<10;i++)
		{
			flag=false;
			for(j=0;j<10-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
				
			}
			if(flag==false)
			{
				break;
			}
		}
		
		
		for(int k=0;k<10;k++)
		{
			int num,x,rev=0;
			num=arr[k];
		
			while(num!=0)
			{
				 x=num%10;
				//System.out.println("i= "+i);
				 rev=rev*10+x;
				 num=num/10;
				 
			}
			
			if(rev==arr[k])
			{
				System.out.println("pallindromz: "+arr[k]);
			}else
			{
				System.out.println(arr[k]);
			}

			
			
			
		}
		
		
	
	}

}
