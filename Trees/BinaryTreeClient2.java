package Trees;

public class BinaryTreeClient2 {

	public static void main(String[] args) {
		
		int[] preOrder= {10,20,40,30,50,60,70};
		int[] inOrder= {40,20,10,50,30,60,70};
		
		BinaryTree bt=new BinaryTree(preOrder,inOrder);
		bt.display();

	}

}
