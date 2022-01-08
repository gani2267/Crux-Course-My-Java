package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GetMaxFrequency {

	public static void main(String[] args) {

		// Solve this question in O(n)

		String str = "aabbaaabcdda";

		HashMap<Character, Integer> h = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (!h.containsKey(str.charAt(i))) {
				h.put(str.charAt(i), 1);
			}else {
				int a=h.get(str.charAt(i));
				a++;
				h.put(str.charAt(i), a);
			}
		}
		
		System.out.println(h);
		
		Set<Map.Entry<Character, Integer>> y=h.entrySet();
		
		int max_Frequency=0;
		char ans_Char='0';
		
		for(Map.Entry<Character, Integer> i : y) {
			if(i.getValue()>=max_Frequency) {
				max_Frequency=i.getValue();
				ans_Char=i.getKey();
			}
		}
		
		System.out.println(max_Frequency);
		System.out.println("Corresponding character : "+ ans_Char);
	}

}
