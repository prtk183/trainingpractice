package SpringBankingApp.DAO;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import SpringBankingApp.Model.Account;
import SpringBankingApp.Model.Address;
import SpringBankingApp.Model.Bank;
import SpringBankingApp.Model.Contact;
import SpringBankingApp.Model.Customer;
import SpringBankingApp.Model.SavingsAccount;
import SpringBankingApp.Controller.*;

public class InitializingBean implements Transactions{
	
	public static int customerCount = 101;
	public static int accountcount = 101;

	/***********************/	
public void getCustomerDetails(Customer customer)
{
	System.out.println(customer.getFirstName()+" "+customer.getLastName() +" ");
	 
	
}

/**********************************/


public Boolean addCustomer(String firstname, String lastname, String bankname,  long phon, long mob, String email, String street,
		String houseno, String zipcode, String city, Map <Integer, Contact > customersMap, Map<Integer, SavingsAccount> accountdetails) {
	// TODO Auto-generated method stub
	
	Address add = new Address(street, houseno, zipcode, city);
	
	Contact con1 = new Contact(phon, mob, email, add);
	customerCount++;
	
	customersMap.put(customerCount,con1);
	
	Customer cust1 = new Customer(firstname, lastname, bankname, customersMap, accountdetails);
		
return true;
	}


/*************************************************************************************/
/*Create bank*/
public Bank createBank(String bankname, Map<Integer, Customer> CustomersMap, Map<Integer, Contact> ContactsMap, Map<Integer, SavingsAccount> accountdetails) {
	
	CustomersMap=null;
	ContactsMap=null;
	accountdetails=null;
	Bank bank = new Bank("prtk", CustomersMap, ContactsMap, accountdetails);
	
	return bank;
}

/********************************************************************************/
/*Create account for customer*/

public void createAccountForCustomer(String firstname, String lastname, String bankname, long phon, long mob,
		String email, String street, String houseno, String zipcode, String city, Map<Integer, Contact> customersMap,
		Map<Integer, SavingsAccount> accountdetails) {
	// TODO Auto-generated method stub

	
	Object o1= customersMap.get(firstname);
	Object o2 = accountdetails.get(firstname);
	Object o3= customersMap.get(email);
	Object o4= accountdetails.get(email);
	
	if(o1.equals(o2) && o3.equals(o4))
	{
		System.out.println("Account allready Exists");
	}
	else
	{
		Address add = new Address(street, houseno, zipcode, city);
	
		Contact con1 = new Contact(phon, mob, email, add);
		customerCount++;
	
		customersMap.put(customerCount,con1);
	
		Customer cust1 = new Customer(firstname, lastname, bankname, customersMap, accountdetails);
	
		SavingsAccount newaccount = new SavingsAccount();
	
		accountdetails.put(accountcount, newaccount);
	}

}

/************************************************************************/
/*Deposit Amount*/

public void deposit(String custname, double depositamount, Map<Integer, SavingsAccount> accountdetails, String bankname,
		Map<Integer, Customer> customerdetails) {

	int id = 0;
	int x=0;
	

	for (Map.Entry<Integer, Customer> entry : customerdetails.entrySet())
	{
		

		if(entry.getValue().getFirstName().equals(custname))
				{
				id=entry.getKey();
	
				for (Map.Entry<Integer, SavingsAccount> entry1 : accountdetails.entrySet()) 
					{
					   
						if(entry1.getKey()==id)
						{
	
						
							x=(int) entry1.getValue().getBalance();
					
							x=(int) (x+depositamount);
						
							entry1.getValue().setBalance(x);
							
							System.out.println("xxx: "+entry1.getValue().getBalance());
						}
						
					}
				
				
				}
		
	}

	


}

/****************************************************/
//withdraw amount
public void withdraw(String custname, double withdrawamount, Map<Integer, SavingsAccount> accountdetails,
		String bankname, Map<Integer, Customer> customerdetails) {
	
	int id = 0;
	int x=0;
	

	for (Map.Entry<Integer, Customer> entry : customerdetails.entrySet())
	{
		

		if(entry.getValue().getFirstName().equals(custname))
				{
				id=entry.getKey();
	
				for (Map.Entry<Integer, SavingsAccount> entry1 : accountdetails.entrySet()) 
					{
					   
						if(entry1.getKey()==id)
						{
	
						
							x=(int) entry1.getValue().getBalance();
					
							x=(int) (x-withdrawamount);
						
							entry1.getValue().setBalance(x);
							
							System.out.println("yyy: "+entry1.getValue().getBalance());
						}
						
					}
				
				
				}
		
	}
	
	
}

/*********************************************************************/
//update customer detials
public void updateCustomerDetails(String customerName, Map<Integer, Customer> customersMap,
		Map<Integer, Contact> ContactsMap) {
	// TODO Auto-generated method stub
	
	int id = 0;
	int x=0;
	

	for (Map.Entry<Integer, Customer> entry : customersMap.entrySet())
	{
		

		if(entry.getValue().getFirstName().equals(customerName))
				{
				id=entry.getKey();
	
				for (Map.Entry<Integer, Contact> entry1 : ContactsMap.entrySet()) 
					{
					   
						if(entry1.getKey()==id)
						{
	
							entry1.getValue().getAddress().setCity("newcity");
							entry1.getValue().getAddress().setHousenumber("newhousenumber");
							entry1.getValue().getAddress().setStreet("newstreet");
							entry1.getValue().getAddress().setZipcode("newzipcode");
							entry1.getValue().setEmail("newmail@gmail.com");
							entry1.getValue().setMobile(999999999L);
							entry1.getValue().setPhone(55555L);
			
						}
						
					}
				
				
				}
		
	}
	
	
	
}


/******************************************************************/
//
public void deleteAccount(String customerName, Map<Integer, Customer> customersMap, Map<Integer, Contact> ContactsMap,
		Map<Integer, Bank> BnksMap) {
	// TODO Auto-generated method stub
	
	
	int id = 0;
	int x=0;
	String bankname="";

	for (Map.Entry<Integer, Customer> entry : customersMap.entrySet())
	{
		

		if(entry.getValue().getFirstName().equals(customerName))
				{
				id=entry.getKey();
				bankname=entry.getValue().getBankName();
				for (Map.Entry<Integer, Contact> entry1 : ContactsMap.entrySet()) 
					{
					   
						if(entry1.getKey()==id)
						{
								ContactsMap.remove(id);
								customersMap.remove(id);
								for (Map.Entry<Integer, Bank> entry2 : BnksMap.entrySet())
								{

									if(entry2.getValue().getBankName().equals(bankname))
										{
											BnksMap.remove(id);	
										}

									
								}
						
						}
					}
	
				}
	}
	
}

/*********************************/







}



		


