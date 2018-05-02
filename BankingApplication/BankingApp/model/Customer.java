package model;

import java.util.List;

public class Customer {
	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public List<Contact> getCustomerContactDetails() {
		return customerContactDetails;
	}


	public void setCustomerContactDetails(List<Contact> customerContactDetails) {
		this.customerContactDetails = customerContactDetails;
	}


	public List<Bank> getCustomerBankDetails() {
		return customerBankDetails;
	}


	public void setCustomerBankDetails(List<Bank> customerBankDetails) {
		this.customerBankDetails = customerBankDetails;
	}


	public List<Account> getCustomerAccounts() {
		return customerAccounts;
	}


	public void setCustomerAccounts(List<Account> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}


	public int getBankId() {
		return bankId;
	}


	public void setBankId(int bankId) {
		this.bankId = bankId;
	}


	String bankName;
	String firstName;
	String lastName;
	public List<Contact> customerContactDetails;
	List<Bank> customerBankDetails;
	List<Account> customerAccounts;
	int bankId;
	int customerId;
	
	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public Customer(String firstname, String lastname, String bankname,List<Contact> customercontactdetails , int customerId)
	{
		this.customerId=customerId;
		this.firstName=firstname;
		this.lastName=lastname;
		this.bankName=bankname;
		//this.customerbankdetails=customerbankdetails;
		this.customerContactDetails=customercontactdetails;
		//this.customeraccounts=customeraccounts;
	}


	
	
}
