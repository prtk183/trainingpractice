package repository;


import java.util.ArrayList;
import java.util.List;

import model.Account;
import model.Address;
import model.Bank;
import model.Contact;
import model.Customer;
import model.Statement;

public class BankingRepo {

	public static int customerCount = 101;
	public static int accountcount = 101;
	
public static void main(String arg[])
{

	
	Address pgaddress = new Address("Pandurang nagar","47","444709","Bangalore",100);			
	Address kpgaddress= new Address("Dada nagar","74","444108","Mangalore",101);


	List<Address> addressList = new ArrayList<Address>();
	addressList.add(pgaddress);
	addressList.add(kpgaddress);
	
	/*************contact details+address details********/
	
	//contact2address--> one to one relationship
	Contact pgcontactdetails = new Contact(568495,9421826025L,"www.pg@gmial.com",pgaddress, 100);
	Contact kpgcontactdetails = new Contact(965846,7517356958L,"www.kpg@yahoo.com",kpgaddress, 101);

//#contactList
	List <Contact> pgcontactsdetailslist = new ArrayList<Contact>();				//@[1]many to many,
	pgcontactsdetailslist.add(pgcontactdetails);								//customer can have more than one mobile num
	pgcontactsdetailslist.add(kpgcontactdetails);
	

	
	
	/*****************customer+contact*********/
	//@customer2contact-->many to many[2] 
	Customer customer1 = new Customer("Prateek","Gawarle","SBI", pgcontactsdetailslist,100);					//customer details
	Customer customer2 = new Customer("kilo Prateek","Gawarle","Axix", pgcontactsdetailslist, 101);

//#customerList
	List<Customer> customerList = new ArrayList<Customer>();
	customerList.add(customer1);
	customerList.add(customer2);
	
	/******************bank+contact+customer*************/

//#bankList
	List<Bank> bankList = new ArrayList<Bank>();																			
	Bank SBI = new Bank("SBI", bankList, 100);				//@bank2customer-->many to many[4]
	Bank Axix = new Bank("Axix", bankList, 101);
	bankList.add(SBI);
	bankList.add(Axix);
	
	/************Account+statement+bank+customer************/
		
//#accountList
	List<Account> accountList = new ArrayList<Account>();
	Account account1 = new Account(100000,12,5, "SBI", customer1,100);		
	Account account2 = new Account(25698,30,2,"Axix", customer2, 101);	
	accountList.add(account1);
	accountList.add(account2);
	
	
//StatementList
	List<Statement> statementList = new ArrayList<Statement>();
	Statement statement1 = new Statement(12/1/2012,account1,100);
	Statement statement2 = new Statement(22/12/2012,account2, 101);
	statementList.add(statement1);
	statementList.add(statement2);
	
	BankingRepo one = new BankingRepo();
	
	System.out.println("show prateek :");
	
	one.showCustomerDetails("Prateek", 100, customerList);
	
	
	System.out.println("\n\nshow prateek after deposite :");
	one.deposit("Prateek", 10000, accountList,"SBI", customerList);
	//one.showCustomerDetails("Prateek", 100, customerList);		
	
	
	System.out.println("\n\nshow prateek after withdraw :");
	one.withdraw("Prateek", 500, accountList, "SBI", customerList);
	//one.showCustomerDetails("Prateek", 100, customerList);	

	System.out.println("\n\nshow prateek aftre update:");
	one.updateCustomerDetails("Prateek", "Gawarle", 100, customerList, pgcontactsdetailslist, addressList, "Hriteek", "Roshan", 888888888L, "jfsjh@kdh","godrej", "58", "444585", "Vikhroli");
	one.showCustomerDetails("Hriteek", 100, customerList);
	
	
	System.out.println("\n\nshow hriteek aftr delete:");
	one.deleteAccount("Hriteek", 100, "SBI", customerList, pgcontactsdetailslist, addressList, accountList);
	one.showCustomerDetails("Hriteek", 100, customerList);
	
	System.out.println("\n\nshow rrajni after adding:");
	one.addCustomer("Rajni", "boss", "SBI",123456789L, 123456789L, "theboss@gmail.com", "thalaiwa road", "HOME", "000000", "boss", pgcontactsdetailslist, customerList);
	one.showCustomerDetails("Rajni", 102, customerList);
}
	
	/******************************************************************/
		//@to show customer details
		public void showCustomerDetails(String custname, int custId, List<Customer> customerList)
		
		{
			

			
			for(Customer s: customerList)
			{  
				
				if(s.getCustomerId()==custId)
				{
					System.out.println(s.getFirstName()+" "+ s.getLastName()+" "+
				s.getCustomerId()+" ");
					
					for(Contact ct : s.getCustomerContactDetails())
					{
						if(ct.getContactId()==custId)
						{
						System.out.println(ct.getMobile()+" "+ct.getEmail()+" "+
					ct.getAddress().getCity()+" "+ct.getAddress().getZipcode());
						}
					}
		
				}
			}
			
		}

/**************************************/
		public Boolean addCustomer(String firstname, String lastname, String bankname,  long phon, long mob, String email, String street,
				String houseno, String zipcode, String city, List<Contact> contactList, List<Customer> customerList) 
		{
			// TODO Auto-generated method stub
			
			++customerCount; 
			
			Address add = new Address(street, houseno, zipcode, city, customerCount);
			
			Contact con1 = new Contact(phon, mob, email, add, customerCount);
			
			
			contactList.add(con1);
			
			Customer cust1 = new Customer(firstname, lastname, bankname, contactList, customerCount);
				
			customerList.add(cust1);
		return true;
			}


