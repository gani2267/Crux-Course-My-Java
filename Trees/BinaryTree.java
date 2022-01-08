package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTree {
	
	private class Node{
		int data;
		Node left;
		Node right;
		
		Node(){
			
		}
		
		Node(int data, Node left,Node right){
			this.data=data;
			this.left=left;
			this.right=right;
		}
	}
	
	private Node root;
	private int size;
	private int max;
	
	BinaryTree(){
		Scanner sc=new Scanner(System.in);
		this.root=takeInput(sc,null,false);
	}
	
	private Node takeInput(Scanner sc,Node parent,boolean isLeft) {
		
		if(parent == null) {
			System.out.print("Enter the data for the root node : ");
		}else {
			
			if(isLeft) {
				System.out.print("Enter left child of "+ parent.data + " : ");
			}else {
				System.out.print("Enter right child of "+ parent.data + " : ");
			}
		}
		
		int data=sc.nextInt();
		System.out.println();
		Node nn=new Node(data,null,null);
		this.size++;
		
		boolean bool;
		System.out.print("Do BT have left child of " + nn.data +" : ");
		bool=sc.nextBoolean();
		System.out.println();
		
		if(bool) {
			nn.left = takeInput(sc, nn , true);
		}
		
		System.out.print("Do BT have right child of " + nn.data +" : ");
		bool=sc.nextBoolean();
		System.out.println();
		
		if(bool) {
			nn.right = takeInput(sc, nn, false);
		}
		return nn;
	}
	
	public void display() {
		this.display(this.root);
	}
	
	private void display(Node n) {
		
		String str="";
		
		if(n.left != null) {
			str = str+ n.left.data+"=>";
		}else {
			str = str+"END=>";
		}
		str=str+ n.data+"";

		if(n.right != null) {
			str = str+ "<=" +n.right.data;
		}else {
			str = str+"<=END";
		}
		
		
		System.out.println(str);
		if(n.left != null) {
			this.display(n.left);
		}
		
		if(n.right != null) {
			this.display(n.right);
		}
		
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean find(int n) {
		return this.find(this.root,n);
	}

	private boolean find(Node r, int n) {
		
		if(r.data == n) {
			return true;
		}else {
			boolean b1=false;
			boolean b2=false;
			if(r.left != null) {
				b1=find(r.left,n);
			}
			if(r.right != null) {
				b2=find(r.right,n);
			}
			return b1 || b2;
		}
	}
	
	public int max() {
		return this.max(this.root);
	}

	private int max(Node r) {
		
		if(r == null) {
			return Integer.MIN_VALUE;
		}
		
		int ls=max(r.left);
		int hs=max(r.right);
		
		return Math.max(Math.max(ls, hs),r.data);
	}

	public int height() {
		return this.height(this.root);
	}
	
	private int height(Node n) {
		
		if(n == null) {
			return -1;
		}
		
		int left= this.height(n.left);
		int right= this.height(n.right);
		
		return 1 + Math.max(left, right);
	}
	
	public void preOrder() {
		this.preOrder(this.root);
	}
	
	private void preOrder(Node n) {
		
		if(n == null) {
			return ;
		}
		
		System.out.print(n.data + ", ");
		
		preOrder(n.left);
		preOrder(n.right);
	}
	
	public void postOrder() {
		this.postOrder(this.root);
	}
	
	private void postOrder(Node n) {
		
		if(n == null) {
			return ;
		}
		
		postOrder(n.left);
		postOrder(n.right);
		
		System.out.print(n.data + ", ");
	}
	
	
	public void inOrder() {
		this.inOrder(this.root);
	}
	
	private void inOrder(Node n) {
		
		if(n == null) {
			return;
		}
		
		inOrder(n.left);
		System.out.print(n.data + ", ");
		inOrder(n.right);
	}
	
	
	public void levelOrder() {
		
		LinkedList<Node> ll= new LinkedList<>();
		ll.add(this.root);
		
		while( ! ll.isEmpty()) {
			Node rv= ll.removeFirst();
			System.out.print(rv.data + ", ");
			
			if(rv.left != null) {
				ll.addLast(rv.left);
			}
			
			if(rv.right != null) {
				ll.addLast(rv.right);
			}
		}
		
	}
	
	
	
	public boolean isBSTbyMethod1() {
		ArrayList<Integer> al=new ArrayList<>();
		
		isBSTbyMethod1(this.root, al);
		for(int i=0; i<al.size()-1; i++) {
			if(al.get(i+1) < al.get(i)) {
				return false;
			}
		}
		
		return true;
	}

	private void isBSTbyMethod1(Node n, ArrayList<Integer> al) {
		
		if(n==null) {
			return ;
		}
		
		isBSTbyMethod1(n.left, al);
		al.add(n.data);
		isBSTbyMethod1(n.right, al);
		
	}
	
	
	public boolean isBST() {
		return this.isBST(this.root, Integer.MIN_VALUE ,Integer.MAX_VALUE);
	}

	private boolean isBST(Node n, int min, int max) {
		
		if(n == null) {
			return true;
		}
		
		if(n.data > max || n.data < min) {
			return false;
		}
		
		boolean a=this.isBST(n.left, min, n.data);
		boolean b=this.isBST(n.right, n.data, max);
		
		return a&b;
	}
	
	public ArrayList<Integer> inOrderIteratively() {
		return this.inOrderIteratively(this.root);
	}

	private ArrayList<Integer> inOrderIteratively(Node n) {
		
		Stack<Node> si=new Stack<>();
		ArrayList<Integer> al=new ArrayList<>();
		
		while(true) {
			if(n != null) {
				si.push(n);
				n = n.left;
			}else {
				
				if(si.isEmpty()) {
					break;
				}
				
				n=si.pop();
				al.add(n.data);
				n=n.right;
			}
		}
		
		return al;
	}
	
	class yo{
		Node node;
		boolean sd;                   //self done
		boolean ld;                   //left done
		boolean rd;                   //right done
	}
	
	public ArrayList<Integer> preOrderIteratively() {
		return this.preOrderIteratively(this.root);
	}
	
	// ye niche jo code diya he isika useme thode change karke ham postOrder , InOrder bana sakta he
	private ArrayList<Integer> preOrderIteratively(Node n) {
		
		Stack<yo> st=new Stack<>();
		ArrayList<Integer> al=new ArrayList<>();
		
		yo ny=new yo();
		ny.node=n;
		st.push(ny);
		
		while(! st.isEmpty()) {
			
			yo a=st.peek();
			
			if(a.node==null) {
				st.pop();
				continue;
			}
			
			if(!a.sd) {
				al.add(a.node.data);
				a.sd=true;
			}else if(!a.ld) {
				
				yo l=new yo();
				l.node=a.node.left;
				st.push(l);
				a.ld=true;
			}else if(!a.rd) {
				
				yo r=new yo();
				r.node=a.node.right;
				st.push(r);
				a.rd=true;
			}else {
				st.pop();
			}
		}
		
		return al;
	}

	public int sumOfLeafNodes() {
		return this.sumOfLeafNodes(this.root,0);
	}

	private int sumOfLeafNodes(Node n,int sum) {
		
		if(n==null) {
			return 0;
		}
		
		if(n.left==null && n.right== null) {
			return n.data;
		}
		
		sum = sum + sumOfLeafNodes(n.left, 0);
		sum = sum + sumOfLeafNodes(n.right, 0);
		
		return sum;
	}

	// O(n^2)
	public int diameterOfTree() {
		return this.diameterOfTree(this.root);
	}

	// O(n^2)
	private int diameterOfTree(Node n) {
		// TODO Auto-generated method stub
		
		if(n==null) {
			return 0;
		}
		
		int a= this.height(n.left)+1;
		int b= this.height(n.right)+1;
		
		int case1=a+b;                     //diameter passes through n node
		int case2=diameterOfTree(n.left);
		int case3=diameterOfTree(n.right);
		
		return Math.max(case1,Math.max(case2, case3));
	}
	
	
	private class diaPair{
		int height;
		int diameter;
		
		diaPair(){
			
		}
		
		diaPair(int height,int diameter){
			this.height = height;
			this.diameter = diameter;
		}
	}
	
	// O(n)
	public int diamterBetterCode() {
		return this.diamterBetterCode(this.root).diameter;
	}
	
	// O(n)
	private diaPair diamterBetterCode(Node n) {
		
		if(n== null) {
			diaPair bp=new diaPair(-1 , 0);
			return bp;
		}
		
		diaPair lp= this.diamterBetterCode(n.left);
		diaPair rp= this.diamterBetterCode(n.right);
		
		diaPair mp= new diaPair();
		mp.height= Math.max(lp.height, rp.height)+1;
		mp.diameter= Math.max(lp.height+rp.height+2, Math.max(lp.diameter, rp.diameter));
		
		return mp;
	}
	
	//O(n^2)
	public boolean isBalanced() {
		return this.isBalanced(this.root);
	}
	
	//O(n^2)
	private boolean isBalanced(Node r) {
		
		if(r == null) {
			return true;
		}
		boolean b1=isBalanced(r.left);
		boolean b2=isBalanced(r.right);
		boolean b3=false;
		int h=this.height(r.left)-this.height(r.right);
		if(h>=-1 && h<=1) {
			b3=true;
		}
				
		return b1 && b2 && b3;
	}
	
	private class balPair{
		int height;
		boolean isBalanced;
		
		balPair() {
			// TODO Auto-generated constructor stub
		}
		
		balPair(int h,boolean b){
			this.height=h;
			this.isBalanced=b;
		}
	}
	
	//O(n)
	public boolean isBalancedBetterCode() {
		return this.isBalancedBetterCode(this.root).isBalanced;
	}

	//O(n)
	private balPair isBalancedBetterCode(Node r) {
		
		if(r==null) {
			balPair nb=new balPair(-1, true);
			return nb;
		}
		
		balPair lb=isBalancedBetterCode(r.left);
		balPair rb=isBalancedBetterCode(r.right);
		
		int h=lb.height-rb.height;
		
		balPair nb=new balPair();
		nb.height=Math.max(lb.height, rb.height)+1;
		nb.isBalanced=false;
		if(lb.isBalanced && rb.isBalanced && h>=-1 && h<=1) {
			nb.isBalanced=true;
		}
		
		return nb;
	}
	
	public boolean flipEquivalent(BinaryTree other) {
		return flipEquivalent(this.root,other.root);
	}

	private boolean flipEquivalent(Node n1, Node n2) {
		
		if(n1==null && n2==null) {
			return true;
		}
		
		if(n1==null || n2==null) {
			return false;
		}
		
		if(n1.data != n2.data) {
			return false;
		}
		
		boolean b1=flipEquivalent(n1.left,n2.left);
		boolean b2=flipEquivalent(n1.left,n2.right);
		boolean b=b1 || b2;
		
		if(b1) {
			boolean c=flipEquivalent(n1.right,n2.right);
			return c && b1;
		}
		if(b2) {
			boolean c=flipEquivalent(n1.right,n2.left);
			return c && b2;
		}
		
		return b;
	}
	
	public int sumOfAllNodes() {
		return this.sumOfAllNodes(this.root);
	}

	private int sumOfAllNodes(Node r) {
		
		if(r==null) {
			return 0;
		}
		
		int s1=sumOfAllNodes(r.left);
		int s2=sumOfAllNodes(r.right);
		
		return r.data+s1+s2;
	}
	
	public int maxSubTreeSum() {
		max=Integer.MIN_VALUE;
		int b = this.maxSubTreeSum(this.root);
		return max;
	}

	private int maxSubTreeSum(Node r) {
		
		if(r == null) {
			return 0;
		}
		
		int s1=maxSubTreeSum(r.left);
		int s2=maxSubTreeSum(r.right);
		int s3=s1+s2+r.data;
		
		if(s3>max) {
			max=s3;
		}
		
		return s3;
	}
	
	class subtree{
		int maxSubtreeSum;
		int subtreeSum;
	}
	
	public int maxSubtreeSumMethod2() {
		return this.maxSubtreeSumMethod2(this.root).maxSubtreeSum;
	}

	private subtree maxSubtreeSumMethod2(Node r) {
		
		if(r==null) {
			subtree st=new subtree();
			st.maxSubtreeSum=Integer.MIN_VALUE;
			st.subtreeSum=0;
			return st;
		}
		
		subtree lt=maxSubtreeSumMethod2(r.left);
		subtree rt=maxSubtreeSumMethod2(r.right);
		
		subtree st=new subtree();
		st.subtreeSum=lt.subtreeSum+rt.subtreeSum+r.data;
		st.maxSubtreeSum=Math.max(st.subtreeSum, Math.max(lt.maxSubtreeSum, rt.maxSubtreeSum));
		
		return st;
	}
	
	public BinaryTree(int[] preOrder, int[] inOrder) {
		this.root = this.construct(preOrder,0,preOrder.length-1 ,inOrder,0,inOrder.length-1);
	}

	private Node construct(int[] preOrder, int plo,int phi , int[] inOrder, int ilo,int ihi) {
		
		//recursive call
		if(plo > phi || ilo > ihi) {
			return null;
		}
		
		//creat node
		Node nn=new Node();
		nn.data=preOrder[plo];
		
		//searching preOrder[0] in inOrder
		int searchIndex = -1;
		int nel=0;                        //num of element
		for(int i=ilo ; i<=ihi; i++) {
			if(preOrder[plo] == inOrder[i]) {
				searchIndex=i;
				break;
			}
			nel++;
		}
		
		nn.left=construct(preOrder,plo+1 , plo+nel , inOrder , ilo , searchIndex-1);
		nn.right=construct(preOrder,plo+nel+1 , phi , inOrder , searchIndex+1 , ihi);
		
		return nn;
	}
	
	
}
