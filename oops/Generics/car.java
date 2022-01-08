package oops.Generics;

public class car {
	int speed;
	int price; 
	String colour; 
	
	public car(int speed,int price,String colour) {
		this.speed=speed;
		this.colour=colour;
		this.price=price;
	}
	
	@Override
	public String toString() {            //ye override object class ke method pe he
		return " S: "+this.speed + " P: "+this.price + " C: "+this.colour ;
	}

}
