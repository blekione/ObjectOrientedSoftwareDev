package bookTests;

public class Test {
	public static void main(String[] args) {
		new Person1().printPerson();
		new Student().printPerson();
	}
}
class Student extends Person1 {
	private String getInfo() {
		return "Student";
	}
}
class Person1 {
	private String getInfo() {
		return "Person";
	}
	public void printPerson() {
		System.out.println(getInfo());
	}
}
