import java.util.Date;

public class Person {
	String name;
	String firstName;
	String dateOfBirth;
	String email;
	// second commit
	public Person(String name, String firstName){
		this.name = name;
		this.firstName = firstName;
	}

	public void display() {
		System.out.println("name " + name + " " + firstName);
		System.out.println();

	}
}
