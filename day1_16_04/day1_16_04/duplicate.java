package day1_16_04;

public class duplicate {

	public static void main(String[] args) {
		
		String string="abcddrg	";
	
		char strarr[]=string.toCharArray();				//fpr easier index access
		
		System.out.println(check(strarr));
		
		

	}

	private static boolean  check(char strarr[]) {
		
		
		boolean flag=false;
		int pos=0,count=1;
		for(int i=0;i<strarr.length-1;i++)
		{
			for(int j=i+1;j<strarr.length;j++)
			{
				if(strarr[i]==strarr[j])
				{
					flag=true;
					count++;
					 pos=j;
					 	
				}
				
			
			}
			
		
		}
		
		if(flag==true)
		{
		
			if(count==2)
			{
				char temp=strarr[pos];
				strarr[pos]=strarr[pos+1];
				strarr[pos+1]=temp;
			
				for(int i=0;i<strarr.length;i++)
				{
					System.out.print(strarr[i]);
				}
				System.out.println("");
			}
			else
			{
				System.out.println("shuffeling is not posssible");
			}
			return true;
		}
		else
		{
			
			return false;
		}
			

	}

}
