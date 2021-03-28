import java.util.Date;

public class Person {
	
	String firstName;
	String dateOfBirth;
	String email;
	
	public Person(String firstName){
		this.firstName = firstName;
	}

	public void display() {
		System.out.println("name "+ firstName);

	}
}
