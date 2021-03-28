import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
	
	
	SchoolClass mySchoolClass = new SchoolClass();
	Scanner scan = new Scanner(System.in);
	private String inputValue;
	private String inputStudent;
	private String classInput;
	Person newPerson = new Person(inputStudent);
	
	
	public void welcomeMessage() {
		System.out.println("Welcome to the school X\n");
		//System.out.println("1: Add Student");
		//System.out.println("2: Print out class with current students");
		//System.out.println("\nChoose an option(1/2) or 0 to exit:");
		
		do {
			System.out.println("1: Add Student");
			System.out.println("2: Print out class with current students");
			System.out.println("\nChoose an option(1/2) or 0 to exit:");
			inputValue = scan.nextLine();
			if(inputValue.equals("1")) {
				System.out.println("Please type in the firstname of the student (zB. Tom)");
				inputStudent = scan.nextLine();
			
				} 
			else if (inputValue.equals("2")) {
					System.out.println("");
					mySchoolClass.showStudents();
					
			}
	
			System.out.println("Do you want to coninue? (1: yes, 0: no)");
			inputValue = scan.nextLine();
			if (inputValue.equals("1")) {
				continue;
			}
			else {
				inputValue = "0";
			}
		}
		 while(!inputValue.equals("0"));
		 System.out.println("Good Bye :)");
		
	}
}
