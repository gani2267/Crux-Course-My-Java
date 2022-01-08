package JavaSet;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		
		HashSet<Integer> hset = new HashSet<>();
		
		hset.add(4);
		System.out.println(hset.add(1));
		hset.add(3);
		
		System.out.println(hset.add(4));
		hset.add(1);
		
		System.out.println(hset);                // hashset are not indexed
		
		Iterator<Integer> it = hset.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
