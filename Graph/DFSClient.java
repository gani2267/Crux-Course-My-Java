package Graph;

public class DFSClient {

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
		
		graph1.display();
		
		System.out.println(graph1.DFS("A", "F"));
		System.out.println(graph1.BFS("A", "F"));
		
		Graph graph2 = new Graph();
		
		for(char ch='A'; ch<='H'; ch++) {
			if(ch=='B') {
				continue;
			}
			graph2.addVertex(ch+"");
		}
		
		graph2.addEdge("A", "H", 3);
		graph2.addEdge("A", "D", 2);
		graph2.addEdge("H", "C", 4);
		graph2.addEdge("C", "D", 7);
		graph2.addEdge("D", "E", 10);
		graph2.addEdge("E", "F", 9);
		graph2.addEdge("F", "G", 6);
		graph2.addEdge("E", "G", 8);
		
		graph2.display();
		System.out.println(graph2.DFS("A", "F"));
		System.out.println(graph2.BFS("A", "F"));
	}

}
