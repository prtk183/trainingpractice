package SpringBankingApp.Model;


public class Address {
	int id;
	String street;
	String housenumber;
	String zipcode;
	public String city;
	
	Address()
	{
}

	 public Address(String street, String housenumber, String zipcode, String city,int id)
	{
		 this.id=id;
		this.city=city;
		this.housenumber=housenumber;
		this.zipcode=zipcode;
		this.street=street;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
