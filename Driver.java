import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Driver{
	
	public static void main(String[] args){

		BinaryTree bt = new BinaryTree();
		try{
			FileReader reader = new FileReader(args[0]);
			BufferedReader breader = new BufferedReader(reader);

			String line;
			char operation;
			String [] array;
			String id;
			String lastName;
			String homeDepartment;
			String program;
			String year; 

			while( (line = breader.readLine()) != null)
			{
				array = line.split("\\s+");
				operation = line.charAt(0);
				id = array[0].substring(1,8);
				lastName = array[0].substring(8);
				homeDepartment = array[1].substring(0,4);
				program = array[1].substring(4);
				year = array[2];

				if (operation == 'I'){
					System.out.println(id);
					System.out.println(lastName);
					System.out.println(homeDepartment);
					System.out.println(program);
					System.out.println(year);
					bt.insert(lastName, id, homeDepartment, program, year);
				}
				else{
					bt.delete(bt.root, lastName);
				}
				//System.out.println(year);
			}
			reader.close();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		
		/*bt.insert(10);
		bt.insert(5);
		bt.insert(17);
		bt.insert(12);
		bt.insert(20);
		bt.insert(2);

		bt.display(bt.root);
		System.out.println("Deleting ");
		bt.delete(2);
		bt.display(bt.root);*/
	}
}