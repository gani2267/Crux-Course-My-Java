package Trees;

public class BST {

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BST(int[] arr) {

		this.root = construct(arr, 0, arr.length - 1);
	}

	private Node construct(int[] arr, int lo, int hi) {

		// base case
		if (lo > hi) {
			return null;
		}

		int mid = (lo + hi) / 2;

		Node nn = new Node();
		nn.data = arr[mid];

		nn.left = construct(arr, lo, mid - 1);
		nn.right = construct(arr, mid + 1, hi);

		return nn;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node n) {

		if (n == null) {
			return;
		}

		String str = "";

		if (n.left == null) {
			str += ".";
		} else {
			str += n.left.data;
		}

		str += " -> " + n.data + " <- ";

		if (n.right == null) {
			str += ".";
		} else {
			str += n.right.data;
		}

		System.out.println(str);

		display(n.left);
		display(n.right);
	}

	public boolean find(int num) {
		return this.find(num, this.root);
	}

	private boolean find(int num, Node n) {

		if (n == null) {
			return false;
		}

		if (num == n.data) {
			return true;
		} else if (num < n.data) {
			return find(num, n.left);
		} else {
			return find(num, n.right);
		}

	}

	public int max() {
		return this.max(this.root);
	}

	private int max(Node n) {

		if (n.right == null) {
			return n.data;
		}

		return max(n.right);
	}

	public void add(int num) {
		this.add(num, this.root);
	}

	private void add(int num, Node n) {

		if (num <= n.data) {
			if (n.left != null) {
				add(num, n.left);
			} else {
				Node nn = new Node();
				nn.data = num;

				n.left = nn;
			}
		}

		if (num > n.data) {
			if (n.right != null) {
				add(num, n.right);
			} else {
				Node nn = new Node();
				nn.data = num;

				n.right = nn;
			}
		}
	}
	
	public void remove(int num) throws Exception {
		this.remove(num , this.root, null ,false );
	}

	//ilc = is left child
	private void remove(int num, Node n, Node parent, boolean ilc) throws Exception {      //ilc = is left child
		
		if(n == null) {
			throw new Exception("Num not present");
		}
		
		if(num < n.data) {
			remove(num, n.left , n, true);
		}else if(num > n.data) {
			remove(num , n.right , n, false);
		}else {
			
			if(n.left == null && n.right == null) {
				if(ilc) {
					parent.left=null;
				}else {
					parent.right=null;
				}
			}
			
			if(n.left == null && n.right != null) {
				if(ilc) {
					parent.left =n.right;
				}else {
					parent.right= n.right;
				}
			}
			
			if(n.left != null && n.right == null) {
				if(ilc) {
					parent.left =n.left;
				}else {
					parent.right= n.left;
				}
			}
			
			if(n.left !=null && n.right != null) {
				
				int max = max(n.left);
				n.data = max;
				this.remove(max, n.left, n, true);
				
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
