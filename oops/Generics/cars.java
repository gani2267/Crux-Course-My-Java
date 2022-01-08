package oops.Generics;

public class cars implements Comparable<cars> { 
	//Comparable <T> is interface provided by java 
	
	int speed;
	int price; 
	String colour;
	
	public cars(int speed,int price,String colour) {
		this.speed=speed;
		this.colour=colour; 
		this.price=price;
	}
	
	@Override
	public String toString() {            //ye override object class ke method pe he
		return " S: "+this.speed + " P: "+this.price + " C: "+this.colour ;
	}
	
	@Override
	public int compareTo(cars other) {    
		//Comparable interface ka ek lote fxn ki body likh rahe he
		
		return this.speed-other.speed;     //on basis of speed
//		return this.price-other.price;     //on basis of price
//		return this.colour.compareTo(other.colour);    //string class ka direct use kiya fxn
	}
	
	
}
