package D8_BT;

// BST - Binary Search Tree
public class BST {
	
	Node root;
	
	BST(int rootData) {
		Node newNode = new Node(rootData);
		this.root = newNode;
	}
	
	public static void main(String[] args) {
		BST bst = new BST(7);
		bst.addNodeBST_Rec(bst.root, 3);
		bst.addNodeBST_Rec(bst.root, 1);
		bst.addNodeBST_Rec(bst.root, 6);
		bst.addNodeBST_Rec(bst.root, 5);
		bst.addNodeBST_Rec(bst.root, 10);
		bst.addNodeBST_Rec(bst.root, 9);
		bst.addNodeBST_Rec(bst.root, 8);
		bst.addNodeBST_Rec(bst.root, 12);
		bst.addNodeBST_Rec(bst.root, 11);
		D8_BinaryTree.inOrder(bst.root); // For sorted output.
		System.out.println();
		D8_BinaryTree.levelOrder(bst.root);
		System.out.println();
		int toFind = 1;
//		System.out.println("Is "+toFind+" in the BST - "+bst.searchValue(toFind));
		Node found = bst.toFindRec(bst.root, toFind);
		boolean hasFound = true;
		if (found == null) hasFound = false;
		System.out.println("Is " + toFind + " in the BST -> " + hasFound);
		System.out.println("The height of this BST is - " + D8_BinaryTree.getHeight(bst.root)); // 3 for this
		// case
//		int toDel1 = 6;
//		bst.deleteNode(bst.root, toDel1);
//		D8_BinaryTree.inOrder(bst.root);
//		System.out.println();
		D8_BinaryTree.levelOrder(bst.root);
		System.out.println();
//		int toDel2 = 12;
//		bst.deleteNode(bst.root, toDel2);
//		D8_BinaryTree.inOrder(bst.root);
//		System.out.println();
		int toDel3 = 7;
		bst.deleteNode(bst.root, toDel3);
		D8_BinaryTree.levelOrder(bst.root);
		System.out.println();
	}

//	// To insert a node in the BST
//	public void addNodeBST(int data) {
//		Node newNode = new Node(data);
//		Node parent = root;
//		while (true) {
//			if (data < parent.data) {
//				if (parent.left == null) {
//					parent.left = newNode;
//					return;
//				} else parent = parent.left;
//			} else {
//				if (parent.right == null) {
//					parent.right = newNode;
//					return;
//				} else parent = parent.right;
//			}
//		}
//	}
	
	// To add node recursively.
	public Node addNodeBST_Rec(Node myRoot, int data) {
		if (myRoot == null) {
			myRoot = new Node(data);
		} else if (data < myRoot.data) {
			myRoot.left = addNodeBST_Rec(myRoot.left, data);
		} else if (data > myRoot.data) {
			myRoot.right = addNodeBST_Rec(myRoot.right, data);
		}
		return myRoot;
	}

	/*
	// My implementation of BST.
	//To find a Node in the BST.
	public boolean searchValue(int data){
		Node parent = root;
		if (data == parent.data) return true;
		while (true){
			if (data< parent.data){
				if (parent.left==null) return false;
				else if (parent.left.data == data) return true;
				else parent = parent.left;
			}else{
				if (parent.right==null) return false;
				else if(parent.right.data==data) return true;
				else parent = parent.right;
			}
		}
	}
*/
	
	// Recursive Approach to find an element.
	public Node toFindRec(Node myRoot, int data) {
		
		// Simplest Case or Base Case
		if (myRoot == null || myRoot.data == data) return myRoot;
		
		
		if (data < myRoot.data) return toFindRec(myRoot.left, data);
		
		return toFindRec(myRoot.right, data);
	}
	
	// To delete a node from the BST
	public Node deleteNode(Node myRoot, int toDel) {
		if (myRoot == null) return null;
		else if (toDel < myRoot.data) myRoot.left = deleteNode(myRoot.left, toDel);
		else if (toDel > myRoot.data) myRoot.right = deleteNode(myRoot.right, toDel);
		else {
			// Leaf node
			if (myRoot.right == null && myRoot.left == null) {
				myRoot = null;
			} else if (myRoot.left == null) { // No left child
//				myRoot.data = myRoot.right.data;
//				myRoot.right = null;
//				myRoot = myRoot.right;
				return myRoot.right;
			} else if (myRoot.right == null) { // No right child
//				myRoot.data = myRoot.left.data;
//				myRoot.left = null;
//				myRoot = myRoot.left;
				return myRoot.left;
			} else { // Node has 2 children
				myRoot.data = minValF(myRoot.right); // This conserves the BST property.
				// We could also use the maximum value in the left subtree.
				myRoot.right = deleteNode(myRoot.right, myRoot.data); // Now we will be deleting the node
				// which will have that duplicate value.
			}
		}
		return myRoot;
	}
	
	// To find minimum value given the root of a BST.
	public int minValF(Node myRoot) {
		int minValue = myRoot.data;
		while (myRoot.left != null) {
			myRoot = myRoot.left;
			minValue = myRoot.data;
		}
		return minValue;
	}
}
