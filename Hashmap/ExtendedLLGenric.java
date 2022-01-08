package Hashmap;

public class ExtendedLLGenric<T> extends LinkedList<T> {
	
	
	//HashTable me use karne me dikkat aa rahi thi isiliye maine find function LinkedList me add kar diya
	public int find(T item) {
		
		int index=0;
		for(Node temp=super.head; temp!=null; temp=temp.next ) {
			if(temp.data.equals(item)) {
				return index;
			}
			index++;
		}
		
		return -1;
	}

}
