package member;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class TestMember {

	public static void main(String[] args) {
		 Address memberAddress1 = new Address();
		 LocalDate loanDate1 = LocalDate.now(); 
		 //Loan memberLoan1 = new Loan(4.0, 10, 1000.0, loanDate1, null);
		 Member member1 = new Member(
				 memberAddress1,
				 1, 
				 "Andrew Foster",
				 LocalDate.now(),
				 null,
				 // composition, no reference to Loan outside of Member object
				 new Loan(4.0, 10, 1000.0, loanDate1, null)); 
		 
		 
		 System.out.println(member1.getName() + " with ID: " + member1.getId() + "\nliving on address:\n"
		 + member1.getMainAddress() + "\ntook loans:" );
		 for (Loan loan : member1.getLoans()) {
			 System.out.println(loan);
		 }
	}

}
