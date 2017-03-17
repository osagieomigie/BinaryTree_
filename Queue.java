public class Queue{
	int head;
	int tail;
	Node [] list;

	Queue(){
		list = new Node[50];
		head = -1;
		tail = -1;
	}

	public void enQueue(Node aNode){
		if(head == -1){
			head = 0;
			tail = 0;
		}
		else{
			tail = tail + 1;
		}
		list[tail] = aNode;
	}

	public Node deQueue(){
		Node temp = list[head];
		if(head == tail){
			head = -1;
			tail = -1;
		}

		else{
			head = head + 1;
		}

		return temp;
	}
}