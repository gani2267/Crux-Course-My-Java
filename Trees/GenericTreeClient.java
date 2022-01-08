package Trees;

public class GenericTreeClient {

	public static void main(String[] args) {
		
		// 60 3 41 2 17 0 16 0 15 1 21 0 24 2 33 0 84 0
		// 10 3 20 2 50 0 60 0 30 0 40 1 70 0
		
		GenericTree g=new GenericTree();
		g.display();
		
		System.out.println();
		System.out.println("Size of tree : "+ g.size());
		System.out.println("Size of tree by garima mam's method : "+ g.sizeMethod2());
		
		System.out.println();
		System.out.println("Do 70 is Present in g : "+ g.find(70));
		System.out.println("Do 25 is Present in g : "+ g.find(25));
		
		System.out.println();
		System.out.println("Max in g is : " + g.max());
		System.out.println("Height of g is : " + g.height());
		
	}

}
