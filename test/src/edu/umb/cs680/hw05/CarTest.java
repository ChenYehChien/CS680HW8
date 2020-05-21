package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	private String[] carToStringArray(Car car) {
		String[] carInfo = {car.getMake(),
							car.getModel(),
							//Integer.toString(car.getMileage()),
							Integer.toString(car.getYear())
							//Float.toString(car.getPrice())
							};
		return carInfo;
	}
	
	@Test
	public void verifyCarEqualityWithMakeModelYear() {
		try {
			//int mileage = 100;
			//float price = 10000L;
			String[] expected = {"Toyota", "RAV4", "2018"};
			Car actual = new Car("Toyota", "RAV4", 100, 2018, 10000L);
			assertArrayEquals(expected, carToStringArray(actual));
		}
		catch(RuntimeException e) {
			fail();
		}
	}
	
}
