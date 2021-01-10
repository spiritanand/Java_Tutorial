/*
 The Queue ADT is similar to Stacks. The difference is that a Queue is open at both ends though we
 can insert only at one end(ENQUEUE) and remove elements from the other end(DEQUEUE). Queue follows a
 FIFO(First-In-Last-Out) methodology i.e., the first data item inserted will be accessed first.
 
 A Queue is almost like a real word queue on a single lane one way road. A Queue is useful in a
 situation where resources are being shared and we need to have scheduling.
 
 Another operation of Queue is PEEK/FRONT which returns the first data element without removing it and REAR
 gives us the last element without removing it. The methods of the Queue class we will make are isFull()
 and isEmpty() similar to Stacks.
 
 A Queue can be implemented using Arrays and Linked Lists. Here we will be implementing using Arrays.
*/

// Implementation of Queue using Arrays.
class MyQueue {
	int front;
	int rear;
	int capacity;
	double[] queueArray;
	
	// Constructor.
	public MyQueue(int capacity) {
		this.capacity = capacity;
		this.front = this.rear = -1;
		queueArray = new double[this.capacity];
	}
	
	public boolean isEmpty() {
		return ((front == -1) && (rear == -1));
	}
	
	public boolean isFull() {
		return (rear == (capacity - 1));
	}
	
	public void enqueue(double num) {
		if (isFull()) {
			return;
		} else if (isEmpty()) {
			front = 0;
			rear = 0;
		} else {
			rear++;
		}
		queueArray[rear] = num;
	}
	
	public void dequeue() {
		if (isEmpty()) {
			return;
		} else if (front == rear) {
			front = -1;
			rear = -1;
		} else {
			front++;
		}
	}
	
	// Returns the front most element of the queue without removing it.
	public double front() {
		// To ensure queue is not empty
		if (isEmpty()) {
			return Double.MIN_VALUE;
		}
		return (queueArray[front]);
	}
	
	// Returns the last element of the queue without removing it.
	public double rear() {
		// To ensure queue is not empty
		if (isEmpty()) {
			return Double.MIN_VALUE;
		}
		return (queueArray[rear]);
	}
	
	
}

// Driver code.
public class D3_QueueADT {
	public static void main(String[] args) {
		MyQueue q1 = new MyQueue(10);
		System.out.println(q1.isEmpty());
		int x = 2;
		q1.enqueue(x);
		q1.enqueue(3);
		q1.enqueue(56);
		q1.enqueue(36.12);
		q1.enqueue(7);
		q1.enqueue(14.89);
		q1.enqueue(34.90);
		System.out.println("The rear of the queue is:- " + q1.rear());
		System.out.println(q1.isFull());
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.enqueue(18.78);
		q1.enqueue(27.9);
		q1.enqueue(90.89);
		System.out.println("The front of the queue is:- " + q1.front());
	}
	
/*
I am sure this would have been fun for you, but you don't have to be a genius to spot that there is a
serious limitation of in a linear queue.

The limitation of a linear queue is that once the rear reaches the last index of the array we cannot
enqueue any more elements to the queue. We can perform as many dequeue as we like but we cannot
insert an element to the left of the front. Thus, wasting all that precious memory.

We engineers are never short of "JUGAADS". The "jugaad" we use in this case is to implement queue
using a circular array.

Jump to next code block D4_CircularQueue.java for an in-depth analysis of circular queues.
*/
}
