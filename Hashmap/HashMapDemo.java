package Hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
//		          key , value
		
		
		map.put("USA", 200);
		map.put("UK",175);
		map.put("China", 350);
		map.put("India", 300);
		System.out.println(map);
		
		map.put("Sweden", 100);
		System.out.println(map);
		
		//Updating value
		map.put("India", 325);
		System.out.println(map);
		
		System.out.println(map.get("India"));
		System.out.println(map.get("RSA"));
		
		System.out.println(map.remove("USA"));
		System.out.println(map);
		System.out.println(map.remove("USA"));
		System.out.println(map);
		
		System.out.println(map.containsKey("India"));
		System.out.println(map.containsKey("USA"));
		
		System.out.println("===================================");
		//only printing keys of hashmap
		Set<String> keys=map.keySet();
		System.out.print("Keys : ");
		for(String i : keys) {
			System.out.print(i+" ");
		}
		
		
		
		System.out.println("\n===================================");
		//only printing values of hashmap
		Collection<Integer> val=map.values();
		System.out.print("Values : ");
		for(int i : val) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n===================================");
		Set<Map.Entry<String, Integer>> entries=map.entrySet();
		
		for(Map.Entry<String, Integer>  i : entries) {
			System.out.println(i.getKey() + " -> " + i.getValue() );
		}
	}

}
