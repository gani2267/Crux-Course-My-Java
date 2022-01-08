package oops.Generics;

import java.util.Comparator;

public class CarColourComparator implements Comparator<car>{

	@Override
	public int compare(car o1, car o2) {
		// TODO Auto-generated method stub
		return (o1.colour).compareTo(o2.colour);
	}

}
