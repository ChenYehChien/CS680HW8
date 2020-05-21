package edu.umb.cs680.hw11;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw05.Car;

class YearComparatorTest {
	
	@Test
	public void testYearComparator() {
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);
			
			ArrayList<Car> usedCars = new ArrayList<Car>();
			usedCars.add(new Car("Toyota", "RAV4", 100, 2018, 1000L));
			usedCars.add(new Car("Toyota", "RAV4", 100, 2019, 1000L));
			usedCars.add(new Car("Toyota", "RAV4", 100, 2020, 1000L));
			Collections.sort(usedCars, new YearComparator());
			for (Car c: usedCars) {
				System.out.print(c.getYear());
			}
			String expected = "202020192018";
			assertEquals(expected, stream.toString());
			
			
		}
		catch (Exception e) {
			fail();
		}
	}

}
