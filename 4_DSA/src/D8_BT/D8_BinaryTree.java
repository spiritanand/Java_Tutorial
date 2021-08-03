package D8_BT;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class D8_BinaryTree {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Node root = createTree();
		preOrder(root);
		System.out.println();
		inOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
		levelOrder(root);
		System.out.println();
	}
	
	public static Node createTree() {
		Node root;
		System.out.println("Enter data:- ");
		int d = sc.nextInt();
		if (d == -1) return null;
		root = new Node(d);
		System.out.println("Enter left for " + d);
		root.left = createTree();
		System.out.println("Enter right for " + d);
		root.right = createTree();
		return root;
	}
	
	public static void preOrder(Node root) {
		if (root == null) return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void inOrder(Node root) {
		if (root == null) return;
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	public static void postOrder(Node root) {
		if (root == null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
	
	public static void levelOrder(Node root) {
		Queue<Node> q = new LinkedList<>();
		if (root == null) return;
		q.add(root);
		while (!q.isEmpty()) {
			Node curr = q.poll();
			System.out.print(curr.data + " ");
			if (curr.left != null) q.add(curr.left);
			if (curr.right != null) q.add(curr.right);
		}
	}
	
	// Returns the height of the tree(or the maximum depth of the tree)
	public static int getHeight(Node root) {
		if (root == null) {
			return -1; // This is because by convention the height of an empty tree is -1 and the leaf node
			// is 0.
		}
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		return Math.max(leftHeight, rightHeight) + 1; // The height of the root will be the maximum height
		// of the left or the right subtree plus 1.
	}
}
