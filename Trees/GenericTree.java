package Trees;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {
	
	private class Node{
		int data;
		ArrayList<Node>children;
		Node(int data){
			this.data=data;
			this.children =new ArrayList<>();
		}
	}
	
	private Node root;
	private int size;
	
	GenericTree(){
		Scanner sc=new Scanner(System.in);
		this.root=takeInput(sc, null, 0);
	}
	
	private Node takeInput(Scanner sc,Node Parent, int ithChild) {
		
		if(Parent == null) {
			System.out.print("Enter the data for the root node : ");
		}else {
			System.out.print("Enter the data for the "+ ithChild +"th child of "+ Parent.data+" : ");
		}
		
		int data=sc.nextInt();
		Node nn=new Node(data);                                          // nn = new node
		this.size++;
		
		System.out.print("Enter the number of children for " + nn.data+" : ");
		int noc=sc.nextInt();                                             // noc = number of children
		System.out.println();
		
		for(int i=0; i<noc; i++) {
			Node child=this.takeInput(sc, nn, i);
			nn.children.add(child);
		}
		
		return nn;
	}
	
	public void display() {
		this.display(this.root);
	}
	
	private void display(Node n) {
		String str=n.data+"=> ";
		
		for(int i=0; i<n.children.size(); i++) {
			str=str+n.children.get(i).data+", ";
		}
		str=str+"END";
		System.out.println(str);
		
		for(int i=0; i<n.children.size(); i++) {
			this.display(n.children.get(i));
		}
		
	}
	
	public int size() {
		return this.size;
	}
	
	public int sizeMethod2() {
		return size(this.root);
	}
	
	private int size(Node n) {
		
		int sum = 0;
		
		for(Node child : n.children) {
			int i=size(child);
			sum += i;
		}
		
		return sum+1;
	}
	
	
	public boolean find(int item) {
		return find(this.root,item);
	}

	private boolean find(Node n, int item) {
		// TODO Auto-generated method stub
		boolean bool = false;
		
		if(n.data == item) {
			return true;
		}else {
			int i=0;
			while(!bool && i<n.children.size()) {
				bool=find(n.children.get(i),item);
				i++;
			}
		}
		
		return bool;
	}
	
	
	public int max() {
		return max(this.root);
	}

	private int max(Node n) {
		
		int max=n.data;
		
		for(int i=0; i<n.children.size(); i++) {
			int a=max(n.children.get(i));
			if(a> max) {
				max = a;
			}
		}
		
		return max;
	}
	
	
	public int height() {
		return height(this.root);
	}

	private int height(Node n) {
		
		int h=-1;
		for(int i=0; i<n.children.size(); i++) {
			int a=height(n.children.get(i));
			if(a>h) {
				h=a;
			}
		}
		
		return h+1;
	}
	
	
	
}
