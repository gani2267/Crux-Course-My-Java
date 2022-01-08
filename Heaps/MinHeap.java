package Heaps;

import java.util.ArrayList;

public class MinHeap {

	ArrayList<Integer> al = new ArrayList<>();

	public void add(int item) {
		al.add(item);
		upheapify(al.size() - 1);
	}

	private void upheapify(int ci) {
		
		if(ci == 0) {
			return ;
		}

		int pi = (ci - 1) / 2;
		
		if(al.get(ci) < al.get(pi)) {
			this.swap(ci, pi);
			upheapify(pi);
		}

	}

	private void swap(int i, int j) {
		int temp = al.get(i);
		al.set(i, al.get(j));
		al.set(j, temp);
	}
	
	public void display() {
		System.out.println(al);
	}
	
	public int size() {
		return this.al.size();
	}
	
	public boolean isEmpty() {
		return this.size()==0;
	}
	
	
	public int remove() {
		
		this.swap(0, al.size()-1);
		int ans = al.remove(al.size()-1);
		
		downheapify(0);
		
		return ans;
	}

	private void downheapify(int pi) {
		
		int ci1= 2*pi +1;
		int ci2= 2*pi +2;
		
		int mini=pi;
		
		if(ci1 < al.size() && al.get(ci1) <al.get(mini) ) {
			mini=ci1;
		}
		if(ci2 < al.size() && al.get(ci2) <al.get(mini) ) {
			mini=ci2;
		}
		
		if(mini != pi) {
			swap(mini,pi);
			downheapify(mini);
		}
		
	}
	
	public int get() {
		return al.get(0);
	}
}
