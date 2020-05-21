package edu.umb.cs680.hw13.muticast;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class DJIAQuoteObservableTest {
	
	@Test
	public void verifyPiechartObserverWith100L() {
		DJIAQuoteObservable dObservable = new DJIAQuoteObservable();
		PiechartObserver piechartObserver = new PiechartObserver();
		dObservable.addObserver(piechartObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);

			DJIAEvent dEvent = new DJIAEvent(100L);
			dObservable.notifyObservers(dEvent);
			String expected = " Piechart : djia = 100.0";
			assertEquals(expected, stream.toString());
			
		}
		catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void verifyPiechartObserverWith200L() {
		DJIAQuoteObservable dObservable = new DJIAQuoteObservable();
		PiechartObserver piechartObserver = new PiechartObserver();
		dObservable.addObserver(piechartObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);

			DJIAEvent dEvent = new DJIAEvent(200L);
			dObservable.notifyObservers(dEvent);
			String expected = " Piechart : djia = 200.0";
			assertEquals(expected, stream.toString());
			
		}
		catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void verifyTableObserverWith100L() {
		DJIAQuoteObservable dObservable = new DJIAQuoteObservable();
		TableObserver tableObserver = new TableObserver();
		dObservable.addObserver(tableObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);

			DJIAEvent dEvent = new DJIAEvent(100L);
			dObservable.notifyObservers(dEvent);
			String expected = " Table : djia = 100.0";
			assertEquals(expected, stream.toString());
			
		}
		catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void verifyTableObserverWith200L() {
		DJIAQuoteObservable dObservable = new DJIAQuoteObservable();
		TableObserver tableObserver = new TableObserver();
		dObservable.addObserver(tableObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);

			DJIAEvent dEvent = new DJIAEvent(200L);
			dObservable.notifyObservers(dEvent);
			String expected = " Table : djia = 200.0";
			assertEquals(expected, stream.toString());
			
		}
		catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void verifyThreeDObserverWith100L() {
		DJIAQuoteObservable dObservable = new DJIAQuoteObservable();
		ThreeDObserver threeDObserver = new ThreeDObserver();
		dObservable.addObserver(threeDObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);

			DJIAEvent dEvent = new DJIAEvent(100L);
			dObservable.notifyObservers(dEvent);
			String expected = " 3D : djia = 100.0";
			assertEquals(expected, stream.toString());
			
		}
		catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void verifyThreeDObserverWith200L() {
		DJIAQuoteObservable dObservable = new DJIAQuoteObservable();
		ThreeDObserver threeDObserver = new ThreeDObserver();
		dObservable.addObserver(threeDObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);

			DJIAEvent dEvent = new DJIAEvent(200L);
			dObservable.notifyObservers(dEvent);
			String expected = " 3D : djia = 200.0";
			assertEquals(expected, stream.toString());
			
		}
		catch (Exception e) {
			fail();
		}
	}
	
}
