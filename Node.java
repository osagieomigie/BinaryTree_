public class Node{
	Student s; // Student aStudent 
	String data; 
	Node left, right;

	Node(String name, String id, String homeDepartment, String program, String year){
		s.lastName = name;
		s.id = id;
		s.homeDepartment = homeDepartment;
		s.program = program;
		s.year = year;
		data = name;
		left = right = null; 
	}
}