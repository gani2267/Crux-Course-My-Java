package Trees;

public class BinaryTreeFlipEquivalent {

	public static void main(String[] args) {
		
		
		// 1 true 2 true 4 false false true 5 true 7 false false true 8 false false true 3 true 6 false false false
		// 1 true 3 false true 6 false false true 2 true 4 false false true 5 true 8 false false true 7 false false
		BinaryTree bt=new BinaryTree();
		BinaryTree bt2=new BinaryTree();
		
		System.out.println("Flip Equivalent : "+ bt.flipEquivalent(bt2));

	}

}
