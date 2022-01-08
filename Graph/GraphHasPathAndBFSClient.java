package Graph;

import java.util.HashMap;

public class GraphHasPathAndBFSClient {

	public static void main(String[] args) {
		
		Graph graph = new Graph();
		
		for(char ch='A'; ch<='G'; ch++) {
			graph.addVertex(ch+"");
		}
		
		graph.addEdge("A", "B", 3);
		graph.addEdge("A", "D", 2);
		graph.addEdge("B", "C", 4);
		graph.addEdge("C", "D", 7);
		graph.addEdge("D", "E", 10);
		graph.addEdge("E", "F", 9);
		graph.addEdge("F", "G", 6);
		graph.addEdge("E", "G", 8);
		
		graph.display();
		
		System.out.println(graph.hasPath("A","F",new HashMap<>()));
		System.out.println("----------------");
		System.out.println(graph.BFS("A", "F"));
		System.out.println("-----------------------------\n");
		
		graph.removeEdge("A", "D");
		System.out.println(graph.hasPath("A","F",new HashMap<>()));
		System.out.println("----------------");
		System.out.println(graph.BFS("A", "F"));
		System.out.println("-----------------------------\n");
		
		
		graph.removeEdge("D", "E");
		System.out.println(graph.hasPath("A","F",new HashMap<>()));
		System.out.println(graph.BFS("A", "F"));
	}

}
