package edu.umb.cs680.hw11;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw05.Car;

class MileageComparatorTest {
	
	@Test
	public void testMileageComparator() {
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);
			
			ArrayList<Car> usedCars = new ArrayList<Car>();
			usedCars.add(new Car("Toyota", "RAV4", 100, 2019, 1000L));
			usedCars.add(new Car("Toyota", "RAV4", 200, 2019, 1000L));
			usedCars.add(new Car("Toyota", "RAV4", 300, 2019, 1000L));
			Collections.sort(usedCars, new MileageComparator());
			for (Car c: usedCars) {
				System.out.print(c.getMileage());
			}
			String expected = "100200300";
			assertEquals(expected, stream.toString());
			
			
		}
		catch (Exception e) {
			fail();
		}
	}

}
