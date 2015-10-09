package nursery;

import java.time.LocalDate;

public class Child {
	
	private String name;
	private LocalDate dob;
	private Address address;
	private boolean status;
	
	public Child(String name, LocalDate dob, Address address, boolean status) {
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.status = status;
	}
	
	public boolean checkStatus() {
		return status;
	}

}
