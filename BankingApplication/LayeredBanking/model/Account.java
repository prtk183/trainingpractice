package model;


import java.util.*;

public class Account {

	long balance;
	double interestrate;
	int interestperiod;
	
	Bank bankname;
	Customer customer ;
	List<Statement> statmentlist ;

	public Account(long balance ,double interestrate, int interestperiod, List<Statement> statementlist, Bank bank, Customer customer )
	{
		this.interestperiod=interestperiod;
		this.interestrate=interestrate;
		this.balance=balance;
		
		this.bankname=bank;
		this.statmentlist=statementlist;
		this.customer=customer;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public double getInterestrate() {
		return interestrate;
	}

	public void setInterestrate(double interestrate) {
		this.interestrate = interestrate;
	}

	public int getInterestperiod() {
		return interestperiod;
	}

	public void setInterestperiod(int interestperiod) {
		this.interestperiod = interestperiod;
	}

	public Bank getBankname() {
		return bankname;
	}

	public void setBankname(Bank bankname) {
		this.bankname = bankname;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Statement> getStatmentlist() {
		return statmentlist;
	}

	public void setStatmentlist(List<Statement> statmentlist) {
		this.statmentlist = statmentlist;
	}



}
