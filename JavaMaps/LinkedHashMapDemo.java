package JavaMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
		
		map.put(17, "Tanmay Bhatt");
		map.put(2, "Kenny");
		map.put(1, "Kevin Heart");
		
		System.out.println(map);
		System.out.println(map.entrySet());
		System.out.println(map.size());
		System.out.println(map.containsValue("Kenny"));
		System.out.println(map.containsKey(4));
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println("======================");
		System.out.println(map.remove(1));
		System.out.println(map);
		map.put(1, "Kevin Heart");
		System.out.println(map);
		
		map.put(1, "King");
		System.out.println(map);
		System.out.println(map.compute(1, (key,val)->"Gorila"));         //Lambda he said i don't know that concept now
		System.out.println(map);
		
	}

}
