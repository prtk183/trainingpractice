package model;


public class Address {



	String street;
	String houseNumber;
	String zipcode;
	public String city;
	int addressId;
	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public Address(String street, String housenumber, String zipcode, String city, int addressId)
	{
		this.addressId=addressId;
		this.city=city;
		this.houseNumber=housenumber;
		this.zipcode=zipcode;
		this.street=street;
		
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
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
