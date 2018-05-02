package SpringBankingApp.Model;

import java.util.List;
import java.util.Map;
public class Bank {

	private String bankName;
	int accountId;
	
	Map<Integer, Customer> customersMap;
	Map<Integer, Contact> contactsMap;
	Map<Integer, SavingsAccount> accountsMap;
	
	public Map<Integer, SavingsAccount> getAccountsMap() {
		return accountsMap;
	}

	public void setAccountsMap(Map<Integer, SavingsAccount> accountsMap) {
		this.accountsMap = accountsMap;
	}

	private Object banksContactsList;

	
	Bank()
	{
		
	}
	
	public Bank(String bankname, Map<Integer, Customer> customersMap, Map<Integer, Contact> contactsMap, Map<Integer, SavingsAccount> accountsMap)
	{
		this.bankName = bankname;
		this.customersMap= customersMap;
		this.accountsMap=accountsMap;
		this.contactsMap=contactsMap;
	}
	


	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankname) {
		this.bankName = bankname;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public Map<Integer, Customer> getCustomersMap() {
		return customersMap;
	}

	public void setCustomersMap(Map<Integer, Customer> customersMap) {
		this.customersMap = customersMap;
	}

	public Map<Integer, Contact> getContactsMap() {
		return contactsMap;
	}

	public void setContactsMap(Map<Integer, Contact> contactsMap) {
		this.contactsMap = contactsMap;
	}

	
}
