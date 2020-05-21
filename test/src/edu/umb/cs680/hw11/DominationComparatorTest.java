package edu.umb.cs680.hw11;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw05.Car;

class DominationComparatorTest {
	private static Car A;
	private static Car B;
	private static Car C;
	private static Car D;
	private static Car E;
	private static ArrayList<Car> usedCars = new ArrayList<Car>();
	
	
	@BeforeAll
	public static void initialState()  {
		//set up car instances 
		A = new Car("Toyota", "RAV4", 300, 2018, 1000L);
		B = new Car("Toyota", "RAV4", 400, 2018, 2000L);
		C = new Car("Toyota", "RAV4", 500, 2018, 3000L);
		D = new Car("Toyota", "RAV4", 200, 2018, 2000L);
		E = new Car("Toyota", "RAV4", 100, 2018, 2000L);
		
		A.setDominationCount(0);
		B.setDominationCount(3);
		C.setDominationCount(4);
		D.setDominationCount(1);
		E.setDominationCount(0);
		
		usedCars.add(A);
		usedCars.add(B);
		usedCars.add(C);
		usedCars.add(D);
		usedCars.add(E);
	}
	
	
	@Test
	public void testDominationCount() {
		//take the car instances to compare with the sorted collection
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);
			
			Collections.sort(usedCars, new DominationComparator());
			for (Car c: usedCars) {
				System.out.print(c.getDominationCount());
			}
			String expected = "00134";
			assertEquals(expected, stream.toString());
		}
		catch (Exception e) {
			fail();
		}
	}

}
