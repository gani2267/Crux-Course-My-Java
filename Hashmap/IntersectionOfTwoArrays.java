package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		
		int[] arr1= {5,1,3,4,7};
		int[] arr2= {2,4,3,5,7,10,15};
		
		System.out.print(Intersection(arr1,arr2));  //this done in o(n)
	}
	
	public static ArrayList<Integer> Intersection(int[] a,int[] b) {
		
		HashMap<Integer,Integer> h=new HashMap<>();
		
		for(int i=0; i<a.length; i++) {
			if(!h.containsKey(a[i])) {
				h.put(a[i], 0);
			}
		}
		
		for(int i=0; i<b.length; i++) {
			if(h.containsKey(b[i])) {
				h.put(b[i], 1);
			}
		}
		
		ArrayList<Integer> al=new ArrayList<>();
		
		Set<Map.Entry<Integer,Integer>> m=h.entrySet();
		
		for(Map.Entry<Integer,Integer> i: m) {
			if(i.getValue()==1) {
				al.add(i.getKey());
			}
		}
		
		return al;
	}

}
