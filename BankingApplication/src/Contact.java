import java.util.List;

public class Contact {

	Long phone;
	Long mobile;
	String email;
	
	Address address;
	
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

	Contact(long phone, long mobile, String email, Address address)
	{
		this.phone=phone;
		this.mobile=mobile;
		this.email=email;
		this.address=address;
	}
}
