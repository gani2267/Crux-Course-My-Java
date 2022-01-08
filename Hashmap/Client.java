package Hashmap;

public class Client {
	
	public static void main(String[] args) throws Exception {
		
		HashTable<String, Integer> map= new HashTable<>(5);
		
		map.put("USA", 200);
		map.put("UK",175);
		map.put("China", 350);
		map.put("India", 300);
		map.display();
		
		map.put("Sweden", 100);
		map.display();
		
		map.put("India", 325);
		map.display();
	}

}
