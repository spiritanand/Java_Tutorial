package BT;
import D8_BT.D8_BinaryTree;
import D8_BT.Node;

public class BT_Main {
	public static void main(String[] args){
		Node tree = D8_BinaryTree.createTree();
		D8_BinaryTree.inOrder(tree);
	}
}
