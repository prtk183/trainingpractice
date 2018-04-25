package day3_18_04;

public class genricPrintArray
{

			   public static < T > void printArray( T[] inputArray )		//generic method to print array
			   {
			      
				   for(T element : inputArray) 
				   {
			         
			    	  System.out.printf("%s ", element);
				   }
				   System.out.println();
			   }

			   public static void main(String args[]) 
			   {
			      
			      Integer[] intarr = { 15,46,78,24,88 };
			      System.out.print("\ninteger array:");
			      printArray(intarr);  
			      System.out.println("");
			      
			      Character[] chararr = { 'P', 'R', 'T', 'K' };
			      System.out.print("\ncharacter array:");
			      printArray(chararr); 
			    
			   }
			
		
	}


