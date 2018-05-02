package SpringBankingApp.Model;

import java.util.List;
import java.util.Map;

public class Customer {
	int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	String bankName;
	String firstName;
	String lastName;
	public Map<Integer, Contact> customerContactDetails;
	public Map<Integer, SavingsAccount> customerAccountDetails;
	
	public Map<Integer, SavingsAccount> getCustomerAccountDetails() {
		return customerAccountDetails;
	}

	public void setCustomerAccountDetails(Map<Integer, SavingsAccount> customerAccountDetails) {
		this.customerAccountDetails = customerAccountDetails;
	}

	public Map<Integer, Contact> getCustomerContactDetails() {
		
		return customerContactDetails;
	}

	public void setCustomerContactDetails(Map<Integer, Contact> customerContactDetails) {
		this.customerContactDetails = customerContactDetails;
	}


	List<Bank> customerbankdetails;
	List<Account> customeraccounts;
	int bankid;
	
	Customer()
	{
		
	}
	
	 public Customer(String firstname, String lastname, String bankname,int id,
			 Map<Integer, Contact> customercontactdetails, Map<Integer, SavingsAccount> customeraccountdetails )
	{
		 this.id=id;
		this.firstName=firstname;
		this.lastName=lastname;
		this.bankName=bankname;
		//this.customerbankdetails=customerbankdetails;
		this.customerContactDetails=customercontactdetails;
		this.customerAccountDetails=customeraccountdetails;
	}


	public List<Bank> getCustomerbankdetails() {
		return customerbankdetails;
	}


	public void setCustomerbankdetails(List<Bank> customerbankdetails) {
		this.customerbankdetails = customerbankdetails;
	}


	public List<Account> getCustomeraccounts() {
		return customeraccounts;
	}


	public void setCustomeraccounts(List<Account> customeraccounts) {
		this.customeraccounts = customeraccounts;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastname) {
		this.lastName = lastname;
	}


	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getBankid() {
		return bankid;
	}


	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	
	
}
