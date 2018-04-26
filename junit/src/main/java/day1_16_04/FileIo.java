package day1_16_04;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File.*;
import java.io.FileNotFoundException;
public class FileIo {

		@SuppressWarnings({ "PMD.AvoidPrintStackTrace", "PMD.AssignmentInOperand" })
		public static void main(final String[] args)  {
	
			final String path = "C:\\Users\\trainee\\prateek\\day1_16_04\\src\\day1_16_04\\sample.txt";
			final FileIo file = new FileIo();
			file.openFile(path);
		}
			
		
		public String openFile(String path)
			{
				
			String way=path;
			int i;
			String str="";
		    FileReader reader;
			try {
				reader = new FileReader(path);
				
				try {
					while((i=reader.read())!=-1)    
					{
						str= str + (char)i;	        	
						//System.out.print((char)i);
					
					}
				} catch (IOException e) {
				
					System.out.print(e);
				}
				
			}
			catch (FileNotFoundException e)
			{
				
				System.out.print("e");
			}    
			
			
			System.out.println(str);
		return str;	  
		}


}
