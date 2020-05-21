package edu.umb.cs680.hw11;

import java.util.Comparator;
import edu.umb.cs680.hw05.Car;

public class DominationComparator implements Comparator<Car> {
	public int compare(Car car1, Car car2) {
		return car1.getDominationCount() - car2.getDominationCount();
	}
}