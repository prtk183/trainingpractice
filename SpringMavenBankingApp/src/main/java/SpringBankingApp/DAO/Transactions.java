package SpringBankingApp.DAO;

import java.util.Map;

import SpringBankingApp.Model.Bank;
import SpringBankingApp.Model.Contact;
import SpringBankingApp.Model.Customer;
import SpringBankingApp.Model.SavingsAccount;

public interface Transactions {

	public void getCustomerDetails(Customer customer);
	
	public Object createBank(String bankname, Map<Integer, Customer> CustomerMAp, Map<Integer, Contact > ContactMap, Map<Integer, SavingsAccount> accountsMap, Map<Integer, Bank>BanksMap);
	
	public Boolean addCustomer(String firstname, String lastname, String bankname, long phon, long mob, String email, 
			String street, String houseno, String zipcode, String city, Map<Integer, Contact> customersMap, Map<Integer, SavingsAccount> accountdetails);
	
	public void createAccountForCustomer(String firstname, String lastname, String bankname, long phon, long mob, String email, 
			String street, String houseno, String zipcode, String city, Map<Integer, Contact> customersMap, Map<Integer, SavingsAccount> accountdetails);
	
	
	public void deposit(String custname, double depositamount, Map<Integer, SavingsAccount> accountdetails, String bankname, Map<Integer, Customer> customerdetails);
	
	public void withdraw(String custname, double withdrawamount, Map<Integer, SavingsAccount> accountdetails, String bankname, Map<Integer, Customer> customerdetails);
	
	
	public void updateCustomerDetails(String customerName, Map<Integer, Customer> customersMap, Map<Integer, Contact> ContactsMap);
	
	public void deleteAccount(String customerName, Map<Integer, Customer> customersMap, Map<Integer, Contact> ContactsMap, Map<Integer, Bank> BnksMap );
	
	
}
