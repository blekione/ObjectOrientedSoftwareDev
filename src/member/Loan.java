package member;

import java.time.LocalDate;

public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private LocalDate loanDate;
	private Member owner;

	public Loan() {
	}
	
	public Loan(double annualInterestRate, int numbersOfYears,
			double loanAmount, LocalDate loanDate, Member owner) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numbersOfYears;
		this.loanAmount = loanAmount;
		this.loanDate = loanDate;
		this.owner = owner;		
	}
	
	public Member getOwner() {
		return owner;
	}

	public void setOwner(Member owner) {
		this.owner = owner;
	}
	
}
