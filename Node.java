public class Node{
	Student student; // Student aStudent 
	String data; 
	Node left, right;

	Node(String name, String id, String homeDepartment, String program, String year){
		//student = new Student();
		student = new Student(name, id, homeDepartment, program, year);
		data = name;
		left = right = null; 
	}
}