package day1_16_04;

public class reverse_sequence {
	
    static void reverseString(String str)
    {
        String[] arraystring = str.split(" ");
        String reverseString = "";
         
        for (int i = 0; i < arraystring.length; i++) 
        {
            String word = arraystring[i];
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            reverseString = reverseString + reverseWord + " ";
        }
         
        System.out.println(str);       
        System.out.println(reverseString);       
       
    }
     
    public static void main(String[] args) 
    {
        reverseString("i love mangoes too much ");
         
       
    }
}