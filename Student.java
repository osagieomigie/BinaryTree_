public class Student{
	String lastName;
	String id; 
	String program;
	String homeDepartment; 
	String year;

	
	public String toString()
	{
		String s = "";
		s = s + "lastName: "+ lastName + " Id: " + id + " program: " + program + "homeDepartment: " + homeDepartment+ " year: " + year;
		return s;
	}
}