package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Graph {

	private class Vertex {
		HashMap<String, Integer> nbrs = new HashMap<>(); // nbrs is neighbours
	}

	// Vertex ke related
	HashMap<String, Vertex> vtces; // vtces is vertices i.e. vertexes

	public Graph() {
		vtces = new HashMap<>();
	}

	public int numVertex() {
		return this.vtces.size();
	}

	public void addVertex(String vname) {
		vtces.put(vname, new Vertex());
	}

	public void removeVertex(String vname) {

		Vertex vert = vtces.get(vname);

		ArrayList<String> neighbours = new ArrayList<>(vert.nbrs.keySet());

		for (String i : neighbours) {
			this.removeEdge(i, vname);
		}

		vtces.remove(vname);
	}

	public boolean containsVertex(String vname) {
		return vtces.containsKey(vname);
	}

	// Edges ke related
	public int numEdges() {

		ArrayList<String> keys = new ArrayList<>(vtces.keySet());
		int sum = 0;
		for (String i : keys) {
			sum += vtces.get(i).nbrs.size();
		}

		return sum / 2;
	}

	public boolean containsEdge(String vname1, String vname2) {

		Vertex vert1 = vtces.get(vname1);
		Vertex vert2 = vtces.get(vname2);

		if (vert1 == null || vert2 == null) {
			return false;
		}

		boolean a = vert1.nbrs.containsKey(vname2);

		return a;
	}

	public void addEdge(String vname1, String vname2, int cost) {

		Vertex vert1 = vtces.get(vname1);
		Vertex vert2 = vtces.get(vname2);

		if (vert1 == null || vert2 == null || vert1.nbrs.containsKey(vname2)) {
			return;
		}

		vert1.nbrs.put(vname2, cost);
		vert2.nbrs.put(vname1, cost);

	}

	public void removeEdge(String vname1, String vname2) {

		Vertex vert1 = vtces.get(vname1);
		Vertex vert2 = vtces.get(vname2);

		if (vert1 == null || vert2 == null || !vert1.nbrs.containsKey(vname2)) {
			return;
		}

		vert1.nbrs.remove(vname2);
		vert2.nbrs.remove(vname1);

	}

	public void display() {

		System.out.println("----------------------------------------");
		ArrayList<String> keys = new ArrayList<>(vtces.keySet());

		for (String i : keys) {

			Vertex vert = vtces.get(i);
			System.out.println(i + " : " + vert.nbrs);
		}

		System.out.println("----------------------------------------");
	}

	public boolean hasPath(String from, String to, HashMap<String, Boolean> processed) {

		processed.put(from, true);

		// direct edge check
		if (this.containsEdge(from, to)) {
			return true;
		}

		Vertex vert = vtces.get(from);
		ArrayList<String> neighbours = new ArrayList<>(vert.nbrs.keySet());

		for (String i : neighbours) {
			if (!processed.containsKey(i) && hasPath(i, to, processed)) {
				return true;
			}
		}

		return false;
	}

	private class Pair {
		String vname;
		String pfs;                //position from source
	}

	public boolean BFS(String src, String destination) {

		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> q = new LinkedList<>();

		Pair p = new Pair();
		p.vname = src;
		p.pfs = src;

		q.addLast(p);

		while (!q.isEmpty()) {

			Pair rp = q.removeFirst();

			if (processed.containsKey(rp.vname)) {
				continue;
			}

			processed.put(rp.vname, true);

			if (containsEdge(rp.vname, destination)) {
				System.out.println(rp.pfs + destination);
				return true;
			}

			Vertex vert = vtces.get(rp.vname);
			ArrayList<String> neighbours = new ArrayList<>(vert.nbrs.keySet());

			for (String i : neighbours) {

				if (!processed.containsKey(i)) {
					Pair np = new Pair();
					np.vname = i;
					np.pfs = rp.pfs + i;

					q.addLast(np);
				}
			}
		}

		return false;
	}

	public boolean DFS(String src, String destination) {

		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> stack = new LinkedList<>();

		Pair p = new Pair();
		p.vname = src;
		p.pfs = src;

		stack.addFirst(p);

		while (!stack.isEmpty()) {

			Pair rp = stack.removeFirst();

			if (processed.containsKey(rp.vname)) {
				continue;
			}

			processed.put(rp.vname, true);

			if (containsEdge(rp.vname, destination)) {
				System.out.println(rp.pfs + destination);
				return true;
			}

			Vertex vert = vtces.get(rp.vname);
			ArrayList<String> neighbours = new ArrayList<>(vert.nbrs.keySet());

			for (String i : neighbours) {

				if (!processed.containsKey(i)) {
					Pair np = new Pair();
					np.vname = i;
					np.pfs = rp.pfs + i;

					stack.addFirst(np);
				}
			}
		}

		return false;
	}

	public void BFT() {
		
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> q = new LinkedList<>();

		ArrayList<String> keys = new ArrayList<>(vtces.keySet());

		for (String s : keys) {
			
			if(processed.containsKey(s)) {
				continue;
			}
			
			Pair p = new Pair();
			p.vname = s;
			p.pfs = s;

			q.addLast(p);

			while (!q.isEmpty()) {

				Pair rp = q.removeFirst();

				if (processed.containsKey(rp.vname)) {
					continue;
				}

				processed.put(rp.vname, true);

				System.out.println(rp.vname + " via " + rp.pfs);

				Vertex vert = vtces.get(rp.vname);
				ArrayList<String> neighbours = new ArrayList<>(vert.nbrs.keySet());

				for (String i : neighbours) {

					if (!processed.containsKey(i)) {
						Pair np = new Pair();
						np.vname = i;
						np.pfs = rp.pfs + i;

						q.addLast(np);
					}
				}
			}

		}
	}
	
	public void DFT() {
		
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> stack = new LinkedList<>();

		ArrayList<String> keys = new ArrayList<>(vtces.keySet());

		for (String s : keys) {
			
			if(processed.containsKey(s)) {
				continue;
			}
			
			Pair p = new Pair();
			p.vname = s;
			p.pfs = s;

			stack.addFirst(p);

			while (!stack.isEmpty()) {

				Pair rp = stack.removeFirst();

				if (processed.containsKey(rp.vname)) {
					continue;
				}

				processed.put(rp.vname, true);

				System.out.println(rp.vname + " via " + rp.pfs);

				Vertex vert = vtces.get(rp.vname);
				ArrayList<String> neighbours = new ArrayList<>(vert.nbrs.keySet());

				for (String i : neighbours) {

					if (!processed.containsKey(i)) {
						Pair np = new Pair();
						np.vname = i;
						np.pfs = rp.pfs + i;

						stack.addFirst(np);
					}
				}
			}

		}
	}

    public boolean isCyclic() {
		
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> q = new LinkedList<>();

		ArrayList<String> keys = new ArrayList<>(vtces.keySet());

		for (String s : keys) {
			
			if(processed.containsKey(s)) {
				continue;
			}
			
			Pair p = new Pair();
			p.vname = s;
			p.pfs = s;

			q.addLast(p);

			while (!q.isEmpty()) {

				Pair rp = q.removeFirst();

				if (processed.containsKey(rp.vname)) {
					return true;
				}

				processed.put(rp.vname, true);

				Vertex vert = vtces.get(rp.vname);
				ArrayList<String> neighbours = new ArrayList<>(vert.nbrs.keySet());

				for (String i : neighbours) {

					if (!processed.containsKey(i)) {
						Pair np = new Pair();
						np.vname = i;
						np.pfs = rp.pfs + i;

						q.addLast(np);
					}
				}
			}
		}
		return false;
	}
    
    
    public boolean isConnected() {
		
    	int flag = 0;
    	
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> q = new LinkedList<>();

		ArrayList<String> keys = new ArrayList<>(vtces.keySet());

		for (String s : keys) {
			
			if(processed.containsKey(s)) {
				continue;
			}
			
			flag++;
			
			Pair p = new Pair();
			p.vname = s;
			p.pfs = s;

			q.addLast(p);

			while (!q.isEmpty()) {

				Pair rp = q.removeFirst();

				if (processed.containsKey(rp.vname)) {
					continue;
				}

				processed.put(rp.vname, true);

				Vertex vert = vtces.get(rp.vname);
				ArrayList<String> neighbours = new ArrayList<>(vert.nbrs.keySet());

				for (String i : neighbours) {

					if (!processed.containsKey(i)) {
						Pair np = new Pair();
						np.vname = i;
						np.pfs = rp.pfs + i;

						q.addLast(np);
					}
				}
			}

		}
		
		if(flag>=2) {
			return false;
		}else {
			return true;
		}
	}
	
    
    public boolean isTree() {
    	return  !isCyclic() && isConnected();
    }
    
    
    public ArrayList<ArrayList<String>> getConnectedComponents() {
		
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> q = new LinkedList<>();

		ArrayList<String> keys = new ArrayList<>(vtces.keySet());
		
		ArrayList<ArrayList<String>> ans=new ArrayList<>();

		for (String s : keys) {
			
			if(processed.containsKey(s)) {
				continue;
			}
			
			Pair p = new Pair();
			p.vname = s;
			p.pfs = s;
			
			ArrayList<String> subAns=new ArrayList<>();
			q.addLast(p);

			while (!q.isEmpty()) {

				Pair rp = q.removeFirst();

				if (processed.containsKey(rp.vname)) {
					continue;
				}

				processed.put(rp.vname, true);

				subAns.add(rp.vname);

				Vertex vert = vtces.get(rp.vname);
				ArrayList<String> neighbours = new ArrayList<>(vert.nbrs.keySet());

				for (String i : neighbours) {

					if (!processed.containsKey(i)) {
						Pair np = new Pair();
						np.vname = i;
						np.pfs = rp.pfs + i;

						q.addLast(np);
					}
				}
			}
			
			ans.add(subAns);
		}
		
		return ans;
		}
    
    
    // Prims Algorithm
    private class PrimsPair implements Comparable<PrimsPair>{
    	String vname;
    	String acqvame;
    	int cost;
    	
		@Override
		public int compareTo(PrimsPair o) {
			
			return o.cost-this.cost;
		}
    }
    
    public Graph prims() {
    	
    	Graph mst = new Graph();
    	HashMap<String, PrimsPair> map = new HashMap<>();
    	
    	HeapGeneric<PrimsPair> heap = new HeapGeneric<>();
    	
    	//make a pair and put in heap and hashmap
    	for(String key : vtces.keySet()) {
    		
    		PrimsPair np = new PrimsPair();
    		np.vname = key;
    		np.acqvame = null;
    		np.cost = Integer.MAX_VALUE;
    		
    		heap.add(np);
    		map.put(key, np);
    	}
    	
    	//till the heap is not empty keep on removing the pairs
    	while( !heap.isEmpty()) {
    		
    		//remove a pair
    		PrimsPair rp = heap.remove();
    		map.remove(rp.vname);
    		
    		//add to mst
    		if(rp.acqvame == null) {
    			mst.addVertex(rp.vname);
    		}else {
    			mst.addVertex(rp.vname);
    			mst.addEdge(rp.vname, rp.acqvame, rp.cost);
    		}
    		
    		//nbrs
    		for(String nbr : vtces.get(rp.vname).nbrs.keySet()) {
    			
    			//work for nbrs which are in heap
    			if(map.containsKey(nbr)) {
    				
    				// get the oc and nc
    				int oc = map.get(nbr).cost;                  //old cost
    				int nc = vtces.get(rp.vname).nbrs.get(nbr);  //new cost
    				
    				//update neighbours if  nc < oc
    				if(nc < oc) {
    					PrimsPair gp = map.get(nbr);
    					gp.acqvame = rp.vname;
    					gp.cost = nc;
    					
    					heap.updatePriority(gp);
    				}
    			}
    		}
    		
    	}
    		
    		
    		
    	return mst;
    }
    
    
    
}
