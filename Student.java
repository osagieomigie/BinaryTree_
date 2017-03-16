public class Student{
	String lastName;
	String id; 
	String program;
	String homeDepartment; 
	String year;

	Student (String name, String id, String homeDepartment, String program, String year){
		lastName = name;
		id = id;
		homeDepartment = homeDepartment;
		program = program;
		year = year; 
	}
	
	public String toString()
	{
		String s = "";
		s = s + "lastName: "+ lastName + " Id: " + id + " program: " + program + "homeDepartment: " + homeDepartment+ " year: " + year;
		return s;
	}
}