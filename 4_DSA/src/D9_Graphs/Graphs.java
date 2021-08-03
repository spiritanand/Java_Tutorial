// Here we will be discussing unidirectional unweighted Graph. The Graph is implemented using a Adjacency
// List which stores the nodes in a Linked List.

package D9_Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graphs {
	
	protected final LinkedList<Integer>[] adjList;
	
	public Graphs(int v) {
		adjList = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adjList[i] = new LinkedList<Integer>();
		}
	}
	
	public static void main(String[] args) {
		int v = 6; // Number of vertices
		Graphs g1 = new Graphs(v);
//		System.out.println("Enter the number of vertices and edges:- ");
		int e = 5; // Number of edges
		g1.addEdge(0, 1);
//		g1.addEdge(0, 3);
		g1.addEdge(0, 4);
//		g1.addEdge(3, 1);
		g1.addEdge(2, 1);
		g1.addEdge(4, 5);
		g1.addEdge(2, 5);
		// Here I have not taken any input from the user but you can feel free to edit the code and take
		// input from the user for this. Not inputting the edges always saves time during testing. Hence, I
		// have gone with this approach.
		
		int distance = g1.BFS(0, 5);
		System.out.println("The shortest distance is:- " + distance);
		
		boolean pathExists = g1.DFS_Rec(5, 0);
		System.out.println("Path exists:- " + pathExists);
		
		boolean pathExistStack = g1.DFS(2, 5);
		System.out.println("Path exists:- " + pathExistStack);
		
	}
	
	public void addEdge(int source, int destination) {
		adjList[source].add(destination);
		adjList[destination].add(source);
	}
	
	// Returns shortest distance between source and destination. BFS always gives the shortest path from a
	// source to a destination. Time Complexity of this method is O(|V|), where |V| -> Number of vertices.
	public int BFS(int source, int destination) {
		boolean found = false;
		int dist = 0;
		boolean[] vis = new boolean[adjList.length];
		int[] parent = new int[adjList.length];
		Queue<Integer> q = new LinkedList<>();
		q.add(source);
		vis[source] = true;
		parent[source] = -1;
		while (!q.isEmpty()) {
			int cur = q.poll();
			if (cur == destination) {
				found = true;
				break;
			}
			for (int neighbour : adjList[cur]) {
				if (!vis[neighbour]) {
					q.add(neighbour);
					parent[neighbour] = cur;
					vis[neighbour] = true;
				}
			}
		}
		if (found) {
			int cur = destination;
			System.out.println("The shortest path is as follows:- ");
			while (parent[cur] != -1) {
				System.out.print(cur + " -> ");
				cur = parent[cur];
				dist++;
			}
			System.out.print(source);
			System.out.println();
		} else {
			System.out.println("There exists no path between the source and the destination.");
			dist = Integer.MIN_VALUE;
		}
		
		return dist;
	}
	
	// Helper function of DFS_Rec
	private boolean DFS_Rec_Util(int source, int destination, boolean[] vis) {
		// Base Case
		if (source == destination) return true;
		
		// Recursive call to the neighbour of the vertex.
		for (int neighbour : adjList[source]) {
			if (!vis[neighbour]) {
				vis[neighbour] = true;
				boolean isConnected = DFS_Rec_Util(neighbour, destination, vis);
				if (isConnected) return true;
			}
		}
		return false;
	}
	
	// By DFS_Rec we can check if there exists a path between source and destination. It uses much less memory
	// than BFS.
	public boolean DFS_Rec(int source, int destination) {
		boolean[] vis = new boolean[adjList.length];
		vis[source] = true;
		return DFS_Rec_Util(source, destination, vis);
	}
	
	// Now lets implement DFS without any recursion. Stack is the data structure which we will be using to
	// implement it.
	public boolean DFS(int source, int destination) {
		boolean[] vis = new boolean[adjList.length];
		vis[source] = true;
		
		Stack<Integer> st = new Stack<>();
		st.push(source);
		
		while (!st.isEmpty()) {
			int cur = st.pop();
			if (cur == destination) return true;
			for (int neighbour : adjList[cur]) {
				if (!vis[neighbour]) {
					vis[neighbour] = true;
					st.push(neighbour);
				}
			}
		}
		return false;
	}
	
	// This method traverses the whole graph. This is a non recursive method and hence I have made use of
	// the stack data structure. It also shows every disconnected component on a different line.
	public void DFS_Traversal() {
		boolean[] vis = new boolean[adjList.length];
		if (adjList.length == 0) {
			System.out.println("No vertices in the graph.");
		}
		for (int i = 0; i < adjList.length; i++) {
			Stack<Integer> st = new Stack<>();
			if (!vis[i]) {
				st.push(i);
				vis[i] = true;
				while (!st.isEmpty()) {
					int vertex = st.pop();
					System.out.print(vertex + " ");
					LinkedList<Integer> neighbourList = adjList[vertex];
					for (int neighbour : neighbourList) {
						if (!vis[neighbour]) {
							st.push(neighbour);
							vis[neighbour] = true;
						}
					}
				}
				System.out.println();
			}
		}
	}
}
