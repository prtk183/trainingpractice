
public class Address {

	String street;
	String housenumber;
	String zipcode;
	String city;
	
	Address(String street, String housenumber, String zipcode, String city)
	{
		this.city=city;
		this.housenumber=housenumber;
		this.zipcode=zipcode;
		this.street=street;
		
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
