package day1_16_04;

public class ContainsDuplicate {

		public static void main(final String[] args) {
			
			final ContainsDuplicate take = new ContainsDuplicate();
			 
			take.check("abcde",'d');
			
			take.check("xyzw", 'd');
			
		}

		@SuppressWarnings({ "PMD.DataflowAnomalyAnalysis", "PMD.OnlyOneReturn", "PMD.SimplifyBooleanExpressions",
				"PMD.UnusedFormalParameter" })
		
		public String  check(final String string, final char search) {
			
			final char strarr[]=string.toCharArray();
			
			boolean flag=false;
			
			for(int i=0;i<strarr.length-1;i++)
			{
				for(int j=i+1;j<strarr.length-1;j++)
				{
					if(strarr[i]==search)
					{
						flag=true;
						 	
					}
			
				}
		
			}
			
			if(flag==true)
			{
			
				return "found";
				
			}
			else
			{
					
				return "not found";
			}
				
		}
	
}
