package day2_17_04;

import java.util.ArrayList;
import java.util.*;

public class testphonebook {

	public static void main(String[] args) {
		
		
		phoneBook p1 = new phoneBook(1,"Prateek","g",9921826082L);
		phoneBook p2 = new phoneBook(2,"Vijaya","g",9421826283L);
		phoneBook p3 = new phoneBook(3,"Gawarle","g",9321826284L);
		
		ArrayList<phoneBook> ar = new ArrayList<phoneBook>();
		
		  ar.add(p1);  
		  ar.add(p2);  
		  ar.add(p3);  
		  
		  ar.remove(p1);
		  
		  int ok=0;
		 while(ok!=1)
		 {
			 System.out.print("\n menu");
			 System.out.print("\n 1. add");
			 System.out.print("\n 2. remove");
			 System.out.print("\n 3. serach by name");
			 System.out.print("\n 4. search by number");
			 System.out.print("\n 5. Search by sr number");
			 System.out.print("\n 6. Display");
			 System.out.print("\n Press operation: ");
			 Scanner sc = new Scanner(System.in);
			 int ch= sc.nextInt();
		 
		  switch(ch)
		  {
		  	case 1:
		  			String fname,lname;
		  			int nsr;
		  			long nno;
		  			System.out.print("\nEnter first name: ");
		  			fname=sc.nextLine();
		  			System.out.print("\nEnter last name: ");
		  			lname=sc.nextLine();
		  			System.out.print("\nEnter sr no: ");
		  			nsr=sc.nextInt();
		  			System.out.print("\nEnter phone no: ");
		  			nno=sc.nextLong();
		  			 
		  			phoneBook p= new phoneBook(nsr,fname,lname,nno);
		  			ar.add(p);
		  			
		  			break;
		  			
		  	case 2:
		  			System.out.println("\nEnter id of person to delete");
		  			int id=sc.nextInt();
		  			ar.remove(id);
		  			break;
		  			
		  	case 3:
		  			System.out.println("\nEnter name of person to serach");
		  			
		  			String SearchByName = sc.next();
					Iterator<phoneBook> itr = ar.iterator();
					String isFound = null;
					while (itr.hasNext()) {
						phoneBook d1 = itr.next();
						isFound = d1.firstname;
						if (isFound.equalsIgnoreCase(SearchByName)) {
							
							System.out.println(d1.sr+" "+d1.firstname+" "+d1.lastname+" "+d1.phoneno);
						} 
						else
						{
							System.out.println("Record not found");
						}
					}
		  		
		  			break;
		  	case 4:
		  			System.out.println("\nEnter phone number of person to serach");
		  			long pno=sc.nextInt();
		  			Iterator<phoneBook> itr1 = ar.iterator();
					Long isFound1 = null;
					while (itr1.hasNext()) {
						phoneBook d1 = itr1.next();
						isFound1 = d1.phoneno;
						if (isFound1==pno) {
							
							System.out.println(d1.sr+" "+d1.firstname+" "+d1.lastname+" "+d1.phoneno);
						}
						else 
						{
							System.out.println("Record not found");
						}
					}
		  			
		  			break;
		  	case 5:
		  			System.out.print("\nEnter id: ");
		  			long pid=sc.nextInt();
		  			Iterator<phoneBook> itr2 = ar.iterator();
					int isFound2 = (Integer) null;
					while (itr2.hasNext()) {
						phoneBook d1 = itr2.next();
						isFound2 = d1.sr;
						if (isFound2==pid) {
							// System.out.println("Record found/n");
							System.out.println(d1.sr+" "+d1.firstname+" "+d1.lastname+" "+d1.phoneno);
						} else
						{
							System.out.println("Record not found");
						}
					}
		  			break;
		  	case 6:
		  			Iterator itr3=ar.iterator(); 
			   
		  			while(itr3.hasNext()){  
		  				phoneBook ph=(phoneBook)itr3.next();  
		  				System.out.println(ph.sr+" "+ph.firstname+" "+ph.lastname+" "+ph.phoneno);  
		  			}
		  			break;
		  	default:
		  			break;
		  }
		  
		  System.out.print("\n Press 0 to conti and 1 to exit");
		   ok = sc.nextInt();
		 }
		  
		  
		  
		  
	}

}
