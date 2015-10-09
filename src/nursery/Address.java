package nursery;

public class Address {

	private int houseNumber;
	private String street;
	private String city;
	private String postcode;
	
	public Address() {

	}
	
	public Address(int houseNumber, String street, String city, String postcode) {
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.postcode = postcode;
	}
	
	public Address getAddress() {
		return this;
	}
}
