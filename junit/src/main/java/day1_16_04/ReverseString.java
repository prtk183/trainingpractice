package day1_16_04;

public class ReverseString {
		
	    @SuppressWarnings({ "PMD.SystemPrintln", "PMD.LawOfDemeter", "PMD.LawOfDemeter",
				"PMD.UseStringBufferForStringAppends", "PMD.UseStringBufferForStringAppends" })
	    
		public  String reverseString(final String str)
	    {
	        final String[] arraystring = str.split(" ");						//spliting by space
	        String reverseString = "";
	         
	        for (int i = 0; i < arraystring.length; i++) 
	        {															//taking every word
	            final String word = arraystring[i];
	            String reverseWord = "";
	             
	            for (int j = word.length()-1; j >= 0; j--) 
	            {
	                reverseWord = reverseWord + word.charAt(j);			//reversing letters in word
	            }
	            reverseString = reverseString + reverseWord + " ";
	        }
	         
	        
	       
	        return reverseString;
	    }
	     
	    public static void main(final String[] args) 
	    {
	    	final ReverseString string1 = new ReverseString();
	        string1.reverseString("i love mangoes too much ");
	         
	       
	    }
	}
	
	
	

