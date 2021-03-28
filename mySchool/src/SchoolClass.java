import java.util.ArrayList;

public class SchoolClass {
	
	ArrayList<Student> studentList;
	Person mainteacher;
	String classRepresentative;
	//String mainTeacher;
	//static ArrayList<SchoolClass> classList;
	
	public SchoolClass() {
		studentList = new ArrayList<Student>();
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void setMainTeacher(Teacher teacher) {
		this.mainteacher = teacher;
	}
	
	public void showStudents() {
		//Polymorphisms
		//Person.display acts as teacher.display
		//mainteacher.display();
		for (Student student : studentList ) {
			//Person.display acts as student.display
			//person.display();
			System.out.println("Name " + student);
			
		}
	}
	
}
