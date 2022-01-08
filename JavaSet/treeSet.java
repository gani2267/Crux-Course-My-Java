package JavaSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> trset = new TreeSet<>();
		
		trset.add(3);
		trset.add(1);
		trset.add(5);
		
		System.out.println(trset);
		
		SortedSet<Integer> set1 = trset.headSet(3);
		SortedSet<Integer> set2 = trset.headSet(3,true);
		SortedSet<Integer> set3 = trset.tailSet(3);
		SortedSet<Integer> set4 = trset.tailSet(3,false);
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		System.out.println(set4);
		
		System.out.println("========================");
		System.out.println(trset.pollFirst());
		System.out.println(trset);
 
	}

}
