public class Node{
	Student s; // Student aStudent 
	String data; 
	Node left, right;

	Node(String name, int id, String homeDepartment, String program, int year){
		s.lastName = name;
		s.id = id;
		s.homeDepartment = homeDepartment;
		s.program = program;
		s.year = year;
		data = name;
		left = right = null; 
	}
}