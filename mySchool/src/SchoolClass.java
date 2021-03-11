import java.util.ArrayList;

public class SchoolClass {
	ArrayList<Student> studentList;
	String classRepresentative;
	String mainTeacher;

	private ArrayList<Person> myPerson;
	
	public SchoolClass() {

		myPerson = new ArrayList<Person>();
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void addPerson(Person newPerson) {
		myPerson.add(newPerson);

	}
	
	public void showPerson() {
		for (Person person : myPerson ) {
			person.display();
			System.out.println();
		}
	}
	
}
