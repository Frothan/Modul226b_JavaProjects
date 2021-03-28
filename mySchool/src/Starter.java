
public class Starter {

	public static void main(String[] args) {
		
		

		// TODO Auto-generated method stub
		
		//Person myPerson = new Person("Lienhart", "Thomas", "17.11.1996", "thomas@hotmail.com");
		
		Teacher myTeacher = new Teacher("Thomas");
		SchoolClass mySchoolClass = new SchoolClass();

		Student newStudent1 = new Student("Bismillah");
		Student newStudent2 = new Student("Malaka");
		mySchoolClass.addStudent(newStudent1);
		mySchoolClass.addStudent(newStudent2);
		mySchoolClass.setMainTeacher(myTeacher);
		
		
		/*
		Class Student = newStudent1.getClass();
		
		System.out.println("Test" + " " + Student.getName());
		Teacher newTeacher1 = new Teacher("Cheruparambil", "Christo");

		Class Teacher = newTeacher1.getClass();
		System.out.println("Test" + " " + Teacher.getName());
		*/


		//test christo
		User myUser = new User();
		myUser.welcomeMessage();

//a
		
		
	}

}
