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
			char[] id = new char[11];
			String lastName;
			String homeDeapartment;
			String program;
			int year; 

			while( (line = breader.readLine()) != null)
			{
				line.trim();
				operation = line.charAt(0);
				for (int i = 1; i <=7; i++){
					id[i] = line.charAt(i);
				}
				System.out.println("Id: "+ id + "operation: " + operation);
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