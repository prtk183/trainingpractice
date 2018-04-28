package SpringBankingApp.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SavingsAccount {

	 double balance;
	 double interestRate;
	double interestPeriod;
	Map<Integer, Customer> customerMap = new HashMap<Integer, Customer>();
	Map<Integer, Bank> bankMap = new HashMap<Integer, Bank>();
	
	public SavingsAccount()
	{
		
	}
	
	SavingsAccount(double balance, double interestRate, double interestPeriod, Map<Integer, Customer> customerlist, Map<Integer, Bank> banklist)
	{
		//super();
		this.balance=balance;
		this.interestRate=interestRate;
		this.interestPeriod=interestPeriod;
		this.customerMap=customerlist;
		this.bankMap=banklist;
	
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestPeriod() {
		return interestPeriod;
	}

	public void setInterestPeriod(double interestPeriod) {
		this.interestPeriod = interestPeriod;
	}

	public Map<Integer, Customer> getCustomerMap() {
		return customerMap;
	}

	public void setCustomerMap(Map<Integer, Customer> customerMap) {
		this.customerMap = customerMap;
	}

	public Map<Integer, Bank> getBankMap() {
		return bankMap;
	}

	public void setBankMap(Map<Integer, Bank> bankMap) {
		this.bankMap = bankMap;
	}



}
