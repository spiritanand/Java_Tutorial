/*
 A Circular LL(CLL) is a LL where all the nodes are connected to form a closed loop. Null value is not
 assigned to the end of the list. We can have a CLL of a singly LL or even a doubly LL.
 
 The advantage of using a CLL is that we can traverse the whole list from any node we wish. This makes it
 really useful.
 
 A real life ubiquitous example of the CLL would be in our smartphones. Here all our running apps are
 stored in a CLL.
 
 Note:- Here we will be talking about singly CLL.
*/


class CircularLL {
	
	// Keeping track of the length of the CLL.
	int len = 0;
	
	// Keeping track of the first and the last element of the CLL which are supposed to be linked in order
	// to form a closed loop.
	Node head;
	Node tail;
	
	public void insert(int d) {
		Node curr_node = new Node(d);
		if (head == null) {
			head = curr_node;
			tail = curr_node;
		} else {
			tail = curr_node;
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = curr_node;
		}
		len++;
	}
	
	public void insertAt(int index, int d) {
		Node curr_node = new Node(d);
		if (index == 0) {
			if (len == 0) {
				tail = curr_node;
				head = curr_node;
			} else {
				curr_node.next = head;
				head = curr_node;
				tail.next = curr_node;
			}
		} else if(index == (len)){
			insert(d);
			len--;
		}else {
			Node n = head;
			for (int i =0;i<index-1;i++){
				n = n.next;
			}
			curr_node.next = n.next;
			n.next=curr_node;
		}
		len++;
	}
	
	public void deleteAt(int index) {
		Node tmp = this.head;
		if (this.head == null) {
			System.out.println("Empty List.");
			len++;
		} else if (index == 0) {
			tail.next = head.next;
			head = head.next;
		} else {
			for (int i = 0; i < index - 1; i++) {
				tmp = tmp.next;
			}
			if (index == (len - 1)) {
				tail = tmp;
				tmp.next = head;
			} else {
				tmp.next = tmp.next.next;
			}
		}
		len--;
	}
	
	public void traverse() {
		Node last = head;
		if (head == null) {
			System.out.println("Empty List");
		} else {
			System.out.println("The CLL is:-");
			for (int i = 0; i < len; i++) {
				System.out.print(last.data + " ");
				if (last.next == head) {
					break;
				}
				last = last.next;
			}
			System.out.println();
		}
	}
	
	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
}

// Driver Class
public class D6_CircularLL {
	public static void main(String[] args) {
		CircularLL cll = new CircularLL();
		cll.insert(20);
		cll.insert(230);
		cll.insert(210);
		cll.insert(204);
		cll.insertAt(3, 12);
		cll.insert(45);
		cll.insertAt(0, 24);
		cll.traverse();
		cll.deleteAt(0);
		cll.traverse();
		cll.deleteAt(5);
		cll.traverse();
		cll.deleteAt(2);
		cll.traverse();
		
	}
}
