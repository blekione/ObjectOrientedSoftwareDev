package bookTests;

public class Faculty extends Employee {
	public static void main(String[] args) {
		new Faculty();
		Employee employee = new Employee();
		
		if(employee instanceof Person)
			System.out.println("true");
	}
	
	public Faculty() {
		System.out.println("(4) Performs faculty tasks");
	}
}
