package SpringBankingApp.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringBankingApp.DAO.DAOTransactionImpl;
import SpringBankingApp.Model.Account;
import SpringBankingApp.Model.Address;
import SpringBankingApp.Model.Bank;
import SpringBankingApp.Model.Contact;
import SpringBankingApp.Model.Customer;
import SpringBankingApp.Model.SavingsAccount;
import SpringBankingApp.Model.Statement;

public class OperatingMain extends DAOTransactionImpl {
	public static int i=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("BankConfig.xml");
   	 
		OperatingMain op1 = new OperatingMain();
	
		Bank SBI = (Bank) context.getBean("SBI", SpringBankingApp.Model.Bank.class);				//@bank2customer-->many to many[4]
		Bank Axix =(Bank) context.getBean("AXIX", SpringBankingApp.Model.Bank.class);
		

/*BanksMap*/
		Map<Integer, Bank> BanksMap = new HashMap<Integer, Bank>();
		BanksMap.put(1, Axix);
		BanksMap.put(2, SBI);
		
	
		/**creating address*******/
		Address pgaddress= new Address("Pandurang nagar","47","444709","Bangalore",100);			//Customer address
		Address kpgaddress= new Address("Dada nagar","74","444108","Mangalore",101);

		
 
		
		//contact2address--> one to one relationship
		Contact pg1contactdetails = new Contact(568495,9421826025L,"www.pg@gmial.com",pgaddress,100);
		//Contact pg2contactdetails = new Contact(568495,7421826025L,"www.pg@gmial.com",pgaddress); // Customer contact details
		Contact kpgcontactdetails = new Contact(965846,7517356958L,"www.kpg@yahoo.com",kpgaddress,101);
	
		
//		List <Contact> pgcontactdetails = new ArrayList<Contact>();				//@[1]many to many,
//		pgcontactdetails.add(pg1contactdetails);								//customer can have more than one mobile num
//		//pgcontactdetails.add(pg2contactdetails);
//		
//		List <Contact> kpgcontactdetailslist = new ArrayList<Contact>();
//		kpgcontactdetailslist.add(kpgcontactdetails);
//		


/*contactsMap*/
		 Map<Integer,Contact> contactsMap=new HashMap<Integer,Contact>();
		 
		 
		 contactsMap.put(100,pg1contactdetails);
		 contactsMap.put(101,kpgcontactdetails);
				 
		Customer customer1 = context.getBean("customer1", Customer.class);
		Customer customer2 = context.getBean("customer2", Customer.class);
		
		Map<Integer, Contact> contactsForCust1= new HashMap<>();
		
		
		customer1.setCustomerContactDetails(contactsForCust1);
		
/*customerMap*/
		Map<Integer, Customer> customersMap = new HashMap<Integer, Customer>();
		customersMap.put(100, customer1);
		customersMap.put(101, customer2);
		
		
		
		//@bank2contact--> many to many[3]
		List <Customer> sbi_customer = new ArrayList<Customer>();
		sbi_customer.add(customer1);
		
		List <Customer> axix_customer = new ArrayList<Customer>();
		axix_customer.add(customer2);
		
		List <Contact> sbi_contacts = new ArrayList<Contact>();
		sbi_contacts.add(pg1contactdetails);
		//sbi_contacts.add(pg2contactdetails);
		
		List <Contact> axix_contacts = new ArrayList<Contact>();
		axix_contacts.add(kpgcontactdetails);

		
		//Statement statement = (Statement) context.getBean("statement", SpringBankingApp.Model.Statement.class);
		
		SavingsAccount account1 = (SavingsAccount) context.getBean("account1", SpringBankingApp.Model.SavingsAccount.class);
		SavingsAccount account2 = (SavingsAccount) context.getBean("account2", SpringBankingApp.Model.SavingsAccount.class);
/*account map*/		
	Map<Integer, SavingsAccount> accountsMap = new HashMap<Integer, SavingsAccount>();
	accountsMap.put(100,account1);
	accountsMap.put(101,account2);
		
	
	//all the operations:
	
		//op1.getCustomerDetails(customer1);
	
		//@adding customer
		
		boolean flag;
		flag = op1.addCustomer("Shiv", "Shankar", "SBI",
				584688, 123456789L, "shivsahnkar@gmail.com", 
				"ramdas road", "574ll", "447588", "Amaravati", contactsMap, accountsMap);
		
		System.out.println("added : " +flag);
		
		
		//@create bank
		Object o;
		o=op1.createBank("prtk", customersMap, contactsMap, accountsMap, BanksMap);
		
		BanksMap.put(i,(Bank) o);
		
/*
		//@create account for customer
		op1.createAccountForCustomer("Reteek", "Shankar", "SBI",
				584688, 123456789L, "shivajisahnkar@gmail.com", 
				"ramdas road", "574ll", "447588", "Amaravati", contactsMap, accountsMap);

*/		
		//@Deposit Amount
		
		op1.deposit("kPrateek", 1000, accountsMap, "SBI", customersMap);
		
		
		//@Withdraw Amount
		op1.withdraw("kPrateek", 1000, accountsMap, "SBI", customersMap);
		
		
		//@update customer
		op1.getCustomerDetails(customer2);
		op1.updateCustomerDetails("kPrateek", customersMap, contactsMap);
		op1.getCustomerDetails(customer2);
		
		//@Delete cutsomer
		//op1.deleteAccount("kPrateek", customersMap, contactsMap, BanksMap);
	}

}
