package JavaMaps;

import java.util.TreeMap;

public class TreemapDemo {

	public static void main(String[] args) {
		
		TreeMap<String,String> map = new TreeMap<String, String>();
		
		map.put("aba", "shubham");
		map.put("aea", "saurav");
		map.put("aaa", "sohail");
		
		System.out.println(map);
		System.out.println(map.lastEntry());
		System.out.println(map.ceilingKey("aac"));   //key just greater than aac
		
		System.out.println(map.pollFirstEntry());
		map.put("aaa", "despacito");
		System.out.println("===================");
		
		System.out.println(map.subMap("aaa", true, "aca", false));
		System.out.println(map.subMap("aaa", "aca"));
		System.out.println(map.tailMap("aaa",false));
		System.out.println(map.tailMap("aaa",true));
	}

}
