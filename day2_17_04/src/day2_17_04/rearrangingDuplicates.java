package day2_17_04;

public class rearrangingDuplicates {

		public static void main(String[] args) {
			
			String string1="abcddrg	";
			
			System.out.println("given: "+string1);
		
			char strarr1[]=string1.toCharArray();				//for easier index access
			
			System.out.println("updation : "+check(strarr1));
			
			
			String string2="aab";
			
			System.out.println("\ngiven: "+string2);
			
			char strarr2[]=string2.toCharArray();				
			
			System.out.println("updation : "+check(strarr2));
			
			
			String string3="aba";
			
			System.out.println("\n given: "+string3);
			
			char strarr3[]=string3.toCharArray();				
			
			System.out.println("updation : "+check(strarr3));
			

		}

		private static boolean  check(char strarr[])
		{
			
			
			boolean flag=false;
			int pos=0,count=1;						
			for(int i=0;i<strarr.length-1;i++)
			{
				for(int j=i+1;j<strarr.length-1;j++)
				{
					if(strarr[i]==strarr[j])
					{
						flag=true;
						count++;
						 pos=j;								//finding position of duplicates
						 	
					}
					
				}
					
			}
			
			if(flag==true)
			{
			
						if(count==2)
						{
							char temp=strarr[pos];
							strarr[pos]=strarr[pos+1];
							strarr[pos+1]=temp;					//swapping immediate elements
							System.out.print("updated :");
							for(int i=0;i<strarr.length;i++)
							{
									System.out.print(strarr[i]);
							}
							System.out.println("");
						}
						else
						{
							System.out.println("shuffeling is not posssible");
							return false;
						}
						return true;
			}
			else
			{
				System.out.println("shuffeling is not posssible");
				return false;
			}
	
		}


}



