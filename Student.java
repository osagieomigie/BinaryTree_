public class Student{
	String lastName;
	int id; 
	String program;
	String homeDepartment; 
	int year;

	public String toString()
	{
		String s = "";
		s = s + "lastName: "+ lastName + " Id: " + id + " program: " + program + "homeDepartment: " + homeDepartment+ " year: " + year;
		return s;
	}
}