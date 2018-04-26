import java.util.List;

public class Customer {
	String bankname;
	String firstname;
	String lastname;
	List<Contact> customercontactdetails;
	List<Bank> customerbankdetails;
	List<Account> customeraccounts;
	int bankid;
	
	
	Customer(String firstname, String lastname, String bankname,List<Contact> customercontactdetails )
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.bankname=bankname;
		//this.customerbankdetails=customerbankdetails;
		this.customercontactdetails=customercontactdetails;
		this.customeraccounts=customeraccounts;
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


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public List<Contact> getCustomercontactdetails() {
		return customercontactdetails;
	}


	public void setCustomercontactdetails(List<Contact> customercontactdetails) {
		this.customercontactdetails = customercontactdetails;
	}



	public int getBankid() {
		return bankid;
	}


	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	
	
}
