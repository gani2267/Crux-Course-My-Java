package oops.Generics;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<car> {

	@Override
	public int compare(car o1, car o2) {
		// TODO Auto-generated method stub
		return o1.price-o2.price;
	}
	
	

}
