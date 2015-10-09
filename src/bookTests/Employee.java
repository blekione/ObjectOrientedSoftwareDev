package bookTests;

public class Employee extends Person {

	public Employee() {
		this("(2) invoke Employee's overloaded constructor");
		System.out.println("(3) performs Employee tasks");
	}

	public Employee(String string) {
		super("test test test");
		System.out.println(string);
	}
}
