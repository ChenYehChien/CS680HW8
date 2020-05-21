package edu.umb.cs680.hw11;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw05.Car;

class PriceComparatorTest {
	
	@Test
	public void testPriceComparator() {
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);
			
			ArrayList<Car> usedCars = new ArrayList<Car>();
			usedCars.add(new Car("Toyota", "RAV4", 100, 2019, 1000L));
			usedCars.add(new Car("Toyota", "RAV4", 100, 2019, 2000L));
			usedCars.add(new Car("Toyota", "RAV4", 100, 2019, 3000L));
			Collections.sort(usedCars, new PriceComparator());
			for (Car c: usedCars) {
				System.out.print(c.getPrice());
			}
			String expected = "3000.02000.01000.0";
			assertEquals(expected, stream.toString());
			
			
		}
		catch (Exception e) {
			fail();
		}
	}

}
