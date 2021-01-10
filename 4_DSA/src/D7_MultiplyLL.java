// In this code-block we will be seeing an application of the LL. We will see how we can multiply two
// polynomials which will be inputted by the user. The resulted will be printed by this program. Here we
// will be implementing a LL which will store the value of the coefficient, the power of the variable and
// the address of the next node.

import java.util.Scanner;

class LL {
	Node head;
	
	public void insert(int cof, int power) {
		Node curr_node = new Node(cof, power);
		if (head == null) {
			head = curr_node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = curr_node;
		}
	}
	
	public void traverse() {
		Node n = head;
		while (n.next != null) {
			System.out.print(n.cof + "x^" + n.power + " + ");
			n = n.next;
		}
		System.out.print(n.cof);
	}
	
	class Node {
		Node next;
		int cof, power;
		
		Node(int cof, int power) {
			this.cof = cof;
			this.power = power;
			next = null;
		}
	}
}

public class D7_MultiplyLL {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LL pol1 = new LL();
		LL pol2 = new LL();
		System.out.println("Enter the maximum value of the power in the first polynomial");
		int p1 = scanner.nextInt();
		System.out.println("Now for the first polynomial,");
		for (int i = p1; i >= 0; i--) {
			System.out.println("Enter the coefficient for degree " + i);
			int data = scanner.nextInt();
			pol1.insert(data, i);
		}
		System.out.println("Enter the maximum value of the power in the second polynomial");
		int p2 = scanner.nextInt();
		System.out.println("Now for the second polynomial,");
		for (int i = p2; i >= 0; i--) {
			System.out.println("Enter the coefficient for degree " + i);
			int data = scanner.nextInt();
			pol2.insert(data, i);
		}
		multiplyLL(pol1, pol2).traverse();
	}
	
	public static LL multiplyLL(LL pol1, LL pol2) {
		LL pol3 = new LL();
		int mp1 = pol1.head.power; // Max power of polynomial 1.
		int mp2 = pol2.head.power; // Max power of polynomial 2.
		LL.Node n1 = pol1.head;
		LL.Node n2 = pol2.head;
		for (int i = mp1; i >= 0; i--) {
			for (int j = mp2; j >= 0; j--) {
				int cof = n1.cof * n2.cof;
				int power = n1.power + n2.power;
				pol3.insert(cof, power);
				n2 = n2.next;
			}
			n2 = pol2.head;
			n1 = n1.next;
		}
		pol3 = removeDuplicate(pol3);
		return pol3;
	}
	
	public static LL removeDuplicate(LL pol3) {
		LL.Node n1 = pol3.head;
		while (n1.next != null) {
			LL.Node n2 = n1;
			while (n2.next != null) {
				if (n1.power == n2.next.power) {
					n1.cof = n1.cof + n2.next.cof;
					n2.next = n2.next.next;
				} else {
					n2 = n2.next;
				}
			}
			n1 = n1.next;
		}
		return pol3;
	}
}
