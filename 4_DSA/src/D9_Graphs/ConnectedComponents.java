package D9_Graphs;

// This class has 3 connected components. This class is to show what the DFS_Traversal method can do.
public class ConnectedComponents {
	public static void main(String[] args){
		Graphs g2 = new Graphs(8);
		g2.addEdge(0,1);
		g2.addEdge(0,2);
		g2.addEdge(2,7);
		g2.addEdge(4,5);
		g2.addEdge(4,6);
		g2.DFS_Traversal();
	}
}
