import java.util.*;

public class BinaryTree{
	
	public static Node root;
	Queue <Node> queue= new Queue<Node>

	BinaryTree(){
		this.root = null;
	}

	public void insert(String name, String id, String homeDepartment, String program, String year){
		Student newNode = new Student(name, id, homeDepartment, program, year);
		if (root == null){
			root = newNode;
			return;
		}
		Student current = root;
		Student parent = null;
		while(true){
			parent = current;
			int compare = name.compareTo(current.data);
			if( compare < 0) // name < current.data
			{
				current = current.left;
				if(current == null){
					parent.left = newNode;
					return;
				}
			}

			else
			{
				current = current.right;
				if(current == null){
					parent.right = newNode;
					return;
				}
			}
		}
	}

	public void clear(){
		root = null;
	}

	/*public boolean find(int id){
		Node current = root;
		while(current != null)
		{
			if(current.data == id)
			{
				return true;
			}
			else if(current.data > id){
				current = current.left;
			}

			else
				current = current.right;
		}
		return false;
	}*/


	public void preOrder(Student root){
		if (root == null)
			return;
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}

	public void postOrder(Student root){
		if (root == null)
			return;
		preOrder(root.left);
		preOrder(root.right);
		System.out.println(root.data);
	}

	public String minValue(Student root){
		String min = root.data;
		while(root.left != null){
			min = root.left.data;
			root = root.left;
		}
		return min;
	}

	public void delete(Student root, String key){
		root = deleteRec(root, key);

	}

	private Student deleteRec(Student root, String key)
	{
		if (root == null){
			return root;
		}
		int compare = key.compareTo(root.data);
		if (compare < 0)
			root.left = deleteRec(root.left, key);
		
		else if ( compare > 0)
			root.right = deleteRec(root.right, key);
		else{
			if (root.left == null)
			{
				return root.right;
			}
			else if(root.right == null)
			{
				return root.left;
			}
			root.data = minValue(root.right);
			root.right = deleteRec(root.right, root.data);
		}
		return root; 
	}

	public void BFS(Student root){
		if (root == null){
			return;
		}
		System.out.println(root.data);
		BFS(root.left);
		BFS(root.right);
		//q.add(root.data);
	}
	public boolean isEmpty()
	{
		return (root == null);
	}

	public void display(Student root)
	{
		if(root != null){
			display(root.left);
			System.out.println(" "+root.data);
			display(root.right);
		}
	}
}