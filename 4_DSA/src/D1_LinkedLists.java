/*
 Linked List(LL) is a linear data structure similar to arrays, but they are not stored in contiguous
 blocks of memory instead they are linked using reference(pointers).
 
 LL does not require a specific upper limit(of size) to be inputted. Also, elements of LL can be
 easily manipulated i.e, it is very easy to insert or delete elements from a LL. The elements of LL
 are called nodes. A node has two parts, the data value and a pointer that points to the next node.
 The first node is called Head. The last node is called the Tail and it points to Null.
 
 One of the biggest drawbacks of a LL is that we cannot access elements randomly.
 Also, extra memory is used in saving the pointer values.
 
 Here we will be seeing how to perform operations such as insertion(anywhere in the LL), deletion(by position
 and key) and traversal on the LL.
 
 
 Note:- Here we have talked about "Singly LL".
*/

// The class which will contain the LL.
class LinkedList {
	
	// Creating the node head which will by default be initialized as null. The head will be null as long
	// as the list is empty.
	Node head;
	
	// Creating the insert method which will by default insert elements at the tail of the element.
	public void insert(int d) {
		// Creating a new node to store the value.
		Node curr_node = new Node(d);
		
		// Checking if the list is empty.
		if (this.head == null) {
			// If the list is empty we make the current node the head of the list.
			this.head = curr_node;
		} else {
			// If the list is not empty we traverse to the last node and change it's next to point towards
			// the current node.
			Node last = this.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = curr_node;
		}
	}
	
	// Method to insert node at the start.
	private void insertAtStart(int d) {
		// Creating a new node to store the value.
		Node curr_node = new Node(d);
		
		// Checking if the list is empty.
		if (this.head == null) {
			// If the list is empty we make the current node the head of the list.
			this.head = curr_node;
			curr_node.next = null;
		} else {
			curr_node.next = this.head;
			this.head = curr_node;
		}
	}
	
	// Method to insert node at any given index(starting from index 0).
	public void insertAt(int index, int data) {
		Node curr_node = new Node(data);
		Node tmp = head;
		if (index == 0) {
			insertAtStart(data);
		} else {
			for (int i = 0; i < index - 1; i++) {
				tmp = tmp.next;
			}
			curr_node.next = tmp.next;
			tmp.next = curr_node;
		}
	}
	
	// Creating a method to print the list.
	public void traverse() {
		if (this.head == null) {
			System.out.println("Empty List");
		} else {
			System.out.println("The LL is:-");
			Node last = head;
			while (last != null){
				System.out.print(last.data + " ");
				last = last.next;
			}
			System.out.println();
		}
	}
	
	// Method to delete at the index preferred.
	public void deleteAt(int index) {
		Node tmp = this.head;
		//Checking for empty list.
		if (this.head == null) {
			System.out.println("Empty List.");
		}
		//  Checking if only one element in the list.
		else if (tmp.next == null) {
			head = null;
		}
		// When index is zero all we need to do is change the reference of the head of the list.
		else if(index==0){
			head = tmp.next;
		}else{
			for (int i = 0; i < index - 1; i++) {
				tmp = tmp.next;
			}
			tmp.next = tmp.next.next;
		}
	}
	
	// Creating the node class. A node object will store the
	class Node {
		int data;
		// Creating a reference to the next node. This node will be by default set to null.
		Node next;
		
		// Constructor which will set values of a Node object.
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
}

// Driver Code
public class D1_LinkedLists {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(12);
		ll.insert(2);
		ll.insert(312);
		ll.insertAt(2, 99);
		ll.traverse();
		ll.deleteAt(2);
		ll.traverse();
		ll.deleteAt(0);
		ll.traverse();
	}
}
