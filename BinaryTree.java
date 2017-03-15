//import java.util.list

public class BinaryTree{
	
	public static Node root;
	//Queue <Student> = new Queue<student>

	BinaryTree(){
		this.root = null;
	}

	public void insert(String name, int id, String homeDepartment, String program, int year){
		Node newNode = new Node(name, id, homeDepartment, program, year);
		if (root == null){
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if(name.compareTo(current.data) == -1) // name < current.data
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
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}

	public void postOrder(Node root){
		if (root == null)
			return;
		preOrder(root.left);
		preOrder(root.right);
		System.out.println(root.data);
	}

	public String minValue(Node root){
		String min = root.data;
		while(root.left != null){
			min = root.left.data;
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
		if (key.compareTo(root.data) == -1)
			root.left = deleteRec(root.left, key);
		else if (key.compareTo(root.data) == 1)
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

	public void BFS(Node root){
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

	public void display(Node root)
	{
		if(root != null){
			display(root.left);
			System.out.println(" "+root.data);
			display(root.right);
		}
	}
}