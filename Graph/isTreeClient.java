package Graph;

public class isTreeClient {

	public static void main(String[] args) {
		
		Graph graph1 = new Graph();
		
		for(char ch='A'; ch<='G'; ch++) {
			graph1.addVertex(ch+"");
		}
		
		graph1.addEdge("A", "B", 3);
		graph1.addEdge("A", "D", 2);
		graph1.addEdge("B", "C", 4);
		graph1.addEdge("C", "D", 7);
		graph1.addEdge("D", "E", 10);
		graph1.addEdge("E", "F", 9);
		graph1.addEdge("F", "G", 6);
		graph1.addEdge("E", "G", 8);
		
		System.out.println(graph1.isTree());
		
		graph1.removeEdge("B", "C");
		graph1.removeEdge("F", "G");
		System.out.println(graph1.isTree());
		
	}
	
}
