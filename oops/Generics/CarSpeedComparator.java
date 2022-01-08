package oops.Generics;

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<car> {

	@Override
	public int compare(car a,car b) {
		// TODO Auto-generated method stub
		return a.speed-b.speed;
	}
	
}
