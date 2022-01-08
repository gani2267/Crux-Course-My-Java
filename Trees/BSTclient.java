package Trees;

public class BSTclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int [] arr = {10,20,30,40,50,60,70};
		BST b=new BST(arr);
		
		b.display();
		System.out.println(b.find(30));
		System.out.println(b.find(35));
		
		System.out.println("Max : " + b.max());
		
		//adding
//		System.out.println("\n ============================ \n");
//		b.add(55);
//		b.display();
//		
//		System.out.println("\n ============================ \n");
//		b.add(40);
//		b.display();
		
		//removing
//		System.out.println("\n ============================ \n");
//		b.remove(55);
//		b.display();
//		
//		System.out.println("\n ============================ \n");
//		b.remove(40);
//		b.display();
//		
//		System.out.println("\n ============================ \n");
//		b.remove(40);
//		b.display();
//		
//		System.out.println("\n ============================ \n");
//		b.remove(100);
//		b.display();
	}

}
