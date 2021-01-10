/*
 A Doubly LL(DLL) is a list in which a node is linked to both the previous and next node. The head has no
 previous node hence it is linked to null. Similarly, the tail has no next node hence it is linked to null.
 The obvious benefit of using a DLL is that we can traverse in both directions. The disadvantage of using
 a DLL is that we need an extra space to hold an extra pointer for a single node compared to the singly LL.
*/

class DoublyLL {
	
	int len = 0;
	Node head;
	Node tail;
	
	public void insert(int d) {
		Node curr_node = new Node(d);
		if (head == null) {
			head = curr_node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = curr_node;
			curr_node.prev = n;
		}
		tail = curr_node;
		curr_node.next = null;
		len++;
	}
	
	public void insertAt(int index, int d) {
		Node curr_node = new Node(d);
		Node n = head;
		if (index == 0) {
			n.prev = curr_node;
			curr_node.next = head;
			head = curr_node;
		} else if (index == (len)) {
			insert(d);
			len--;
		} else {
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			curr_node.prev = n;
			curr_node.next = n.next;
			n.next = curr_node;
			n = n.next.next;
			n.prev = curr_node;
		}
		len++;
	}
	
	public void deleteAt(int index) {
		Node n = head;
		if (len == 0) {
			System.out.println("Empty List.");
			return;
		} else if (index == 0) {
			Node n1 = n.next;
			head = n1;
			n1.prev = null;
		} else if (index == (len - 1)) {
			while (n.next != null) {
				n = n.next;
			}
			Node n2 = n.prev;
			n2.next = null;
			tail = n2;
			n.prev = null;
		} else {
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			Node n3 = n.next.next;
			n.next = n.next.next;
			n3.prev = n;
		}
		len--;
	}
	
	public void traverse() {
		Node n = head;
		if (head == null) {
			System.out.println("Empty List.");
		} else {
			System.out.println("The DLL is:-");
			while (n != null) {
				System.out.print(n.data + " ");
				n = n.next;
			}
			System.out.println();
		}
	}
	
	public void revTraverse() {
		Node t = tail;
		if (head == null) {
			System.out.println("Empty List");
		} else {
			System.out.println("The DLL in reverse is:-");
			while (t != null) {
				System.out.print(t.data + " ");
				t = t.prev;
			}
			System.out.println();
		}
	}
	
	class Node {
		int data;
		Node next;
		Node prev;
		
		Node(int data) {
			this.data = data;
			next = null;
			prev = null;
		}
	}
}

// Driver Class
public class D5_DoublyLL {
	public static void main(String[] args) {
		DoublyLL dll = new DoublyLL();
		dll.insert(1);
		dll.insert(14);
		dll.insert(12);
//		dll.traverse();
		dll.insertAt(3, 45);
//		dll.traverse();
		dll.insertAt(0, 23);
//		dll.traverse();
		dll.insertAt(2, 56);
//		dll.traverse();
//		dll.revTraverse();
		dll.insert(111);
		dll.insert(1456);
		dll.insert(1992);
		dll.traverse();
		dll.deleteAt(0);
		dll.traverse();
		dll.deleteAt(7);
		dll.traverse();
		dll.deleteAt(5);
		dll.traverse();
		dll.revTraverse();
	}
}
