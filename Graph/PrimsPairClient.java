package Graph;

public class PrimsPairClient {

	public static void main(String[] args) {
		
		Graph graph = new Graph();
		
		for(char ch='A'; ch<='G'; ch++) {
			graph.addVertex(ch+"");
		}
		
		graph.addEdge("A", "B", 2);
		graph.addEdge("A", "D", 6);
		graph.addEdge("B", "C", 3);
		graph.addEdge("C", "D", 1);
		graph.addEdge("D", "E", 8);
		graph.addEdge("E", "F", 5);
		graph.addEdge("F", "G", 4);
		graph.addEdge("E", "G", 7 );
		
		graph.display();
		
		graph.prims().display();

	}

}
