package Trees;

public class BinaryTreeClient {

	public static void main(String[] args) {
		
		// 50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
		// 10 true 20 true 30 true 40 false false false false true 50 false true 60 false false
		//  5 true 4 false false true 6 false false 
		
		
		BinaryTree bt=new BinaryTree();
		bt.display();
		System.out.println("======================\n");
		
		System.out.println("Size is "+ bt.size());
		System.out.println("height is : " + bt.height());
		System.out.println("do 18 is present : "+ bt.find(18));
		System.out.println("do 12 is present : "+ bt.find(12));
		System.out.println("Max is : " + bt.max());
		
		System.out.println();
		System.out.print("Pre Order printing : ");
		bt.preOrder();
		System.out.print("END");
		
		System.out.print("\nPost Order printing : ");
		bt.postOrder();
		System.out.print("END");
		
		System.out.print("\nIn Order printing : ");
		bt.inOrder();
		System.out.print("END");
		
		System.out.print("\nLevel Order printing : ");
		bt.levelOrder();
		System.out.print("END");
		
		System.out.println();
		System.out.println();
		System.out.println("Given BT is BST (By Method 1) : " + bt.isBSTbyMethod1());
		System.out.println("Given BT is BST : " + bt.isBST());
		
		System.out.println("\nInOrder Iteratively : "+bt.inOrderIteratively());
		System.out.println("PreOrder Iteratively : "+bt.preOrderIteratively());
		System.out.println(bt.sumOfLeafNodes());
		
		
		System.out.println();
		System.out.println("Diameter : " + bt.diameterOfTree());
		System.out.println("Diameter by better code : " + bt.diamterBetterCode());
		
		System.out.println();
		System.out.println("Tree is balanced ? : " + bt.isBalanced());
		System.out.println("Tree is balanced by better code : " + bt.isBalancedBetterCode());
		
		System.out.println();
		System.out.println("Sum of all nodes : " + bt.sumOfAllNodes());
		
		// 10 true 20 true 40 true 2 false false true 3 false false true -60 false false true 30 true 50 true 60 true 80 false false false true 70 false false true -100 false false 
		System.out.println("max subtree sum : " + bt.maxSubTreeSum());
		System.out.println("max subtree sum by method 2 : " + bt.maxSubtreeSumMethod2());
		
	}
	
}