		/*************************************************************************************/
		/*Create bank*/
		public Bank createBank(String bankname, int bankId, List<Bank> banksList) {
			Bank bank = new Bank();
			if(bankId<101)
			{
				bank.setBankId(customerCount);
				bank.setBankName(bankname);
				bank.setBanksList(banksList);
			}
			else
			{
			customerCount++; 

			bank.setBankId(customerCount);
			bank.setBankName(bankname);
			bank.setBanksList(banksList);
			}
			return bank;
		}

		/********************************************************************************/
		/*Create account for customer*/

		public void createAccountForCustomer(String firstname, String lastname, String bankname, long phon, long mob,
				String email, String street, String houseno, String zipcode, String city,
				List<Customer> customerList, List<Contact> contactList, List<Address> addressList, List<Account> accountList) 
		{
			// TODO Auto-generated method stub

			
			for(Customer ct : customerList)
			{
				if(ct.getFirstName()==firstname && ct.getBankName()==bankname)
				{
					System.out.println("Account allready Exists");
				}
				else
				{
					customerCount++;
				}
					Address add = new Address(street, houseno, zipcode, city, customerCount);
					
					addressList.add(add);
					
					Contact con1 = new Contact(phon, mob, email, add, customerCount);
					
					contactList.add(customerCount,con1);
				
					Customer cust1 = new Customer(firstname, lastname, bankname,contactList ,customerCount );
					customerList.add(cust1);
					
					Account newaccount = new Account(0.0, 0.0, 0, bankname, cust1, customerCount);
					accountList.add(newaccount);
				
					
				}
				
			
			}

			
			
		

		/************************************************************************/
		
		/*Deposit Amount*/

		public void deposit(String custname,  double depositamount, List<Account> accountList, String bankName,
				List<Customer> customerList) {
			System.out.println("in deposite method");
			int id = 0;
			double x=0;
			
			for(Customer ct : customerList)
			{
				if(ct.getFirstName().equals(custname) && ct.getBankName().equals(bankName)  )
				{
					
					for(Account act: accountList)
					{
						
						if(ct.getCustomerId()==act.getAccountId())
						{
							
							
							x=act.getBalance();
							x=x+depositamount;
							act.setBalance(x);
							System.out.println("Deposited: "+depositamount+" New Balance: "+act.getBalance());
						}
					}
					
					
				}
			}
			

			


		}

		/****************************************************/
		//withdraw amount
		public void withdraw(String custname,  double withdrawamount, List<Account> accountList, String bankName,
				List<Customer> customerList) {
			
	System.out.println("in withdraw method");
				int id = 0;
				double x=0;
				
				for(Customer ct : customerList)
				{
					if(ct.getFirstName().equals(custname) && ct.getBankName().equals(bankName)  )
					{
						
						for(Account act: accountList)
						{
							if(ct.getCustomerId()==act.getAccountId())
							{
								
								x=act.getBalance();
								x=x-withdrawamount;
								act.setBalance(x);
								System.out.println("Debited: "+withdrawamount+" New Balance: "+act.getBalance());
							}
						}
						
						
					}
				}
					
		}

		/*********************************************************************/
		//update customer detials
		public void updateCustomerDetails(String customerFirstName, String customerLastname, int customerId, List<Customer> customerList, List<Contact> contactList, List<Address> adddressList,
				String nfname, String nlname, long nphoneno, String nemail, String nstreet, String nhno, String nzip, String ncity) 
		{
			// TODO Auto-generated method stub
			
	
			for(Customer ct : customerList)
			{
				if(ct.getCustomerId()==customerId && ct.getFirstName()==customerFirstName && ct.getLastName()==customerLastname)
				{
					ct.setFirstName(nfname);
					ct.setLastName(nlname);
					List<Contact> c = ct.getCustomerContactDetails();
					
					for(Contact o: c)
					{
						o.setEmail(nemail);
						o.setMobile(nphoneno);
						Address address = new Address(nstreet, nhno, nzip, ncity,o.getContactId());
						o.setAddress(address);
							
						
					}
					
				}
				
			}
			
		}


		/******************************************************************/
		//delete account
		public void deleteAccount(String customerName, int customerId, String bankName, List<Customer> customerList, List<Contact> contactList,
				List<Address> addressList, List<Account> accountList) 
		{
			// TODO Auto-generated method stub
			
			
			for(Customer customer : customerList)
			{
				if(customer.getFirstName()==customerName && customer.getCustomerId()==customerId)
				{
					
					
					for(Contact contact : contactList)
					{
						if(contact.getContactId()==customerId)
						{
							
							
							for(Account act: accountList)
							{
								
								if(act.getAccountId()==customerId)
								{
									accountList.remove(act);
									customerList.remove(customer);
									contactList.remove(contact);
								}
							}
						}
						
					}
					
				}
			}
			
		}


		
		
		
	}


