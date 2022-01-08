package CB_DSA_Practice;

import java.util.*;

class BinaryTree {

	int[] count = new int[10];
	int size;
	Node root;

	public void preOrder() {
		preOrder(this.root);
	}

	private void preOrder(Node r) {
		if (r == null) {
			return;
		}

		if (r.data != -1) {
			System.out.print(r.data + " ");
		}
		preOrder(r.left);
		preOrder(r.right);
	}

	BinaryTree() {
		Node r = new Node();
		this.root = r;
	}


	public void constructBst(int[] arr) {
		this.root= constructBst(arr,0,arr.length-1);
	}

	private Node constructBst(int[] arr, int lo, int hi) {
		
		if(lo > hi) {
			return null;
		}
		
		int mid= (lo+hi)/2;
		Node nn = new Node(arr[mid]);
		
		nn.left = this.constructBst(arr, lo, mid-1);
		nn.right= this.constructBst(arr, mid+1, hi);
		
		return nn;
	}
	
	public void add(int num) {
		this.add(num,this.root);
	}

	private void add(int num, Node r) {
		
		if(num <= r.data) {
			if(r.left != null) {
				this.add(num,r.left);
			}else {
				r.left = new Node(num);
			}
		}
		
		if(num > r.data) {
			if(r.right != null) {
				this.add(num, r.right);
			}else {
				r.right = new Node(num);
			}
		}
	}
}

class Node {
	int data = -1;
	Node left;
	Node right;
	
	Node(int d){
		this.data = d;
	}
	Node(){
		
	}
}

public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int t= scn.nextInt();
		for(int i=0; i<t; i++) {
			int n=scn.nextInt();
			
			BinaryTree bt= new BinaryTree();
			
			bt.root.data= scn.nextInt();
			
			
			for(int j=1; j<n; j++)
				bt.add(scn.nextInt());
			
			int k1=scn.nextInt();
			int k2=scn.nextInt();
			
			System.out.print("# Preorder : ");
			preOrder(bt.root);
			
			System.out.print("\n# Nodes within range are : ");
			inOrder(bt.root,k1,k2);
			
			
			System.out.println();
			
		}

	}
	private static void preOrder(Node root) {
		
		if(root == null) {
			return ;
		}
		
		System.out.print(root.data+" ");
		
		preOrder(root.left);
		preOrder(root.right);
		
	}
	static boolean bool=false;

	private static void inOrder(Node r, int k1, int k2) {
		
		if(r.left != null) {
			inOrder(r.left,k1,k2);
		}
		if(r.data == k1) {
			bool = true;
		}
		if(bool)
			System.out.print(r.data + " ");
		if(r.data == k2) {
			bool = false;
		}
		
		if(r.right != null) {
			inOrder(r.right,k1,k2);
		}
		
	}
	
	
	private static Node process(int[] arr, int ini, int fin) {

		if (fin < ini) {
			return null;
		}
		int mid = (ini + fin) / 2;
		Node p = new Node();
		p.data = arr[mid]; 
		p.left = process(arr, ini, mid - 1);
		p.right = process(arr, mid + 1, fin);

		return p;
	}

	static int j = 0;

	private static void give(int[] arr, int n, Node p) {

		if (j >= arr.length) {
			return;
		}
		if (n > 1) {
			p.left = new Node();
			p.right = new Node();
		}

		if (n > 0) {
			give(arr, n - 1, p.left);
			p.data = arr[j];
			j++;
			give(arr, n - 1, p.right);
		}

	}

}
