package Hashmap;

import java.lang.Math;

public class HashTable<K, V> {

	private class HTPair<K, V> {
		K key;
		V value;

		HTPair(K key, V value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public boolean equals(Object other) {
			HTPair op = (HTPair) other;
			return this.key.equals(op.key);
		}

		@Override
		public String toString() {
			return "{" + this.key + "-" + this.value + "}";
		}

	}

	public static final int Default_Capacity = 10;

	private LinkedList<HTPair>[] bucketArray;
	private int size=0;

	public HashTable() {
		this(Default_Capacity);
	}

	public HashTable(int capacity) {
		this.bucketArray = (LinkedList<HTPair>[]) new LinkedList[capacity];
		this.size = 0;
	}

	//O(n)
	public void put(K key, V value) throws Exception {
		int bi = hashFunction(key);
		LinkedList<HTPair> bucket = this.bucketArray[bi];
		HTPair pta = new HTPair(key, value);                     //pta pair to be added
 
		if (bucket == null) {
			bucket = new LinkedList<>();
			bucket.addLast(pta);
			this.bucketArray[bi]=bucket;
			this.size++;
		} else {
			int findAt= bucket.find(pta);         //O(n)
			
			if(findAt==-1) {
				bucket.addLast(pta);
				this.size++;
			}else {
				HTPair pair=bucket.getAt(findAt);          //O(n)
				pair.value=value;
			}
		}
	}

	//O(1)
	private int hashFunction(K key) {
		int hc = key.hashCode();
		hc=Math.abs(hc);
		int bi = hc % this.bucketArray.length;
		return bi;
	}
	
	
	public void display() {
		
		for(LinkedList<HTPair> bucket : this.bucketArray) {
			if(bucket != null && !bucket.isEmpty()) {
				bucket.display();
			}else {
				System.out.println("NULL");
			}
		}
		
		System.out.println("-------------------------------------");
	}
	

}
