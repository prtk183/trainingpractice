package day1_16_04;

import java.util.Arrays;

public class SortPallindrom {


		public static void main(String[] args) {
			
			SortPallindrom array = new SortPallindrom();
			int a[]= {132,121,34,54,67,11,23,111,62,78};
			array.operate(a);
			
		}
		
		
		public String operate(int a[])
		{
			int arr[]= new int[10];
			
			for(int g=0;g<10;g++)				//storing into new array
			{
				arr[g]=a[g];
			}
			
			
			int i,j;
			boolean flag=true;
			for(i=0;i<10;i++)
			{
				flag=false;
				for(j=0;j<10-i-1;j++)
				{									//bubble sorting 
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
			
			int sorted[] = new int[10];
			int p=0;
			for(int k=0;k<10;k++)
			{
				int num,x,rev=0;
				num=arr[k];
			
				while(num!=0)
				{								//finding pallindrom
					 x=num%10;
					 rev=rev*10+x;
					 num=num/10;
					 
				}
				
				sorted[p]=rev;
				p++;
			}
			
		
			String passarray = Arrays.toString(sorted);
			System.out.println(passarray);
			return passarray;
			
			
		
		}

		
}
