package ArrayList;

import java.util.ArrayList;

public class ArrayListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(10);
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(20);
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(30);
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(40);
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(50);
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println("==========================\n");
		
		System.out.println(list.get(0));
		System.out.println(list.get(2));
//		System.out.println(list.get(5));  //index out of bound exception
		
		System.out.println("==========================\n");
		System.out.println(list.get(3));
		list.remove(3);
		System.out.println(list.get(3));
		System.out.println(list);
		System.out.println(list.size());

	}

}