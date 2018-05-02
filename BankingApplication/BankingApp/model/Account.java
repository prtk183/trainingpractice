package model;


import java.util.*;

public class Account {


	int accountId;
	double balance;
	double interestRate;
	int interestPeriod;
	
	String bankName;
	Customer customer ;
	List<Statement> statmentList ;

	public Account(double balance ,double interestrate, int interestperiod, String bankName, Customer customer ,int accountId)
	{
		this.accountId=accountId;
		this.interestPeriod=interestperiod;
		this.interestRate=interestrate;
		this.balance=balance;
		
		this.bankName=bankName;
		//this.statmentList=statementlist;
		this.customer=customer;
	}

	
	public int getAccountId() {
		return accountId;
	}


	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
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

	public int getInterestPeriod() {
		return interestPeriod;
	}

	public void setInterestPeriod(int interestPeriod) {
		this.interestPeriod = interestPeriod;
	}



	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Statement> getStatmentList() {
		return statmentList;
	}

	public void setStatmentList(List<Statement> statmentList) {
		this.statmentList = statmentList;
	}

}
