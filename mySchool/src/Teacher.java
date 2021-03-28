import java.util.Date;

public class Teacher extends Person{
	String roomnumber;
	
	public Teacher(String firstName){
		super(firstName);
		roomnumber = "17";
	}
	
	public void display() {
		
		System.out.println("Teacher " + firstName);
		
	}
	
}
