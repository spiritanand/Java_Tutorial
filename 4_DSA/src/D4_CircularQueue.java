/*
Now circular queue is a much more than just a "jugaad", it is an efficient and elegant method to implement
queue and manage memory. A circular queue has all the same operations as a linear queue. The special
feature of a circular queue is that the index of rear moves to the next free space of memory(if
there is any) even after the rear reaches the last index . Thus, this way no empty space is left and the
memory is efficiently used.

Note:- This is only a logical way of looking at a circular array. An array is always linear and stored in
a contiguous memory block.

Now in a circular queue if the current position is "i" then the next position will be "(i+1) % capacity"
and the previous position will be "(i-1+capacity) % capacity".
This can be done as long as the array is not completely full.

Now let's see how a circular queue can be implemented using an array.
*/

class circularQueue {
	int front;
	int rear;
	int capacity;
	double[] queueArray;
	
	// Constructor.
	public circularQueue(int capacity) {
		this.capacity = capacity;
		this.front = this.rear = -1;
		queueArray = new double[this.capacity];
	}
	
	// This function will be exactly same as linear queue.
	public boolean isEmpty() {
		return ((front == -1) && (rear == -1));
	}
	
	// For circular queue the array will be considered to be full when the position after the array is front.
	public boolean isFull() {
		return ((rear + 1) % capacity == front);
	}
	
	// Making minor changes to enqueue and dequeue so that the front and rear gets incremented in a circular
	// way.
	public void enqueue(double num) {
		if (isFull()) {
			return;
		} else if (isEmpty()) {
			front = 0;
			rear = 0;
		} else {
			rear = (rear + 1) % capacity;
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
			front = (front + 1) % capacity;
		}
	}
	
	// Returns the front element of the queue without removing it.
	public double front() {
		if (isEmpty()) {
			return Double.MIN_VALUE;
		}
		return (queueArray[front]);
	}
	
	// Returns the rear element of the queue without removing it.
	public double rear() {
		if (isEmpty()) {
			return Double.MIN_VALUE;
		}
		return (queueArray[rear]);
	}
	
}

public class D4_CircularQueue {
	public static void main(String[] args) {
		circularQueue cq1 = new circularQueue(10);
		System.out.println(cq1.isEmpty());
		int x = 2;
		cq1.enqueue(x);
		cq1.enqueue(3);
		cq1.enqueue(56);
		cq1.enqueue(36.12);
		cq1.enqueue(7);
		cq1.enqueue(14.89);
		cq1.enqueue(34.90);
		System.out.println("The rear of the queue is:- " + cq1.rear());
		System.out.println(cq1.isFull());
		cq1.dequeue();
		cq1.dequeue();
		cq1.dequeue();
		cq1.dequeue();
		cq1.enqueue(18.78);
		cq1.enqueue(27.9);
		cq1.enqueue(90.89);
		System.out.println("The front of the queue is:- " + cq1.front());
		cq1.enqueue(18.78);
		cq1.enqueue(27.9);
		cq1.enqueue(90.89);
		System.out.println("The rear of the queue is:- " + cq1.rear());
		cq1.enqueue(170.89);
		System.out.println(cq1.isFull());
		cq1.enqueue(17.69); // This element wont be added as the queue is full.
		System.out.println("The rear of the queue is:- " + cq1.rear());
		
		
	}
}
