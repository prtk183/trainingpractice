package SpringBankingApp.Model;

import java.util.Map;

public class Contact {

	@Override
	public String toString() {
		return "Contact [phone=" + phone + ", mobile=" + mobile + ", email=" + email + ", id=" + id + ", address="
				+ address + "]";
	}

	Long phone;
	Long mobile;
	String email;
	int id;
	Address address;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	Contact()
	{
		
	}
	//public Map<Integer, Address> address;
	
	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Contact(long phone, long mobile, String email, Address address, int id)
	{
		this.id=id;
		this.phone=phone;
		this.mobile=mobile;
		this.email=email;
		this.address=address;
	}
}
