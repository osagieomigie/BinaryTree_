public class Node{
	Student student; // Student aStudent 
	String name;
	String id; 
	String program;
	String homeDepartment; 
	String year; 
	Node left, right;

	Node(String name, String id, String homeDepartment, String program, String year){
		//student = new Student();
		student = new Student(name, id, homeDepartment, program, year);
		this.name = name;
		this.id = id;
		this.homeDepartment = homeDepartment;
		this.program = program;
		this.year = year;
		left = right = null; 
	}
}