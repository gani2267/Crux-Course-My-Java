package oops.GenericClass;

import java.util.ArrayList;
import oops.Generics.car;

public class Client {

	public static void main(String[] args) {
		
		Pair<String> a=new Pair<>();
		a.var1="abc";
		a.var2="xyz";
		
		Pair2 <Integer,Character> b=new Pair2<>();
		b.var3=43;
		b.var4='h';
		
		Pair<Integer> c=new Pair<>();
		c.var1=32;
		c.var2=23;
		
		ArrayList<Integer> arr=new ArrayList<>();
		//ArrayList is also example of generic class 
		//Khol ke dekh lo ArrayList.Class ko
		
		LinkedListGeneric <car> list=new LinkedListGeneric<>();
		car[] cars=new car[5];
		cars[0]=new car(1000,400,"Red");
		cars[1]=new car(2000,200,"Yellow");
		cars[2]=new car(500,900,"Black");
		cars[3]=new car(300,30,"Grey");
		cars[4]=new car(700,60,"White"); 
		
		list.addLast(cars[0]);
		list.addLast(cars[1]);
		list.addLast(cars[2]);
		list.addLast(cars[3]);
		list.addLast(cars[4]);
		
		list.display();
		

	}

}
