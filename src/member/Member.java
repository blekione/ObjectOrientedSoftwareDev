package member;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Member {
	
	private long id;
	private String name;
	private LocalDate dateCreated;
	public Member supervisor;
	public Address mainAddress;
	public List<Loan> loans;
	
	public Member(Address address, Loan loan) {
		this.loans = new ArrayList<>();
		loan.setOwner(this);
		loans.add(loan);
		this.mainAddress = address;
	}
	
	public Member(Address address, long id, String name, LocalDate dateCreated, Member supervisor, 
			Loan loan) {
		this(address, loan);
		this.id = id;
		this.name = name;
		this.dateCreated = dateCreated;
		this.supervisor = supervisor;
	}
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public Address getMainAddress() {
		return mainAddress;
	}

	public List<Loan> getLoans() {
		return loans;
	}
}
