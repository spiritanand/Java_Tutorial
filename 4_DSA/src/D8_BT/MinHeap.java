package D8_BT;

import java.io.IOException;
import java.util.Arrays;

public class MinHeap {
	
	int[] heapArr;
	int space;
	int size = 0;
	
	public MinHeap(int space) {
		this.space = space;
		heapArr = new int[this.space];
	}
	
	public static void main(String[] args) throws IOException {
		MinHeap minHeap1 = new MinHeap(15);
		minHeap1.addItem(4);
		minHeap1.addItem(7);
		minHeap1.addItem(10);
		minHeap1.addItem(3);
		minHeap1.addItem(1);
		minHeap1.addItem(13);
		minHeap1.addItem(563);
		minHeap1.addItem(30);
		System.out.println(Arrays.toString(minHeap1.getHeapArray()));
		minHeap1.decreaseKey(5, 8);
		System.out.println(Arrays.toString(minHeap1.getHeapArray()));
		int min1 = minHeap1.extractMin();
		System.out.println("The min of the heap is:- " + min1);
		System.out.println(Arrays.toString(minHeap1.getHeapArray()));
		int min2 = minHeap1.extractMin();
		System.out.println("The min of the heap is:- " + min2);
		System.out.println(Arrays.toString(minHeap1.getHeapArray()));
	}
	
	private void ensureCapacity() {
		if (size == space) {
			heapArr = Arrays.copyOf(heapArr, space * 2);
			space *= 2;
		}
	}
	
	public int[] getHeapArray() {
		return heapArr;
	}
	
	private boolean hasParent(int index) {
		return ((index - 1) / 2) >= 0;
	}
	
	private int getParentIndex(int index) {
		return (index - 1) / 2;
		
	}
	
	private boolean hasLeftChild(int index) {
		return ((index * 2) + 1 < size);
	}
	
	private int getLeftChildIndex(int index) {
		return (index * 2) + 1;
	}
	
	private boolean hasRightChild(int index) {
		return ((index * 2) + 2 < size);
	}
	
	private int getRightChildIndex(int index) {
		return (index * 2) + 2;
	}
	
	// Also known as peek().
	public int getMin() throws IOException {
		if (size == 0) throw new IOException("No elements in the heap.");
		return heapArr[0];
	}
	
	// Also know as poll().
	public int extractMin() throws IOException {
		if (size == 0) throw new IOException("No element in the heap.");
		int minItem = heapArr[0];
		heapArr[0] = heapArr[--size];
		heapArr[size] = 0;
		heapifyDown();
		return minItem;
	}
	
	public void decreaseKey(int index, int decValue) {
		if (index > size - 1) {
			System.out.println("Not in range.");
			return;
		}
		if (decValue < 0) {
			System.out.println("Please enter +ve value.");
			return;
		}
		heapArr[index] -= decValue;
		heapifyUp(index);
	}
	
	private void swap(int index1, int index2) {
		int valIndex1 = heapArr[index1];
		heapArr[index1] = heapArr[index2];
		heapArr[index2] = valIndex1;
	}
	
	public void addItem(int val) {
		ensureCapacity();
		heapArr[size++] = val;
		heapifyUp();
	}
	
	// Checks if the last item added does not violate the binary min heap property. If violated it corrects it
	private void heapifyUp() {
		int index = size - 1;
		while ((hasParent(index)) && heapArr[getParentIndex(index)] > heapArr[index]) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}
	
	private void heapifyUp(int index) {
		while ((hasParent(index)) && heapArr[getParentIndex(index)] > heapArr[index]) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}
	
	private void heapifyDown() {
		int index = 0;
		while (hasLeftChild(index)) {
			int smallerChildIndex = getLeftChildIndex(index);
			if (hasRightChild(index) &&
					heapArr[getRightChildIndex(index)] < heapArr[getLeftChildIndex(index)])
				smallerChildIndex = getRightChildIndex(index);
			if (heapArr[index] > heapArr[smallerChildIndex]) {
				swap(index, smallerChildIndex);
			} else break;
			index = smallerChildIndex;
		}
	}
}
