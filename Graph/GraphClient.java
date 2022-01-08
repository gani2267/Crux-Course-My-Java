package Graph;

public class GraphClient {

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
		
		System.out.println("Num of vertex : " + graph.numVertex());
		System.out.println("Num of edges : " + graph.numEdges());
		
		System.out.println(graph.containsEdge("A", "C"));
		System.out.println(graph.containsEdge("E", "F"));
		
		graph.removeEdge("A", "B");
		graph.display();
		
		graph.removeVertex("F");
		graph.display();
		
		graph.addVertex("F");
		graph.display();
		
		graph.addEdge("F", "A", 10);
		graph.display();
		
	}

}
