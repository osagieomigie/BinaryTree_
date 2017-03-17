import java.util.*;

public class BinaryTree{
	
	public static Node root;
	Queue queue;

	BinaryTree(){
		this.root = null;
	}

	public void insert(String name, String id, String homeDepartment, String program, String year){
		Node newNode = new Node(name, id, homeDepartment, program, year);
		if (root == null){
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			int compare = name.compareTo(current.name);
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


	public void preOrder(Node root){
		if (root == null)
			return;
		System.out.println(root.name);
		preOrder(root.left);
		preOrder(root.right);
	}

	public void postOrder(Node root){
		if (root == null)
			return;
		preOrder(root.left);
		preOrder(root.right);
		System.out.println(root.name);
	}

	public String minValue(Node root){
		String min = root.name;
		while(root.left != null){
			min = root.left.name;
			root = root.left;
		}
		return min;
	}

	public void delete(Node root, String key){
		root = deleteRec(root, key);

	}

	private Node deleteRec(Node root, String key)
	{
		if (root == null){
			return root;
		}
		int compare = key.compareTo(root.name);
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
			root.name = minValue(root.right);
			root.right = deleteRec(root.right, root.name);
		}
		return root; 
	}

	public void breathFirst(Node root){
		queue = new Queue();
		queue.enQueue(root);
		while(queue.head != -1){
			Node aNode = queue.deQueue();
			System.out.println(aNode.name);
			if (aNode.left != null){
				queue.enQueue(aNode.left);
			}
			if (aNode.right != null) {
				queue.enQueue(aNode.right);	
			}
		}
	}
	
	public boolean isEmpty()
	{
		return (root == null);
	}

	public String inOrder(Node root)
	{
		StringBuilder s = new StringBuilder();
		String leftString = "";
		String rightString = "";
		String rootString = "";
		if(root != null){
			
			leftString = inOrder(root.left);
			rootString = root.name + " " + root.id + " " + root.homeDepartment + " " + root.program + " " + root.year;
			rightString = inOrder(root.right);
		}
		s.append(leftString);
		s.append(rootString);
		s.append(System.lineSeparator());
		s.append(rightString);

		return s.toString();
	}
}