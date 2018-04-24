package day1_16_04;

import java.io.File;
import java.io.FileReader;
import java.io.File.*;
public class fileIO {

	public static void main(String[] args) throws Exception {
		
		
	    FileReader fr=new FileReader("C:\\Users\\trainee\\prateek\\day1_16_04\\src\\day1_16_04\\sample.txt");    
		//FileReader fr=new FileReader("\\sample.txt");
		int i,j;
		System.out.println("Orignal data");
		  while((i=fr.read())!=-1)    
	        {
	        		        	
	        System.out.print((char)i);
	        }
		  
		  System.out.println("\n");
	 
		  System.out.println("new data");
		  fr.close();
		  
		    FileReader fr2=new FileReader("C:\\Users\\trainee\\prateek\\day1_16_04\\src\\day1_16_04\\sample.txt");    

      
		  while((j=fr2.read())!=-1)    
        {
        	if((char)j==' ')
        	{
        		
        		System.out.print( (char)j+"sita");
        	}
        	
        System.out.print((char)j);
        }
        fr2.close();  
		
        File f= new File("");
        String sourcepath=f.getAbsolutePath();
        System.out.println("");
        System.out.println(sourcepath);

        
    
	}

}
