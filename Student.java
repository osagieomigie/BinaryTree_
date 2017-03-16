public class Student{
	String lastName;
	String id; 
	String program;
	String homeDepartment; 
	String year;
	String data; 
	Student left, right;

	Student (String name, String id, String homeDepartment, String program, String year){
		lastName = name;
		id = id;
		homeDepartment = homeDepartment;
		program = program;
		year = year; 
		data = name;
		left = right = null;
	}
	
	public String toString()
	{
		String s = "";
		s = s + "lastName: "+ lastName + " Id: " + id + " program: " + program + "homeDepartment: " + homeDepartment+ " year: " + year;
		return s;
	}
}