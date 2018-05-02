package model;

import java.util.List;
public class Bank {

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	private String bankName;
	int accountId;
	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	int bankId;
	
	List<Bank> banksList;
	
	public Bank()
	{
		
	}
	
	public Bank(String bankname, List<Bank> banksList,  int bankId)
	{
		this.bankId=bankId;
		this.bankName = bankname;
		this.banksList=banksList;
	}

	public List<Bank> getBanksList() {
		return banksList;
	}

	public void setBanksList(List<Bank> banksList) {
		this.banksList = banksList;
	}
	


	
}
