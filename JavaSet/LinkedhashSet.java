package JavaSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhset = new LinkedHashSet<>();
		
		lhset.add(4);
		System.out.println(lhset.add(1));
		lhset.add(3);
		
		System.out.println(lhset.add(4));
		lhset.add(1);
		
		System.out.println(lhset);                // hashset are not indexed
		
		Iterator<Integer> it = lhset.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
