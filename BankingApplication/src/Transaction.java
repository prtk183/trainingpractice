import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address pgaddress= new Address("Pandurang nagar","47","444709","Bangalore");			//Customer address
		Address kpgaddress= new Address("Dada nagar","74","444108","Mangalore");
		Address mpgaddress= new Address("Chester nagar","74","444108","Tangalore");
		
		/*************contact details+address details********/
		
		//contact2address--> one to one relationship
		Contact pg1contactdetails = new Contact(568495,9421826025L,"www.pg@gmial.com",pgaddress);
		Contact pg2contactdetails = new Contact(568495,7421826025L,"www.pg@gmial.com",pgaddress); // Customer contact details
		Contact kpgcontactdetails = new Contact(965846,7517356958L,"www.kpg@yahoo.com",kpgaddress);
		Contact mpgcontactdetails = new Contact(965846,7517906958L,"www.mpg@hotmail.com",kpgaddress);
		
		List <Contact> pgcontactdetails = new ArrayList<Contact>();				//@[1]many to many,
		pgcontactdetails.add(pg1contactdetails);								//customer can have more than one mobile num
		pgcontactdetails.add(pg2contactdetails);
		
		List <Contact> kpgcontactdetailslist = new ArrayList<Contact>();
		kpgcontactdetailslist.add(kpgcontactdetails);
		
		List <Contact> mpgcontactdetailslist = new ArrayList<Contact>();
		mpgcontactdetailslist.add(mpgcontactdetails);
		
		
		/*****************customer+contact*********/
		//@customer2contact-->many to many[2] 
		Customer customer1 = new Customer("Prateek","Gawarle","SBI", pgcontactdetails);					//customer details
		Customer customer2 = new Customer("kilo Prateek","Gawarle","Axix", kpgcontactdetailslist);
		Customer customer3 = new Customer("Mega Prateek","Gawarle","Axix", mpgcontactdetailslist);
		
		/******************bank+contact+customer*************/
		//@bank2contact--> many to many[3]
		List <Customer> sbi_customer = new ArrayList<Customer>();
		sbi_customer.add(customer1);
		
		
		List <Customer> axix_customer = new ArrayList<Customer>();
		sbi_customer.add(customer2);
		sbi_customer.add(customer3);
		
		
		List <Contact> sbi_contacts = new ArrayList<Contact>();
		sbi_contacts.add(pg1contactdetails);
		sbi_contacts.add(pg2contactdetails);
		
		
		List <Contact> axix_contacts = new ArrayList<Contact>();
		axix_contacts.add(kpgcontactdetails);
		axix_contacts.add(mpgcontactdetails);
																					
		Bank SBI = new Bank("SBI",sbi_customer, sbi_contacts);				//@bank2customer-->many to many[4]
		Bank Axix = new Bank("Axix",axix_customer, axix_contacts);
		
		/************Account+statement+bank+customer************/
		
		Statement statement1 = new Statement(12/1/2012,"statement1");
		Statement statement2 = new Statement(22/12/2012,"statement2");
		Statement statement3 = new Statement(13/3/2013,"statement3");
		
		List<Statement> statement = new ArrayList<Statement>();
		statement.add(statement1);
		statement.add(statement2);
			
		Account account1 = new Account(100000,12,5,statement, SBI, customer1,"SavingsAccount");		//@account to statement--> one to many[5]
		Account account2 = new Account(25698,30,2,statement,Axix, customer2,"FlexibleSavingsAccount");		//@account to customer--> many to one[6]
		Account account3 = new Account(256568,30,8,statement,Axix, customer3,"CheckingAccount");
		
		
		
		/*********Printing-->account-->customer*********/
		System.out.println("Balance:"+account1.getBalance()+" CustomerName:"+account1.getCustomer().getFirstname()
				+ " TypeOfAccount:"+account1.TypeofAccount);
		
		/*
		object of account --> balance from account --> first name from customer list at customer class	
			
		*/
		/********Printing-->customer-->contact-->address****/
		//customer-->contact details-->city 
		 
		Iterator itr1=customer2.customercontactdetails.iterator();   
		  while(itr1.hasNext()){  
		    Contact ct=(Contact)itr1.next();  
		    System.out.println("PhoneNO:"+ct.getPhone()+" EmailId:"+ct.getEmail()+" City:"+ct.address.city);  
		  	}

		 /*********Account + TypeOfAcount*****/
	
		  
		  
	} 
	
	
	/*********lets do transaction*******/
		 
	public void credit(int amount,Customer customer, String BankName,String typeofaccount, String zipcode)
	{
		//customer.getCustomeraccounts().amount;
	}
		  
		  
		  
		  
	
}