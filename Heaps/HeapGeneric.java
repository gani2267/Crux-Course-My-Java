package Heaps;

import java.util.ArrayList;

public class HeapGeneric<T extends Comparable<T>> {

	ArrayList<T> al = new ArrayList<>();

	public void add(T item) {
		al.add(item);
		upheapify(al.size() - 1);
	}

	private void upheapify(int ci) {
		
		if(ci == 0) {
			return ;
		}

		int pi = (ci - 1) / 2;
		
		if(isLarger(al.get(ci), al.get(pi)) > 0) {
			this.swap(ci, pi);
			upheapify(pi);
		}

	}

	private void swap(int i, int j) {
		T temp = al.get(i);
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
	
	
	public T remove() {
		
		this.swap(0, al.size()-1);
		T ans = al.remove(al.size()-1);
		
		downheapify(0);
		
		return ans;
	}

	private void downheapify(int pi) {
		
		int ci1= 2*pi +1;
		int ci2= 2*pi +2;
		
		int mini=pi;
		
		if(ci1 < al.size() &&  isLarger(al.get(ci1) , al.get(mini)) > 0 ) {
			mini=ci1;
		}
		if(ci2 < al.size() && isLarger(al.get(ci2) , al.get(mini)) > 0 ) {
			mini=ci2;
		}
		
		if(mini != pi) {
			swap(mini,pi);
			downheapify(mini);
		}
		
	}
	
	public T get() {
		return al.get(0);
	}
	
	// if t is having higher priority then return positive value
	public int isLarger(T t , T o) {
		return t.compareTo(o);
	}
}
