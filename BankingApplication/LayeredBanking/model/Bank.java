package model;

import java.util.List;
public class Bank {

	private String bankname;
	int accountid;
	
	
	List<Customer> bankscustomerslist ;
	List<Account> banksaccountslist ; 
	List<Contact> bankscontactslist ; 
	
	Bank()
	{
		
	}
	
	public Bank(String bankname, List<Customer> bankscustomerslist, List<Contact> bankcontactlist)
	{
		this.bankname = bankname;
		this.bankscustomerslist= bankscustomerslist;
		//this.banksaccountslist = banksaccountslist;
		this.bankscontactslist = bankscontactslist;
	}
	


	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public List<Customer> getBankscustomerslist() {
		return bankscustomerslist;
	}

	public void setBankscustomerslist(List<Customer> bankscustomerslist) {
		this.bankscustomerslist = bankscustomerslist;
	}

	public List<Account> getBanksaccountslist() {
		return banksaccountslist;
	}

	public void setBanksaccountslist(List<Account> banksaccountslist) {
		this.banksaccountslist = banksaccountslist;
	}

	public List<Contact> getBankscontactslist() {
		return bankscontactslist;
	}

	public void setBankscontactslist(List<Contact> bankscontactslist) {
		this.bankscontactslist = bankscontactslist;
	}
}
