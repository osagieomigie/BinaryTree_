import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
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
					bt.insert(lastName, id, homeDepartment, program, year);
				}
				else{
					bt.delete(bt.root, lastName);
				}
			}
			reader.close();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println(bt.display(bt.root));

		/*try{
        	FileWriter writer = new FileWriter(args[1], true);
        	BufferedWriter bufferedWriter = new BufferedWriter(writer);

        	for (int i = 1; i < buckets.length; i++){
        		Node current = buckets[i].head;
    			while (current != null) {
    				bufferedWriter.write(current.data);	
    				bufferedWriter.write("\t");
    				bufferedWriter.newLine();
            		current = current.next; 
            		//incre++;
        		}
        		bufferedWriter.write(" ");
        	}
   		}  

        catch (IOException e)
		{
			e.printStackTrace();
		}*/
	}
}