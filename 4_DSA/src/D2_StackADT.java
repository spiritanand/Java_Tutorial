/*
 From this section we will start out with the basics of Data Structures and Algorithms(DSA). In this code
 block we will be discussing the Stack ADT(abstract data type).

 The Stack ADT behaves pretty much like a real-world stack(a deck of cards). In a Stack we can only
 insert or remove data from the top of the stack. All operations of the Stack take place at only
 the top of the stack. This feature is also know as LIFO(Last-In-First-Out). In Stack ADT insertion
 operation in called PUSH operation and removal operation is known as POP operation. Another operation
 of the Stack ADT is the PEEK operation. In the peek operation the top data element is returned to
 the user, this is done without actually removing that data from the Stack. Other methods of the
 Stack are isFull()(checks if the stack if full) and isEmpty()(checks if stack is empty).
 
 A Stack can be implemented using an Array or Linked List.
 Here we will be seeing its implementation using array first and then its implementation using LL.
*/

// We will be creating a Stack ADT class which will have all the methods such as PUSH,POP and PEEK.
// Implementation using Arrays.
class MyStack {
	//Field Variables
	private final int maxSize;// The maximum size of our Stack.
	private final double[] stackArray;// This will be our stack. It will be in a form of an array.
	private int top;
	
	// Constructor
	public MyStack(int maxSize) {
		this.maxSize = maxSize;
		this.stackArray = new double[maxSize];
		this.top = -1;
	}
	
	public void push(double val) {
		System.out.println("Inserted " + val + " to the the stack ");
		stackArray[++top] = val;
	}
	
	public double pop() {
		double del_val = stackArray[top--];
		System.out.println("Removed " + del_val + " to the the stack ");
		return del_val;
	}
	
	public double peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == (maxSize - 1));
	}
	
}

public class D2_StackADT {
	public static void main(String[] args) {
		MyStack stack1 = new MyStack(6);
		stack1.push(50);
		stack1.push(60);
		stack1.push(70);
		stack1.push(80);
		stack1.push(90);
		stack1.push(100);
		System.out.println("The stack is full:- " + stack1.isFull());
		System.out.println("The top most element of the stack is:- " + stack1.peek());
		stack1.pop();
		System.out.println("The top most element of the stack is:- " + stack1.peek());
		System.out.println("Now entering the while loop");
		while (!stack1.isEmpty()) {
			stack1.pop();
		}
	}
}

	

