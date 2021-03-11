
public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Person myPerson = new Person("Lienhart", "Thomas", "17.11.1996", "thomas@hotmail.com");
		
		//Teacher myTeacher = new Teacher("Lienhart", "Thomas", "17.11.1996", "thomas@hotmail.com");
		SchoolClass mySchoolClass = new SchoolClass();

		Student newStudent1 = new Student("Frothan", "Bismillah");
		Class Student = newStudent1.getClass();
		System.out.println("Test" + " " + Student.getName());
		Teacher newTeacher1 = new Teacher("Cheruparambil", "Christo");

		Class Teacher = newTeacher1.getClass();
		System.out.println("Test" + " " + Teacher.getName());

		mySchoolClass.addPerson(newStudent1);
		mySchoolClass.showPerson();

		mySchoolClass.addPerson(newTeacher1);
		mySchoolClass.showPerson();


		//User myUser = new User();
		//myUser.welcomeMessage();


		
		
	}

}
